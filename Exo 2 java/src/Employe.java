import java.util.Scanner;

public class Employe extends Personne {
    private String fonction;
    private int salaire;

    public Employe() {
        super();
        this.fonction = "";
        this.salaire = 0;
    }

    public Employe(String fonction, int salaire) {
        this.fonction = fonction;
        this.salaire = salaire;
    }


    public String getFonction() {
        return fonction;
    }

    public int getSalaire() {
        return salaire;
    }


    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }


    @Override
    public void saisie() {
        super.saisie();
        Scanner sc = new Scanner(System.in);
        System.out.print("Fonction : ");
        fonction = sc.nextLine();
        System.out.print("Salaire : ");
        salaire = sc.nextInt();
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Fonction : " + fonction);
        System.out.println("Salaire : " + salaire);
    }
}