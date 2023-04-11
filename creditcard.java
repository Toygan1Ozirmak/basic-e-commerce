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
public class CreditCard {
    private String cardNumber;
    private String securityNo;
    private String expireDate;
    private String cardOwner;
    
    public CreditCard(String cardNumber,String securityNo,String expireDate,String cardOwner){
        this.cardNumber = cardNumber;
        this.securityNo = securityNo;
        this.expireDate = expireDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getSecurityNo() {
        return securityNo;
    }

    public void setSecurityNo(String securityNo) {
        this.securityNo = securityNo;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }
    
}
