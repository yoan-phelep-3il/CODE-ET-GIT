public class FactureManager {

    /**
     * calcule la facture total pour un certain produit
     * 
     * @param typeProduit type produit en question 
     * @param quantite quantité du produit acheté
     * @param prixUnitaire prix du produit a l'unité
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        appliReduc(typeProduit);
        reduc5Pourcent(total);
        return total;
    }

    /**
     * calcule la réduction appliqué sur le produit en fonction de son type
     * 
     * @param typeProduit produit en question 
     */
    public void appliReduc(String typeProduit){
        switch (typeProduit) {
            case "Alimentaire":
                total -= total * 0.05;
                break;
            case "Electronique":
                total -= total * 0.1;
                break;
            case "Luxe":
                total -= total * 0.15;
                break;
        }
    }

    /**
     * calcule la réduction appliqué sur le produit en fonction de son type
     * 
     * @param total prix total du nombre de produit acheté 
     */
    public void reduc5Pourcent(double total){
        if (total > 1000) {
            total -= total * 0.05; 
        }
    }
}



