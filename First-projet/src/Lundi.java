public class Lundi {
    public class Etudiant {
        private String nom;
        private String prenom;
        private int anneeNaissance;

        private static final int TAILLE_NOTES = 10;
        private double[] notes;
        private int nbNotes;

        private static int compteur = 0;
        private int numeroOrdre;
        private String matricule;

        // Constructeur 1 : nom et prénom
        public Etudiant(String nom, String prenom) {
            this(nom, prenom, 2000); // année par défaut
        }

        // Constructeur 2 : nom, prénom et année de naissance
        public Etudiant(String nom, String prenom, int anneeNaissance) {
            this.nom = nom;
            this.prenom = prenom;
            this.anneeNaissance = anneeNaissance;
            this.notes = new double[TAILLE_NOTES];
            this.nbNotes = 0;
            compteur++;
            this.numeroOrdre = compteur;
            this.matricule = genererMatricule();
        }

        // Accesseurs (getters)
        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public int getAnneeNaissance() {
            return anneeNaissance;
        }

        // Mutateurs (setters)
        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setAnneeNaissance(int anneeNaissance) {
            this.anneeNaissance = anneeNaissance;
        }

        // Calcul de la moyenne
        public double moyenne() {
            if (nbNotes == 0) return 0;
            double somme = 0;
            for (int i = 0; i < nbNotes; i++) {
                somme += notes[i];
            }
            return somme / nbNotes;
        }

        // Note maximale
        public double max() {
            if (nbNotes == 0) return 0;
            double max = notes[0];
            for (int i = 1; i < nbNotes; i++) {
                if (notes[i] > max) max = notes[i];
            }
            return max;
        }

        // Note minimale
        public double min() {
            if (nbNotes == 0) return 0;
            double min = notes[0];
            for (int i = 1; i < nbNotes; i++) {
                if (notes[i] < min) min = notes[i];
            }
            return min;
        }

        // Ajouter une note
        public void ajouterNote(double note) {
            if (nbNotes < TAILLE_NOTES) {
                notes[nbNotes] = note;
                nbNotes++;
                System.out.println("Nouvelle moyenne : " + moyenne());
            } else {
                System.out.println("Impossible d’ajouter plus de " + TAILLE_NOTES + " notes.");
            }
        }

        // Calcul de l'âge
        public int age() {
            return java.time.LocalDate.now().getYear() - anneeNaissance;
        }

        // Redéfinition de toString
        @Override
        public String toString() {
            return "Nom : " + nom + ", Prénom : " + prenom + ", Âge : " + age() + ", Matricule : " + matricule;
        }

        // Méthode privée pour générer le matricule
        private String genererMatricule() {
            return "Mat-" + nom.charAt(0) + prenom.charAt(0) + numeroOrdre;
        }

        // Méthode pour obtenir l'âge (utile dans le main)
        public int getAge() {
            return age();
        }
    }

}
