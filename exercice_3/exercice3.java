public class StockManager {

    /**
     * permet de gerer les stocks lors d'un retrait ou d'un ajout de produits
     * 
     * @param typeOperation permet de savoir si c'est un ajout ou un retrait
     * @param produit permet de connaitre le produit
     * @param quantite donne les quantités demandé
     * @param stock donne les quantités en stock 
    */ 
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch(typeOperation){
            case "ajout" :
                ajoutProduit(quantite, stock, produit);
                break ;
            case "retrait" :
                retraitProduit(quantite, stock, produit);
                break ;
            default :
                System.out.println("Opération inconnue.");
                break ;
        }
    }

    /**
     * permet de gerer le retrait de produits
     * 
     * @param produit permet de connaitre le produit
     * @param quantite donne les quantités demandé
     * @param stock donne les quantités en stock 
    */ 
    public void retraitProduit(int quantite, int stock, String produit){
        if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
    }

    /**
     * permet de gerer l'ajout de produits
     * 
     * @param produit permet de connaitre le produit
     * @param quantite donne les quantités demandé
     * @param stock donne les quantités en stock 
    */ 
    public void ajoutProduit(String produit, int quantite, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
}
