public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo Central", "Paris", 5);
        Zoo zoo2 = new Zoo("Zoo Tropical", "Marseille", 5);

        Animal lion = new Animal("Felidae", "Lion", 5, true);


        Animal singe = new Animal("chedly", "fo", 9, false);

        zoo1.addAnimal(lion);
zoo2.addAnimal(singe);

        zoo1.displayZooInfo();
        zoo2.displayZooInfo();

        int index = zoo1.searchAnimal(lion);
        System.out.println("Tiger trouvé à l'index: " + index);

        Zoo biggerZoo = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + biggerZoo.name);
    }
}
