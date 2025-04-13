import java.util.Scanner;

public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;

    private static int compteur = 0;

    public Etudiant() {
        super();
        this.moyenne = 0;
        this.matricule = generateMatricule();
    }

    public Etudiant( double moyenne) {
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }


    public String getMatricule() {
        return matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }


    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }


    @Override
    public void saisie() {
        super.saisie();
        Scanner sc = new Scanner(System.in);
        System.out.print("Moyenne : ");
        moyenne = sc.nextDouble();
        this.matricule = generateMatricule();
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Matricule : " + matricule);
        System.out.println("Moyenne : " + moyenne);
    }

    private String generateMatricule() {
        compteur++;
        return "Mat-" + nom.charAt(0) + prenom.charAt(0) + compteur;
    }
}

