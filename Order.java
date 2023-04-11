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
public class Order {
    private User user;
    private Product product;
    private CreditCard card;
    
    public Order(User user,Product product,CreditCard card){
        this.user = user;
        this.product = product;
        this.card = card;
    }
    

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }
    
}
