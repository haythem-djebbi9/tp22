public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages, int maxAnimals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[maxAnimals]; // Capacité maximale de 25 animaux
    }

    // Méthode pour ajouter un animal au zoo
    public void addAnimal(Animal animal, int index) {
        if (index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Capacité maximale d'animaux atteinte.");
        }
    }

    // Méthode pour afficher les informations du zoo
    public void displayZooInfo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
        System.out.println("Animaux présents:");
        for (Animal animal : animals) {
            if (animal != null) {
                animal.displayAnimalInfo();
            }
        }
    }
}
