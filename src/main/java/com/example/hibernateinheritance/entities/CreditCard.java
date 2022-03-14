package com.example.hibernateinheritance.entities;

//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="card")
@PrimaryKeyJoinColumn(name = "id")
//@DiscriminatorValue(value = "cc")
public class CreditCard  extends  Payment{
    private String cardnumber;

    public String getCreditcardnumber() {
        return cardnumber;
    }

    public void setcardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
