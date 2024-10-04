public class Animal {
    private String family;  // Encapsulation : les attributs sont privés
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Getter pour la famille
    public String getFamily() {
        return family;
    }

    // Getter pour le nom
    public String getName() {
        return name;
    }

    // Getter pour l'âge
    public int getAge() {

        return age;
    }

    // Getter pour savoir si c'est un mammifère
    public boolean isMammal() {
        return isMammal;
    }

    // Méthode pour afficher les informations de l'animal
    public void displayAnimalInfo() {
        System.out.println("Famille: " + family);
        System.out.println("Nom: " + name);
        System.out.println("Âge: " + age);
        System.out.println("Est un mammifère: " + (isMammal ? "Oui" : "Non"));
    }

    // Setter pour modifier l'âge si nécessaire (optionnel)
    public void setAge(int age) {

        if (age <0) {

            System.out.println("Erreur: Age invalide");
        }
        else {
            this.age = age;
        }
    }

    // Setter pour modifier la famille (optionnel)
    public void setFamily(String family) {
        this.family = family;
    }
}
