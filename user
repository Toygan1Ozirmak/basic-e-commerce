/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oophomework;

import java.util.ArrayList;

/**
 *
 * @author toyga
 */
public class User {
    
    private String username;
    private String name;
    private String surname;
    private String birthday;
    private String password;
    private String email;
    private String homeAdress;
    private String workAdress;
    private ArrayList<Product> orders;
    private ArrayList<Product> favourites;
    private ArrayList<CreditCard> creditCards;
    
    
    public User(String username,String name,String surname,String birthday,String password,String email,String homeAdress,String workAdress){
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.password = password;
        this.email = email;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
        this.orders = new ArrayList<>();
        this.favourites = new ArrayList<>();
        this.creditCards = new ArrayList<>();
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }

    public ArrayList<Product> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Product> orders) {
        this.orders = orders;
    }

    public ArrayList<Product> getFavourites() {
        return favourites;
    }

    public void setFavourites(ArrayList<Product> favourites) {
        this.favourites = favourites;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
    

    
    public void addCreditcard(CreditCard card){
        creditCards.add(card);
    }
    
   
   public void buyProduct(Product product){
       orders.add(product);
       product.numberofStocks();
       
   }
   public void addtoFavourites(Product product){
       favourites.add(product);
       
   }
}
