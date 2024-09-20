public class Main {
    public static void main(String[] args) {
        // Création d'un animal (Lion)
        Animal lion = new Animal("Felidae", "Lion", 5, true);


        Animal singe = new Animal("gerd", "grayda", 8, false);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("My Awesome Zoo", "Paris", 10, 25);



        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion, 0);


        myZoo.addAnimal(singe, 1);

        // Affichage des informations
        lion.displayAnimalInfo();
        myZoo.displayZooInfo();
    }
}
