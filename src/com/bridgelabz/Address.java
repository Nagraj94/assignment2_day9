package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Address {

    static Scanner sc = new Scanner(System.in);

    static int x;

    ArrayList<Contact> list = new ArrayList();

    public void addNewContact(){
        System.out.println("enter your firstname");
        String firstname =sc.next();
        System.out.println("enter your lastname");
        String lastname = sc.next();
        System.out.println("enter your email address");
        String email = sc.next();
        System.out.println("enter your address");
        String address = sc.next();
        System.out.println("enter city");
        String city = sc.next();
        System.out.println("enter state");
        String state = sc.next();
        System.out.println("enter zip");
        long zip = sc.nextLong();
        System.out.println("enter phone number");
        long number = sc.nextLong();

        Contact contact = new Contact(firstname,lastname,email,address,city,zip,state,number);
        list.add(contact);
    }

//    public void editContact(){
//        System.out.println("Enter the Firstname ");
//        String firstname = sc.next();
//        System.out.println("Enter Lastname");
//        String lastname = sc.next();
//
//        for (Contact contact:list) {
//            if(contact.getFirstName().equals(firstname)){
//                if (contact.getLastName().equals(lastname)){
//                    contact.editExistingContact();
//                }
//
//            }
//        }
//    }
}
