package com.bridgelabz;

public class AddressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Address address = new Address();
        address.addNewContact();
        System.out.println(address.list);


//        address.addNewContact();
//        address.addNewContact();
//
//        System.out.println("Editing Contact");
//        address.editContact();

    }

}
