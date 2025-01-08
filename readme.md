# Brief 15 - Création application gestion de bibliothèque

## Entity
![Entity](documents/Entity.PNG "Entity")

## Repository
![Repository](documents/Repository.PNG "Repository")

## Exemple de relation entre Entity

![Relation1](documents/Relation1.PNG "Relation1")

![Relation2](documents/Relation2.PNG "Relation2")

## Tables

![Tables](documents/Tables.PNG "Tables")

## Fonctionnalités disponibles

Creation emprumt
![Creation emprumt](documents/creation_emprunt.PNG "Creation emprumt")

Retour emprumt
![Retour emprumt](documents/retour_emprunt.PNG "Retour emprumt")

## Gestion disponibilité des livres
La gestion de la disponibilité des livres est effectuée au niveau du service. Lors de la création d'un emprunt, la disponibilité du livre est mise à jour pour indiquer qu'il n'est plus disponible (disponible = false). Lorsque le livre est retourné, sa disponibilité est rétablie (disponible = true).