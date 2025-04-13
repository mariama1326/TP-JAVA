public class Main {
    public static void main(String[] args) {
        // Saisie et affichage d’un employé
        System.out.println("Employé ");
        Employe emp = new Employe();
        emp.saisie();
        emp.affiche();

        System.out.println("\n Étudiant ");
        Etudiant etu = new Etudiant();
        etu.saisie();
        etu.affiche();
    }
}