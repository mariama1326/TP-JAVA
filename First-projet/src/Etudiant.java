public class Etudiant {
        private String nom;
        private String prenom;
        private int anneeNaissance;

        private static final int MAX_NOTES = 10;
        private double[] notes;
        private int nbNotes;

        private static int compteur = 0;
        private int numeroOrdre;
        private String matricule;


        public Etudiant(String nom, String prenom) {
            this(nom, prenom, 2000);
        }

        public Etudiant(String nom, String prenom, int anneeNaissance) {
            this.nom = nom;
            this.prenom = prenom;
            this.anneeNaissance = anneeNaissance;
            this.notes = new double[MAX_NOTES];
            this.nbNotes = 0;
            compteur++;
            this.numeroOrdre = compteur;
            this.matricule = genererMatricule();
        }

        public String getNom() {
            return nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public int getAnneeNaissance() {
            return anneeNaissance;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public void setAnneeNaissance(int anneeNaissance) {
            this.anneeNaissance = anneeNaissance;
        }

        public double moyenne() {
            if (nbNotes == 0) return 0;
            double somme = 0;
            for (int i = 0; i < nbNotes; i++) {
                somme += notes[i];
            }
            return somme / nbNotes;
        }

        public double max() {
            if (nbNotes == 0) return 0;
            double max = notes[0];
            for (int i = 1; i < nbNotes; i++) {
                if (notes[i] > max) max = notes[i];
            }
            return max;
        }
        public double min() {
            if (nbNotes == 0) return 0;
            double min = notes[0];
            for (int i = 1; i < nbNotes; i++) {
                if (notes[i] < min) min = notes[i];
            }
            return min;
        }

        public void ajouterNote(double note) {
            if (nbNotes < MAX_NOTES) {
                notes[nbNotes] = note;
                nbNotes++;
                System.out.println("Nouvelle moyenne : " + moyenne());
            } else {
                System.out.println("Impossible d’ajouter plus de " + MAX_NOTES + " notes.");
            }
        }

        public int age() {
            return java.time.LocalDate.now().getYear() - anneeNaissance;
        }
        @Override
        public String toString() {
            return "Nom : " + nom + ", Prénom : " + prenom + ", Âge : " + age() + ", Matricule : " + matricule;
        }

        private String genererMatricule() {
            return "Mat-" + nom.charAt(0) + prenom.charAt(0) + numeroOrdre;
        }
        public int getAge() {
            return age();
        }
    }


