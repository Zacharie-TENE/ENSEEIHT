/* ********************************************************
 * MiniProjet 
 * ********************************************************/
% TENE FOGANG Zacharie Igor
% Groupe L4
% 2024-2025

:- include(libtp2).

/* MODELE BASIQUE */

/*B1,B2 ont été ajouté pour la comparaison demandée dans le sujet dans la partie contrainte redondante*/
solve(Num, Xs, Ys, B1,B2) :-
    data(Num, T, Ts),
    length(Ts, N),
    length(Xs, N),
    length(Ys, N),
    domaine(T, Ts, Xs),                 
    domaine(T, Ts, Ys),                  
    absence_chevauchement(Xs, Ys, Ts),
    fd_labeling(Xs, [backtracks(B1)]),
    fd_labeling(Ys,[backtracks(B2)]),
    printsol('file.txt', Xs, Ys, Ts).

domaine(_, [], []).
domaine(T, [Ti|Tis], [Xi|Xis]) :-
    Max is T - Ti,
    fd_domain(Xi, 0, Max),
    %Xi in 0..Max%
    domaine(T, Tis, Xis).

/*verification  du non-chevauchement des paires de carrés*/
absence_chevauchement([], [], []).
absence_chevauchement([X1|Xs], [Y1|Ys], [T1|Ts]) :-
    no_overlap(X1, Y1, T1, Xs, Ys, Ts),
    absence_chevauchement(Xs, Ys, Ts).

/*verification du non-chevauchement d'un carré avec tous les autres*/
no_overlap(_, _, _, [], [], []).
no_overlap(X1, Y1, T1, [X2|Xs], [Y2|Ys], [T2|Ts]) :-
    X1 + T1 #=< X2 #\/ X2 + T2 #=< X1 #\/
    Y1 + T1 #=< Y2 #\/ Y2 + T2 #=< Y1,
    no_overlap(X1, Y1, T1, Xs, Ys, Ts).


/* CONTRAINTES REDONDANTES  */
solve_2(Num, Xs, Ys, B1, B2) :-
    data(Num, T, Ts),
    length(Ts, N),
    length(Xs, N),
    length(Ys, N),
    domaine(T, Ts, Xs),
    domaine(T, Ts, Ys),
    absence_chevauchement(Xs, Ys, Ts),
    contrainte_redondante(T, Ts, Xs, Ys),
    fd_labeling(Xs, [backtracks(B1)]),
    fd_labeling(Ys, [backtracks(B2)]),

    /*
     la somme des backtracks des deux appels à fd_labeling pour avoir une idée de la somme totales, 
    */
    B is B1 + B2,
    printsol('file2.txt', Xs, Ys, Ts).

/* predicats auxiliaires  */
contrainte_redondante(T, Ts, Xs, Ys) :-
    contrainte_verticale(0, T, Ts, Xs, Ys),
    contrainte_horizontale(0, T, Ts, Xs, Ys).

contrainte_verticale(V, T, _, _, _) :- 
    V >= T, !.
contrainte_verticale(V, T, Ts, Xs, Ys) :-
    somme_verticale(V, Ts, Xs, Ys, Sum),
    Sum #= T,
    V1 is V + 1,
    contrainte_verticale(V1, T, Ts, Xs, Ys).

contrainte_horizontale(H, T, _, _, _) :- 
    H >= T, !.
contrainte_horizontale(H, T, Ts, Xs, Ys) :-
    somme_horizontale(H, Ts, Xs, Ys, Sum),
    Sum #= T,
    H1 is H + 1,
    contrainte_horizontale(H1, T, Ts, Xs, Ys).

somme_verticale(V, Ts, Xs, Ys, Sum) :-
    somme_verticale_acc(V, Ts, Xs, Ys, 0, Sum).

somme_verticale_acc(_, [], [], [], Acc, Acc).
somme_verticale_acc(V, [T1|Ts], [X1|Xs], [Y1|Ys], Acc, Sum) :-
    /* Si la verticale V coupe le carré
      X1 =< V et V < X1 + T1 */
    C1 #<=> (X1 #=< V),
    C2 #<=> (V #< X1 + T1),
    Cut #<=> (C1 #/\ C2),
    Contrib #= Cut * T1,
    NewAcc #= Acc + Contrib,
    somme_verticale_acc(V, Ts, Xs, Ys, NewAcc, Sum).

somme_horizontale(H, Ts, Xs, Ys, Sum) :-
    somme_horizontale_acc(H, Ts, Xs, Ys, 0, Sum).

somme_horizontale_acc(_, [], [], [], Acc, Acc).
somme_horizontale_acc(H, [T1|Ts], [X1|Xs], [Y1|Ys], Acc, Sum) :-
    /* Si lhorizontale H coupe le carré
     Y1 =< H et H < Y1 + T1 */
    C1 #<=> (Y1 #=< H),
    C2 #<=> (H #< Y1 + T1),
    Cut #<=> (C1 #/\ C2),
    Contrib #= Cut * T1,
    NewAcc #= Acc + Contrib,
    somme_horizontale_acc(H, Ts, Xs, Ys, NewAcc, Sum).


/*Resultats apres ajout des contraintes redondantes*/
/*
 Pour la version sans contraintes redondantes, on constate que le nombre de backtracks sur Xs (B1) alterne entre 2 et 12, 
 et ce sont les backtracks sur les Ys(B2) qui varient de 0 à 11.
 Tandis que pour la version avec contraintes redondantes, Xs vaut 12 en moyenne et Ys continue de varier en croissant. 
 
 L'ajout de ces contraintes permet de mieux réduire l'espace de recherche et de trouver une solution plus rapidement.
 Cependant contrairement à ce qu’on pourrait attendre, le nombre total de backtracks est parfois plus grand avec 
 les contraintes redondantes. Cela s’explique par le fait que :

 On pourrait expliquer cela par le fait que les contraintes redondantes ajoutent de nouvelles relations entre les variables, 
 mais dans notre stratégie actuelle (fd_labeling(Xs) puis fd_labeling(Ys)), elles ne peuvent pas être pleinement exploitées 
 au moment du labelling des Xs, car les Ys ne sont pas encore instanciés.
*/


/* STRATEGIE DE RECHERCHE  */

/*
Goal a été ajouté dans le but de pouvoir preciser à l execution le but 
Goal  doit etre soit assign soit indomain
*/
solve_3(Num, Xs, Ys, B, NbSol, Goal) :-
    data(Num, T, Ts),
    length(Ts, N),
    length(Xs, N),
    length(Ys, N),
    domaine(T, Ts, Xs),
    domaine(T, Ts, Ys),
    absence_chevauchement(Xs, Ys, Ts),

    /* Les contraintes redondantes sont appliquées */   
    contrainte_redondante(T, Ts, Xs, Ys),  
             
    labeling(Xs, Ys, Goal, 
    minmin, B, NbSol),
    printsol('file3.txt',Xs,Ys,Ts).


/*Resultats de la strategie de recherche*/

/*
 Sur l'instance 2
    Pour le test de solve_3(2, Xs, Ys, B, NbSol, assign)  on a obtenu:
        Nombre de backtracks (B) = 805
        Nombre de solutions trouvées (NbSol) = 1

    Pour le test de solve_3(2, Xs, Ys, B, NbSol,indomain) on a obtenu: 
        Nombre de backtracks (B) = 9038
        Nombre de solutions trouvées (NbSol) = 17

 En comparant les deux résultats sur l'instance 2, on peut observer que la stratégie assign a nécessité
 moins de backtracks (805) que la stratégie indomain (9038) pour trouver une solution.

 On constate donc que la stratégie assign est donc plus efficace en termes de nombre de backtracks nécessaires pour 
 trouver une solution dans cette instance (et il semblerait également que ca soit le cas dans le cas géneral). 
 Cela pourrait s'expliquer à la façon dont la stratégie assign sélectionne dynamiquement les variables à affecter,
 ce qui peut amener à une exploration plus efficace de l'espace de recherche.
*/



/*PARTIE SYMETRIE*/

/*QUESTION 1 :  Symetries de permutation */
solve_4(Num, Xs, Ys, B, NbSol, Goal) :-
    data(Num, T, Ts),
    length(Ts, N),
    length(Xs, N),
    length(Ys, N),
    domaine(T, Ts, Xs),
    domaine(T, Ts, Ys),
    absence_chevauchement(Xs, Ys, Ts),
    contrainte_redondante(T, Ts, Xs, Ys),

    /* Briser symétries de permutation entre carrés de meme taille */  
    eliminer_symetrie_permutation(Ts, Xs, Ys),       
    labeling(Xs, Ys, Goal, minmin, B, NbSol),
    printsol('file4.txt',Xs,Ys,Ts).


/* Elimination des symétries de permutation , tri*/
eliminer_symetrie_permutation([_], [_], [_]).
eliminer_symetrie_permutation([T,Ti|Ts],[X,Xi|Xs], [Y,Yi|Ys]) :-
    (Ti #\= T) 
    #\/ (
      (Yi #< Y
    #\/ Xi #< X)
    #/\ Xi #=< X),
    eliminer_symetrie_permutation([Ti|Ts],[Xi|Xs], [Yi|Ys]).


/*Resultats apres rupture de la symetrie de permutation*/
 /*
Sur l'instance 1 : 
    Avant l'elimination de la symetrie de permutation, on avait : 
    "solve_4(1, Xs, Ys, B, NbSol,assign )."    B = 479 |   NbSol = 480  
    "solve_4(1, Xs, Ys, B, NbSol,indomain )."  B = 479 |   NbSol = 480  

 Strategie: assign, "solve_4(1,Xs,Ys,B,NbSol,assign)." : 
       Instance 1    :   B = 8         |   NbSol = 4 
       Instance 2    :   B = 29 902    |   NbSol = 10 216 

 Strategie: indomain , "solve_4(1,Xs,Ys,B,NbSol,indomain)." : 
       Instance 1    :   B = 9         |  NbSol = 4 
       Instance 2    :   B = 511 662   |  NbSol = 10 216 

Le nombre de solution qu'il reste pour la premiere solution apres rupture de la symetrie de permutation
est de 4 pour la premiere instance et 10 216 pour la deuxieme instance.

*/

/* QUESTION 2 : Symetries geometriques  */
solve_5(Num, Xs, Ys, B, NbSol, Goal) :-
    data(Num, T, Ts),
    length(Ts, N),
    length(Xs, N),
    length(Ys, N),
    domaine(T, Ts, Xs),
    domaine(T, Ts, Ys),
    absence_chevauchement(Xs, Ys, Ts),
    contrainte_redondante(T, Ts, Xs, Ys),

    eliminer_symetrie_permutation(Ts, Xs, Ys), 
    /* Elimination des symetries geometriques*/  
    eliminer_symetrie_geometrique(T,Ts, Xs, Ys),       
    labeling(Xs, Ys, Goal, minmin, B, NbSol),
    printsol('file5.txt',Xs,Ys,Ts).


/* Elimination des symétries geometriques */
eliminer_symetrie_geometrique(T, [T1|_], [X1|_], [Y1|_]) :-
    % Trouver le centre du plus grand carré
    CenterX #= X1 + T1 // 2,
    CenterY #= Y1 + T1 // 2,
    % Restreindre au quart inférieur gauche
    HalfT #= T // 2,
    CenterX #=< HalfT,
    CenterY #=< HalfT.


/*Resultats apres rupture de la symetrie geometrique uniquement*/
 /*
 Strategie: assign, "solve_5(1,Xs,Ys,B,NbSol,assign)." : 
       Instance 1  :   B = 2     |   NbSol = 1 
       Instance 2  :   B = 8554  |   NbSol = 2554 

 Strategie: indomain, "solve_5(1,Xs,Ys,B,NbSol,indomain)." : 
       Instance 1  :   B = 3          |  NbSol = 1 
       Instance 2  :   B = 155 606    |  NbSol = 2554 

 Le nombre de solution qu'il reste pour la premiere solution apres rupture des symetries (permutation et geometrique)
 est de 1 pour la premiere instance et 2554 pour la deuxieme instance.

*/
