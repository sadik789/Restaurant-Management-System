package com.project.restaurant_management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Cheaf {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int cheaf_id;
    private String cheaf_firstname;
    private String cheaf_lastname;
    private String cheaf_gender;
    private String cheaf_email;
    private String cheaf_address;
    private String cheaf_education;
    public Cheaf() {
    }
    public Cheaf(int cheaf_id, String cheaf_firstname, String cheaf_lastname, String cheaf_gender, String cheaf_email,
            String cheaf_address, String cheaf_education) {
        this.cheaf_id = cheaf_id;
        this.cheaf_firstname = cheaf_firstname;
        this.cheaf_lastname = cheaf_lastname;
        this.cheaf_gender = cheaf_gender;
        this.cheaf_email = cheaf_email;
        this.cheaf_address = cheaf_address;
        this.cheaf_education = cheaf_education;
    }
    public int getCheaf_id() {
        return cheaf_id;
    }
    public void setCheaf_id(int cheaf_id) {
        this.cheaf_id = cheaf_id;
    }
    public String getCheaf_firstname() {
        return cheaf_firstname;
    }
    public void setCheaf_firstname(String cheaf_firstname) {
        this.cheaf_firstname = cheaf_firstname;
    }
    public String getCheaf_lastname() {
        return cheaf_lastname;
    }
    public void setCheaf_lastname(String cheaf_lastname) {
        this.cheaf_lastname = cheaf_lastname;
    }
    public String getCheaf_gender() {
        return cheaf_gender;
    }
    public void setCheaf_gender(String cheaf_gender) {
        this.cheaf_gender = cheaf_gender;
    }
    public String getCheaf_email() {
        return cheaf_email;
    }
    public void setCheaf_email(String cheaf_email) {
        this.cheaf_email = cheaf_email;
    }
    public String getCheaf_address() {
        return cheaf_address;
    }
    public void setCheaf_address(String cheaf_address) {
        this.cheaf_address = cheaf_address;
    }
    public String getCheaf_education() {
        return cheaf_education;
    }
    public void setCheaf_education(String cheaf_education) {
        this.cheaf_education = cheaf_education;
    }
    @Override
    public String toString() {
        return "Cheaf [cheaf_id=" + cheaf_id + ", cheaf_firstname=" + cheaf_firstname + ", cheaf_lastname="
                + cheaf_lastname + ", cheaf_gender=" + cheaf_gender + ", cheaf_email=" + cheaf_email
                + ", cheaf_address=" + cheaf_address + ", cheaf_education=" + cheaf_education + "]";
    }


    
}
