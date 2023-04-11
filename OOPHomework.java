/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oophomework;

/**
 *
 * @author toyga
 */
public class OOPHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User Ahmet = new User("ahmet123","ahmet","cakir","21.07.1997","159258ac","ahmetcakir@hotmail.com","yesil mahalle 17 sokak","ozturk mahalle 43 sokak");
        System.out.println(Ahmet.getUsername());
        System.out.println("User added");
        User Mehmet = new User("mehmet94","mehmet","ozturk","23.12.1990","90mehmet90","mehmet.ozturk@hotmail.com","ertas mahalle 45sokak","yilmaz mahalle 31 sokak");
        System.out.println(Mehmet.getUsername());
        System.out.println("User added");
        CreditCard card1 = new CreditCard("156259641","005","02/23","Ahmet Cakir");
        Ahmet.addCreditcard(card1);
        System.out.println(card1.getCardNumber());
        System.out.println("Credit card added");
        CreditCard card2 = new CreditCard("269841529","234","10/24","Mehmet Ozturk");
        Mehmet.addCreditcard(card2);
        System.out.println(card2.getCardNumber());
        System.out.println("Credit card added");
        
        
        
        Product tShirt = new Product("oversize tshirt","black","clothing",12,"133gr","black oversize tshirt xl");
        Product jean = new Product("jean","blue","clothing",2,"150 gr","carrot fit blue jean");
        
        Ahmet.buyProduct(tShirt);
        System.out.println("Your order has been taken.");
        System.out.println(tShirt.getProductStockinformation()+ " remaining stock");
        Mehmet.buyProduct(jean);
        System.out.println(jean.getProductStockinformation()+ " remaining stock");
        System.out.println("Your order has been taken.");
        
        Ahmet.addtoFavourites(tShirt);
        System.out.println(tShirt.getProductName()+ " Your order has been taken to favourites");
        Mehmet.addtoFavourites(jean);
        System.out.println(jean.getProductName()+ " Your order has been taken to favourites");
        
                
        
            
    }
    
}
