import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IProduit service = new ProduitImpl();

        System.out.print("Combien de produits voulez-vous saisir ? ");
        int n = sc.nextInt();

        Produit[] produits = new Produit[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nSaisie du produit " + (i + 1));
            produits[i] = service.saisie();
        }

        System.out.println("\nListe des produits ");
        for (Produit p : produits) {
            service.affichage(p);
            System.out.println();
        }
    }
}