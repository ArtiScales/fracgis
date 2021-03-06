## Changelog

##### 0.7 (30/03/2018)
- Network data : network can be loaded from node shapefile + link table in csv
- Add correlation network method (or sandbox)
- Network distance and mass can be choosen for correlation and local network methods
- Sampling ui has been enhanced for all network and vector methods
- Multifractal estimation : text export
- Java 9 support

##### 0.6.4 
- Local network : bad result when step resolution is larger than edge length
- Multi fractal raster box : error when the raster is not binary

##### 0.6.3 (26/09/2016)
- Add log window
- Add correlation for vector data (point geometry only)

##### 0.6.2 (16/09/2016)
- Multiradial : geometric sampling and log estimation
- Local network : small correction on the calculation
- Batch vector : remove radial method

##### 0.6.1 (15/09/2016)
- Points and lines vector data wasn't supported for Radial and MultiFracBox methods
- Dilation vector : better accuracy of the reference size

##### 0.6 (13/09/2016)
- Add wavelet multifractal method
- Set default scaling to geometric serie for all methods but radial
- Dilation raster : include first point
- CLI : add scaling option seq=arith|geom

##### 0.5.7 (07/04/2014)
- Ajout du format Ascii Grid
- Suppression des valeurs nulles pour estimation log

##### 0.5.6 (28/03/2014)
- Rasterisation : ajout mode pour polygone

##### 0.5.5 (17/03/2014)
- DirectEstimation : encore un problème avec les courbes croissantes
- Rasterisation : possibilité de rasteriser en niveau de gris
- Estimation multi fractal : optimisation du calcul des courbes pour l'estimation (mise en cache)
- Muli fractal raster : dist max augmentée pour aller jusqu'au dernier point 

##### 0.5.4 (12/03/2014)
- DirectEstimation : ne converge pas pour les courbes décroissantes
- CLI raster boxcounting : fichier nommé rdil au lieu de rbox

##### 0.5.3 (11/03/2014)
- BoxCounting vecteur (gliding) : évolution du nb de positions de grille dépendant de coef (évite un ralentissement important à la fin avec coef < 2)

##### 0.5.2 (26/02/2014)
- EstimationFrame export : ajout de la courbe du comportement scalant lissée
- DirectEstimation : changement algo estimation par dichotomie et dérivée partielle (Levenberg était très lent dans certains cas)

##### 0.5.1 (18/02/2014)
- Multi fractal : changement du signe de Tq et Dq

##### 0.5 (04/01/2014)
- ajout analyse multifractale boxcounting raster
- multiradial option "Auto threshold" : coupure automatique de la courbe par détection du point d'inflexion du comportement scalant
- multiradial : choix du modèle d'estimation
- affichage des échelles sur la carte sous forme carrée ou circulaire pour l'analyse radiale
- affiche les points d'inflexions sur le comportement scalant quand il est lissé
- restructuration des package dans org.thema.fracgis.method

##### 0.4.4
- meilleure gestion des CRS (projection) à l'export des couches
- MultiRadial : suppression du code -99 car pose problème avec ArcGIS

##### 0.4.3
- mise à jour GeoTools 2.6.3 -> 2.7.5

##### 0.4.2 (27/11/2013)
- passage du projet à maven

##### 0.4.1 (22/11/2013)
- a normalisé pour estimation non linéaire décroissante
- Radial multiple : no data -1 -> -99

##### 0.4 (05/10/2013)
- Il n'y a plus de paramètre avec une unité en pixel tout est dans l'unité de la couche
- Correlation : le paramètre dmax est maintenant en unité de la couche
- Radial multiple : le paramètre maxsize est maintenant en unité de la couche
- Radial multiple : ajout des sortie R2 et interval de confiance
- Sélection raster et vectorielle dans le menu tools
- Affichage des échelles d'analyse sur la carte
- restructuration des packages

##### 0.3.3 (12/08/2013)
- Radial raster disponible en GUI
- Radial multiple (estimation de l'exposant de holder)
- Boxcounting raster disponible en CLI
- Estimation : comportement scalant est lissé par convolution gaussienne
- Estimation : affichage ligne ou point de la courbe de comptage

##### 0.3.2 (05/08/2013)
- Batch vectoriel
- Estimation : problème de non convergence dans l'estimation directe avec courbe décroissante (correction : a = y0)
- Ajout dilatation raster
- Dilatation (vecteur) : option pour visualiser les formes dilatées
- Boxcounting (vecteur) : option pour visualiser les boites à chaque étape
- Restructuration des menus
- Correlation : paramètre dMax modifié en : dMax*2+1

##### 0.3.1 (31/07/2013)
- ajout ligne de commande
- Ajout analyse radiale vectorielle
- Interface : passage des barres de progression dans la fenêtre principale
- Box counting vectoriel : ajout option gliding grid
- Dilatation : ajout cluster curve
- Estimation : ajout intervalle de confiance par bootstrap

##### 0.3 (05/02/2013)
- Ajout de la dilatation vectorielle
- Box counting vectoriel : optimisation de l'exécution
- Estimation : choix entre l'estimation directe ou log linéaire quelque soit la méthode d'analyse
- Estimation : ajout du comportement scalant dans l'export texte

##### 0.2.5
- Ajout du test de significativité pour l'estimation log linéaire

##### 0.2.4 (01/06/2012)
- Batch correlation : bug with fixed option

##### 0.2.3 (22/08/2011)
- ajout Box counting raster
- batch en ligne de commande
- bug rasterisation linéaire

##### 0.2.2 (28/01/2011)
- réécriture de la rasterisation pour optimisation
