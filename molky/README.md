# molky

## Hypothèse départ
Minimum 2 joueurs.
12 quilles numéroté de 1 à 12 et une boule de lancer.

## Rules

### order
Le joueur qui commence est cela qui à le moins de points.
Exemple : 
Joueur 1 a 12 points
Joueur 2 a 8 points
Joueur 3 a 14 points
Joueur 4 a 16 points

Ordre : Joueur 2, Joueur 1, Joueur 3 et Joueur 4

Au début, nombre de points est à 0 => ordre entré des joueurs

Si deux joueurs ont le même nombre de points, c'est l'ordre du tour précédent.
Exemple : 
Tour X
Joueur 1 est à 18 points
Joueur 2 est à 17 points

Ordre : Joueur 2, Joueur 1

Tour X+1
Joueur 1 est à 21 points
Joueur 2 est à 21 points

Ordre : Joueur 2, Joueur 1
 
### gestion des points
Si je fais tomber 1 quille : je gagne le numéro en nombre de points
Sinon le nombre de points = au nombre de quilles.

Exemple : 
Joueur 1 lance et fait tomber la quille 10 : Joueur 1 gagne 10 points.
Joueur 2 lance et fait tomber 4 quilles (1, 5 , 2, 12) : Joueur 2 gagne 4 points.

### victoire / défaite
Si score > 50, le score revient à 25.

exemple : Joueur 1 est à 49, Joueur 1 a gagné 2 points 
=> Joueur 1 a 51 points 
=> Joueur 1 revient à 25 points.

Si le score = 50, le joueur gagne.
Si 3 lancées à 0 points consécutifs : joueur perd.

