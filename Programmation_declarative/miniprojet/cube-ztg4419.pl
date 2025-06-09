/* ********************************************************
 * MiniProjet 
 * ********************************************************/


/* Question  1*/
/**
* Définition des conditions initiales
*/

:- dynamic(on/2).
:- dynamic(move/2).
/* a sur b, b sur c, c sur la table */
on(a,b).
on(b,c).
on(c, table).



/* Question 2*/
/**
* Préconditions :
 * - Rien n'est posé sur A ou B (B peut avoir un objet dessus si c'est la table)
 *- A ne doit pas être B 
 *- A ne doit pas être la table
 *
 
* Postconditions :
*- A est sur B ( donc B n'est plus libre )
*- Le support (objet ou table) sur lequel A était posé devient libre
* 
*/


/* Question 3*/
/*  Pour vérifier si un objet X est différent de la table */
not_table(X) :- X \= table.

 /* X ne peut pas être Y */
not_equal(X, Y):- X \= Y.
   

/* Question 4 et 5*/
put_on(A, B) :- 
    not_table(A),
    \+ on(_, A),
    not_equal(A, B),
    (B == table; \+ on(_, B)),
    on(A, C), 

    retract(on(A, C)),
    assertz(on(A,B)), 
    assertz(move(A,B)).

/* Question 6: */
/* Résultats obtenus pour les requêtes suivantes : */

/* 1. put_on(a, table). 
   - Le cube 'a' est déplacé sur la table.
   - Un nouveau fait move(a, table) est ajouté.
*/

/* 2. put_on(c, a). 
   - Le cube 'c' n'est pas déplacé sur le cube 'a'. 
   - car b est sur c d'après les conditions initiales.
   - Aucun nouveau fait n'a été ajouté.
*/

/* 3. put_on(b, table), put_on(c, a). 
   - Le cube 'b' est déplacé sur la table.
   - Un nouveau fait move(b, table) est ajouté.
   - Ensuite, le cube 'c' est déplacé sur le cube 'a'.
   - Un nouveau fait move(c, a) a été ajouté.
*/


/* Question 7: */
clear(X):-
    (on(Y, X),         
    clear(Y),           
    put_on(Y, table),   
    clear(X));         
    \+ on(Y, X).        

/* si A est déjà sur B ne rien faire */
r_put_on(A, B) :-
    on(A, B), !.

r_put_on(A,B) :- 
    clear(B), 
    clear(A),  
    !, 
    put_on(A, B).
  

/* Question 8: */

/* 8a*/
achieve([]) :- 
    listing(move).
achieve([on(A,B)|R]) :- 
    r_put_on(A,B), 
    !,
    achieve(R).
 
/* 8b : 
 * Quand on exécute cette requête, cela ne fonctionne pas correctement car l'ordre des objectifs pose problème. Voici ce qui se passe:
 * 1. D'abord, on place 'a' sur 'c' (premier objectif atteint)
 * 2. Ensuite, on essaie de placer 'c' sur 'b', mais comme 'a' est sur 'c', il faut d'abord déplacer 'a'
 * 3. On déplace 'a' sur la table, ce qui défait notre premier objectif
 * 4. On place 'c' sur 'b'
 * 5. À la fin, 'a' est sur la table et 'c' est sur 'b', donc seul le deuxième objectif est satisfait et ke premier non
 *
 * Le résultat obtenu  montre bien ce problème:
 * move(a, table).
 * move(b, table).
 * move(a, c).
 * move(a, table).  <- Ici on annule le premier objectif
 * move(c, b).
 *
 * À la fin de l'exécution, 'a' n'est plus sur 'c'.
 */


/* 8c : 
 Pour résoudre ce problème, 
 il faut trier les objectifs de manière à construire la structure de bas en haut.  
 Si un cube X doit être placé sur un cube Y, et que Y doit être placé sur un autre cube Z, 
 alors il faut d'abord placer Y sur Z, puis X sur Y.   
 Une solution simple est de trier la liste des objectifs pour que les cubes qui doivent 
servir de support à d'autres cubes soient traités en premier. 
*/
/* Vérifie si un élément est dans une liste*/
est_dans(X, [X|_]).
est_dans(X, [_|T]) :- est_dans(X, T).

/* Ajoute un élément à la fin d'une liste */
ajouter_fin([], Element, [Element]).
ajouter_fin([H|T], Element, [H|R]) :- 
    ajouter_fin(T, Element, R).

/* Supprime un élément d'une liste */
supprimer(X, [X|T], T).
supprimer(X, [H|T], [H|R]) :- supprimer(X, T, R).


/* Vérifie si dans la liste des objectifs, un cube dépend d'un autre */
depend(A, B, [on(A, B)|_]).
depend(A, B, [on(A, X)|T]) :- depend(X, B, T).
depend(A, B, [_|T]) :- depend(A, B, T).

/* Vérifie qu'un objectif (on(X,Y)) n'a pas de dépendance avec les autres objectifs */
pas_de_dependance(on(X, Y), Objectifs) :-
    \+ (est_dans(on(Y, _), Objectifs)). 

/* Vérifie si l'objectif on(X,Y) doit être placé avant on(A,B) */
avant(on(X,Y), on(A,B), Objectfis) :- 
    Y = A ; 
    depend(A, Y, Objectfis).

trier([], []).
trier(Liste, [Premier|Reste]) :-
    /* Trouve un élément qui n'a pas de dépendance 
    ou qui doit être placé avant les autres */
    selection_meilleur(Premier, Liste, ListeRestante),
    trier(ListeRestante, Reste).

/* Sélectionne le meilleur objectif à traiter en premier */
selection_meilleur(Meilleur, Liste, ListeRestante) :-
    est_dans(Meilleur, Liste),
    pas_de_dependance(Meilleur, Liste),
    supprimer(Meilleur, Liste, ListeRestante).
selection_meilleur(Meilleur, Liste, ListeRestante) :-
    est_dans(on(X, Y), Liste),
    \+ pas_de_dependance(on(X, Y), Liste),
    trouve_base(on(X, Y), Liste, Meilleur),
    supprimer(Meilleur, Liste, ListeRestante).

/* Trouve l'objectif qui doit être à la base (sans dépendance) */
trouve_base(on(X, Y), Liste, on(A, B)) :-
    est_dans(on(A, B), Liste),
    pas_de_dependance(on(A, B), Liste).
trouve_base(on(X, Y), Liste, on(A, B)) :-
    est_dans(on(X, Y), Liste),
    est_dans(on(Y, Z), Liste),
    trouve_base(on(Y, Z), Liste, on(A, B)).


achieve2(Liste) :-
    trier(Liste, Resultat),
    achieve(Resultat).

/*
Lors de l'execution de achieve2([on(a,c), on(c,b)]), on obtient:

move(a, table).
move(b, table).
move(c, b).
move(a, c).

on a bien accompli les objectifs de achieve([on(a,c), on(c,b)]) sans mouvements inutles et redondants.
*/