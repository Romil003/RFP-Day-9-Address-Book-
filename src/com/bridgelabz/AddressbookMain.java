package com.bridgelabz;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class AddressbookMain {



    public static void main(String[] args) {
        HashMap<String,AddressBook> dictionary = new HashMap<>();
        AddressBook book = new AddressBook();
        Scanner input = new Scanner(System.in);
        int option;
        do{
            System.out.println("Options are : ");
            System.out.print("1.Add Contact to existing address book\t");
            System.out.print("2.Edit Contact\t");
            System.out.print("3.Display Address Book\t");
            System.out.print("4.Delete Contact\t");
            System.out.print("5.Display available Address Books\t");
            System.out.print("6.Add new Address Book\t");
            System.out.print("7.Exit\n");
            System.out.print("Enter an option from above :- ");
            option = input.nextInt();

            switch (option){

                case 1 :
                    System.out.println("Enter name of address book in which you want to add contact : ");
                    String addressBookName = input.next();
                    if(dictionary.containsKey(addressBookName)){
                        System.out.println(addressBookName + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName);
                        addressBook.getContactDetails();
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 2 :
                    System.out.println("Enter name of address book in which you want to edit contact : ");
                    String addressBookName1 = input.next();
                    if(dictionary.containsKey(addressBookName1)){
                        System.out.println(addressBookName1 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName1);
                        addressBook.editPersonDetails();
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 3 :
                    System.out.println("Enter name of address book in which you want to display contact : ");
                    String addressBookName2 = input.next();
                    if(dictionary.containsKey(addressBookName2)){
                        System.out.println(addressBookName2 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName2);
                        addressBook.displayContact();
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 4 :
                    System.out.println("Enter name of address book in which you want to delete contact : ");
                    String addressBookName3 = input.next();
                    if(dictionary.containsKey(addressBookName3)){
                        System.out.println(addressBookName3 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName3);
                        addressBook.deleteContact();
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 5 :
                    if (dictionary.isEmpty()){
                        System.out.println("Dictionary is empty");
                    }
                    else {
                        System.out.println(dictionary.keySet());
                    }
                    break;
                case 6 :
                    System.out.println("Enter name of address book you want to add to dictionary : ");
                    String addressBookName4 = input.next();
                    if(dictionary.containsKey(addressBookName4)){
                        System.out.println(addressBookName4 + " Address book exist.");
                    }
                    else {
                        System.out.println("Address Book does not exist");
                        AddressBook addressBook = new AddressBook();
                        dictionary.put(addressBookName4,addressBook);
                    }
                    break;
                case 7 :
                    System.out.println("Exiting from dictionary");

            }
        }while (option != 7);
    }
}
