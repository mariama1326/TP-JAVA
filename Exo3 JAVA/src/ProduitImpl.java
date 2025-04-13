import java.util.Scanner;

public class ProduitImpl implements IProduit {

    Scanner sc = new Scanner(System.in);

    @Override
    public Produit saisie() {
        Produit p = new Produit();

        System.out.print("Référence : ");
        p.setRef(sc.nextLine());

        System.out.print("Libellé : ");
        p.setLibelle(sc.nextLine());

        System.out.print("Quantité : ");
        p.setQuantite(sc.nextDouble());

        System.out.print("Prix : ");
        p.setPrix(sc.nextInt());

        sc.nextLine(); // vider le buffer

        return p;
    }

    @Override
    public void affichage(Produit p) {
        System.out.println("=== Produit ===");
        System.out.println("Réf       : " + p.getRef());
        System.out.println("Libellé   : " + p.getLibelle());
        System.out.println("Quantité  : " + p.getQuantite());
        System.out.println("Prix      : " + p.getPrix());
    }
}


