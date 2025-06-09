

module type BRICK = sig
  type t
  type brick_type =
    | Classic                 (*brique classique, detruit au contact avec la balle*)
    | Reinforced of int      (* Nombre de coups qu'il faut pour detruire *)
    | Indestructible         (*impossible à detruire*)
    | Bonus of bonus_effect  (*type d'effet*)
    | Explosive              (*explose et detruit les briques adjacentes*)

  and bonus_effect =
    | Normal                (*pas d'effet*)
    | StretchPaddle       (*agrandit la raquette*)
    | ShrinkPaddle        (*retrecit la raquette*)
    | SpeedUpBall         (*accelere la balle*)          
    | SlowDownBall        (*ralentit la balle*)
    | ExtraLife           (*donne une vie supplementaire*)
    | RestoreLife         (*restaure le nombre de vie*)
    | MultiplyBall        (*multiplie le nombre de balles*)
    | ScoreBonus of int   (*donne un bonus de score*)

  (*Crée une brique à la position (x, y) avec une largeur et une hauteur données. health, value*)
  val create :  float * float -> float -> float -> int -> int -> brick_type -> t

 
  (*Retourne la position de la brique.*)
  val get_position : t -> float * float

  (*Retourne les dimensions de la brique.*)
  val get_dimensions : t -> float * float

    (*Retourne les limites de la brique.(coin supérieur gauche et coin inférieur droit.)*)
  val get_bounds : t -> (float * float) * (float * float) 

  (* Retourne le type de la brique. *)
  val get_type : t -> brick_type
  
 (*
   hit : t -> t option
   réduit les points de vie de la brique lors d'une collision
   Paramètre brick : t, la brique touchée
   Résultat : Some nouvelle_brique avec health décrémenté, 
              ou None si la brique est détruite
   Cas particulier : les briques Indestructible restent intactes
*)
  val hit : t -> t option


(*
   get_value : t -> int
   calcule les points gagnés pour la destruction de la brique
   Paramètre brick : t, la brique concernée
   Résultat : points de base * multiplicateur selon le type,
              0 si la brique n'est pas détruite
*)
  val get_value: t -> int


(*
   is_destroyed : t -> bool
   vérifie si une brique est détruite
   Paramètre brick : t, la brique à tester
   Résultat : true si health <= 0 (sauf Indestructible), false sinon
*)
  val is_destroyed : t -> bool

  (*
   check_collision : t -> float * float -> float -> bool
   vérifie si une balle est en collision avec la brique
   Paramètre brick : t, la brique à tester
   Paramètre (ball_x,ball_y) : float * float, position du centre de la balle
   Paramètre ball_radius : float, rayon de la balle (> 0)
   Résultat : true si collision, false sinon
   Utilise l'algorithme AABB avec un cercle
*)
  val check_collision : t -> float * float -> float -> bool

end


module Brick : BRICK = struct
  type brick_type =
    | Classic 
    | Reinforced of int
    | Indestructible
    | Bonus of bonus_effect
    | Explosive

  and bonus_effect =
    | Normal
    | StretchPaddle
    | ShrinkPaddle
    | SpeedUpBall
    | SlowDownBall
    | ExtraLife
    | RestoreLife
    | MultiplyBall
    | ScoreBonus of int



  type t = {
    position: float * float;   (* Position (x, y) de la brique *)
    width: float;              (* Largeur de la brique *)
    height: float;             (* Hauteur de la brique *)
    size: float * float;       (* Taille de la brique *) (* Largeur, Hauteur *)
    health: int;               (* Points de vie de la brique (nbre de fois qu il faut la toucher pour la detruire) *)
    value: int;                (* Points gagnés en détruisant cette brique *)
    brick_type: brick_type;    (* Type spécifique de la brique *)
  }
 
  let create (x, y) width height health value brick_type = {
    position = (x, y);
    width = width;
    height = height;
    size = (width, height);
    health = health;
    value = value;
    brick_type = brick_type;
  }

  let hit brick = 
    match brick.brick_type with
    | Indestructible -> Some brick
    | _ ->  Some { brick with health = (brick.health - 1)}


(* 
    let hit brick =
      match brick.brick_type with
      | Reinforced n ->
          let new_health = max 0 (brick.health - 1) in
          let new_brick = {
            brick with
            health = new_health;
            brick_type = if new_health = 0 then Classic else Reinforced n
          } in
          Some new_brick
      | _ -> Some { brick with health = max 0 (brick.health - 1) }
    
    let is_destroyed brick =
      Printf.printf "IS_DESTROYED: Type %s, Health %d\n"
        (match brick.brick_type with
        | Reinforced n -> Printf.sprintf "Reinforced(%d)" n
        | _ -> "Other")
        brick.health;
      flush stdout;
      match brick.brick_type with
      | Indestructible -> false
      | Reinforced _ -> brick.health = 0
      | _ -> brick.health <= 0 *)

  let is_destroyed brick =
            match brick.brick_type with
            | Indestructible -> false
            | _ -> brick.health <= 0

  let get_value brick =  
    (* Vérifie si la brique est détruite pour calculer les points *)
    if is_destroyed brick then 
        (* Récupère la valeur de base de la brique *)
        let base_value = brick.value in
        (* Applique un multiplicateur selon le type de brique *)
        let reinforced_value = 
          match brick.brick_type with
          | Reinforced hits -> base_value * hits
          | _ -> base_value
        in
        reinforced_value
      else
        (* Renvoie 0 point si la brique n'est pas détruite *)
        0


  let get_position brick = brick.position

  let get_dimensions brick = (brick.width, brick.height)

  let get_bounds brick =
    let (x, y) = brick.position in
    ((x, y), (x +. brick.width, y +. brick.height))

  let get_type brick = brick.brick_type

  (* Fonction de détection de collision utilisant l'algorithme AABB avec un cercle *)
  let check_collision brick (ball_x, ball_y) ball_radius=
    let ((bx1, by1), (bx2, by2)) = get_bounds brick in
    (* let (ball_x, ball_y) = Ball.get_position ball in
    let ball_radius = Ball.get_radius ball in *)
    
    (* Trouve le point le plus proche de la balle sur la brique *)
    let closest_x = max bx1 (min ball_x bx2) in
    let closest_y = max by1 (min ball_y by2) in
    
    (* Calcule la distance entre la balle et le point le plus proche *)
    let dx = ball_x -. closest_x in
    let dy = ball_y -. closest_y in
    let distance_squared = (dx *. dx) +. (dy *. dy) in
    
    (* Il y a collision si la distance est inférieure au rayon de la balle *)
    distance_squared <= (ball_radius *. ball_radius)

    

end

