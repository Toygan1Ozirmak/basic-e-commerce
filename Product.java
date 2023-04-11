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
public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStockinformation;
    private String productWeight;
    private String productStatementinformation;
    
    public Product(String productName,String productColor,String productCategory,int productStockinformation,String productWeight,String productStatementinformation){
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockinformation = productStockinformation;
        this.productWeight = productWeight;
        this.productStatementinformation = productStatementinformation;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStockinformation() {
        return productStockinformation;
    }

    public void setProductStockinformation(int productStockinformation) {
        this.productStockinformation = productStockinformation;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductStatementinformation() {
        return productStatementinformation;
    }

    public void setProductStatementinformation(String productStatementinformation) {
        this.productStatementinformation = productStatementinformation;
    }
    public void numberofStocks(){
        if(productStockinformation > 0){
            productStockinformation--;
            System.out.println(productName + " Stock reduced.");
        }
        else{
            System.out.println("Out of stock.");
        }
    }
    
            
}
