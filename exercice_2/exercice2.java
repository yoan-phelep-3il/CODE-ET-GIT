public class GestionnaireNotes {

    /**
     * affiche la moyenne et les notes de l'Etudiant  
     * 
     * @param notes differentes notes de l'eleves
     * @param nomEtudiant nom de l'Etudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficheNote(nomEtudiant,notes);
        afficheMoyenne(note);
    }

    /**
     * affiche le nom de l'Etudiant ainsi que ses notes
     * 
     * @param nomEtudiant nom de l'Etudiant
     * @param notes differentes notes de l'eleves
     */
    public void afficheNote(String nomEtudiant,int[] notes){
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * calcule puis affiche la moyenne d'un Etudiant
     * 
     * @param notes differentes notes de l'eleves
     */
    public void afficheMoyenne(int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne); 
    }
}
