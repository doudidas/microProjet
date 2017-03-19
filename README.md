# microProjet

##Présentation

Projet java réalisé dans le cadre de la spécialisation DSI de télécom SudParis.


## Installation

* Crée un compte GitHub (ou récupère ton ancien compte de l'époque du projet C) à l'adresse suivante : [Inscription/Connexion GithHub](https://github.com/login)

* déplace toi dans le dossier qui va acceuillir le projet (un dossier microProjet va etre crée)
> Exemple : `cd ~/workspace`

Pour créer un dossier `mkdir nomDuDossier`
* S'assurer que git est présent sur ta machine avec notamment `git --version`. si ce n'est pas le cas, ton mac va te demander d'installer "Command Line Tools for OS X" ( ça pèse 4Go =/)
* Une fois git en place il suffit de faire `git clone https://github.com/doudidas/microProjet.git`
(cela va copier l'intégralité du projet sur ton ordi).
    * Git risque de te demander un pseudo et un mot de passe, il faut entrer les éléments qui correspond à ton compte GitHub
 
 
 Félicitation tout est prêt !
 
 
 # Comment utiliser git
 
## Principe

git marche selon un systeme simple de pull/request. un projet peut etre séparé en différentes versions évoluant en parallèle que l'on appelle des branch.
Dans notre cas nous allons travailler sur une seule branch "master".

GitHub va garder une version spécifique de notre code à un etat donnée (disons la version V1). Lorsque tu effectues un clone tu copies la version V1 sur ton ordinateur.
A partir du moment où tu modifies le code sur ton ordinateur il passe en version V1.1, si je le modifie sur mon ordinateur il devient V1.a.
Le but est de toujours se référer à une version le plus à jour possible.

## Commandes

### Au debut
 La première chose à faire avant même de commencer à modifier ton projet est de faire un pull : `git pull`.
Cette commande permet de récuperer les modifications présentes sur GitHub et les fusionner avec ta version.(Tu auras donc la dernière version à jour !)

### Après avoir fait des modifications
Après avoir effectué des modifications/ajout/suppression, tu dois mettre à jour la version en ligne pour qu'elle comporte tes modifications.
Pour cela tu dois faire un commit.

1. Selectionne tout les elements modifiés de ton projet avec `git add --all` (tu peux selectionner un par un avec `git add ficher1 ficher2 ficher3` etc..)
2. Tu dois ensuite rajouter une description à ton commit `git commit -m 'blablabalblab'`
3. tu envoies tes modifications pour mettre à jour la verison en ligne `git push`

### Erreur ? 

Tu peux avoir une erreur si tu push une version V1.1 issue de la version V1, si la version en ligne est V2 ( par exemple V1 que j'ai modifié juste avant toi =p).
Dans ce cas tu dois un `git pull` pour fusionner ta version V1.1 avec la verison V2.

### Conflits

`CONFLICT (content): Merge conflict in <fileName> Automatic merge failed; fix conflicts and then commit the result.`

Il se peut que les modifications de la version V2 rentrent en conflit avec tes modifications sur V1.1.
Dans ce cas tu dois vérifier les fichiers qu'il t'indique et choisir ce qui doit etre gardé et ce qui doit etre enlevé.

## Auteurs
Imane El Bagdouri et Edouard Topin