//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("sow","Dieyna" );
        Etudiant e2 = new Etudiant("sarr","babacar" ,2009);

        e1.setAnneeNaissance(1999);
        System.out.println("Infos de l'etudiant");
        System.out.println("Nom"  + e1.getNom().toUpperCase());
        System.out.println("prenom"   + e1.getPrenom());
        System.out.println("Année de naissance "+ e1.getAnneeNaissance());
        e1.ajouterNote(15.5);
        e1.ajouterNote(13);
        e1.ajouterNote(17);

        e2.ajouterNote(12);
        e2.ajouterNote(11);

        System.out.println(e1);
        System.out.println(e2);

        if(e1.getAge()>e2.getAge()){
            System.out.println(e1.getPrenom() + "est plus agé(e)");
        }else if(e1.getAge()<e2.getAge()){
            System.out.println(e2.getPrenom() + "est plus agé(e)");
        }else{
            System.out.println("Ils ont le meme age");
        }
        System.out.println("\nStatistiques pour " + e1.getPrenom() + " :");
        System.out.println("Moyenne : " + e1.moyenne());
        System.out.println("Max : " + e1.max());
        System.out.println("Min : " + e1.min());
        }
    }
 