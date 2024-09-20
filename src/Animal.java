public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les détails d'un animal
    public void displayAnimalInfo() {
        System.out.println("Famille: " + family);
        System.out.println("Nom: " + name);
        System.out.println("Âge: " + age);
        System.out.println("Est un mammifère: " + (isMammal ? "Oui" : "Non"));
    }
}
