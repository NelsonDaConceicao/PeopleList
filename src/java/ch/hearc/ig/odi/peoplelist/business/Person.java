/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.business;

import java.util.Date;

/**
 *
 * @author nelson.daconcei
 */
public class Person {
    private Long id;
    private String gender;
    private String firstName;
    private String lastName;
    private boolean married;
    private Date birthDate;

    public Person() {
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isMarried() {
        return married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    } 
}
