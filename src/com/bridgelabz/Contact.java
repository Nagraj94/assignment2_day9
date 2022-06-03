package com.bridgelabz;

import java.util.Scanner;

public class Contact {

    static Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private long zip;
    private long number;

    public Contact(){

    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", number=" + number +
                '}';
    }

    String state;

    public Contact(String firstName, String lastName, String email, String address, String city, long zip, String state, long number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.number = number;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

//    public void editExistingContact(){
//
//        System.out.println("enter your firstname");
//        firstName = sc.next();
//        System.out.println("enter your lastname");
//        lastName = sc.next();
//        System.out.println("enter your email address");
//        email = sc.next();
//        System.out.println("enter your address");
//        address = sc.next();
//        System.out.println("enter your city");
//        city = sc.next();
//        System.out.println("enter your zip code");
//        zip = sc.nextLong();
//        System.out.println("enter your number");
//        number = sc.nextLong();
//    }

}
