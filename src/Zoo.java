public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages; // Instruction 14 : constante pour le nombre maximal de cages
    int animalCount;    // Compteur d'animaux

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages]; // Tableau de taille égale au nombre de cages
        this.animalCount = 0;
    }

    // Méthode pour ajouter un animal au zoo
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) { // Vérifie si le zoo est déjà plein
            System.out.println("Capacité maximale d'animaux atteinte.");
            return false;
        }

        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                animalCount++; // Incrémente le compteur
                return true;   // Retourne true si l'animal est ajouté avec succès
            }
        }
        return false; // Retourne false si l'animal n'a pas pu être ajouté (mais ça ne devrait pas arriver)
    }

    // Méthode pour afficher les informations du zoo
    public void displayZooInfo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Animaux présents:");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getName()); // Suppose que la classe Animal a une méthode getName()
            }
        }
    }

    // Méthode pour rechercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i; // Retourne l'index si l'animal est trouvé
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }

    // Méthode pour supprimer un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            animals[index] = null; // Retire l'animal du zoo
            animalCount--;         // Décrémente le compteur d'animaux
            return true;           // Retourne true si la suppression est réussie
        }
        return false;              // Retourne false si l'animal n'est pas trouvé
    }

    // Méthode pour vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Méthode pour comparer deux zoos et retourner celui avec le plus d'animaux
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z1.animalCount < z2.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return z1; // Ou z2, selon la préférence
        }
    }
}
