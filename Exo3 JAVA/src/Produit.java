public class Produit {
    private String ref;
    private String libelle;
    private double quantite;
    private int prix;

    public Produit(String ref,String libelle,double quantite,int prix) {
        this.libelle=libelle;
        this.prix = prix;
        this.quantite = quantite;
        this.ref = ref;
    }

    public Produit() {

    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}


