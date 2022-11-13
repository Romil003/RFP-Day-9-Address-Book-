package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class AddressBook {

    ArrayList<Contact> contacts = new ArrayList<>();


    public void getContactDetails(){
        System.out.println("Enter details : ");
        Contact person = new Contact();
        person.getPersonDetails();
        int present = 0;
        for (Contact contact :contacts) {
            if (contact.getFirstName().equals(person.getFirstName())){
                present = 1;
                System.out.println("Person already exist");
                break;
            }
        }
        if (present==0){
            contacts.add(person);
        }
    }



    public void editPersonDetails(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter name to edit : " ) ;
        String name = input1.next();
        for (Contact person:contacts) {
            if (person.getFirstName().equals(name)) {
                System.out.println("Enter the option to edit");
                System.out.println("1.Firstname\t 2.Lastname\t 3.Address\t 4.City\t 5.State\t 6.Zipcode\t 7.Phone number\t 8.Email\t 9.Exit");
                int choice = input1.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Changing First name : ");
                        person.setFirstName(input1.next());
                        break;
                    case 2:
                        System.out.println("Changing last name : ");
                        person.setLastName(input1.next());
                        break;
                    case 3:
                        System.out.println("Changing address : ");
                        person.setAddress(input1.next());
                        break;
                    case 4:
                        System.out.println("Changing city : ");
                        person.setCity(input1.next());
                        break;
                    case 5:
                        System.out.println("Changing state : ");
                        person.setState(input1.next());
                        break;
                    case 6:
                        System.out.println("Changing zipcode : ");
                        person.setZipcode(input1.nextInt());
                        break;
                    case 7:
                        System.out.println("Changing phone number: ");
                        person.setPhoneNumber(input1.nextInt());
                        break;
                    case 8:
                        System.out.println("Changing email : ");
                        person.setEmail(input1.next());
                        break;
                    case 9:
                        System.out.println("Exiting from edit operation");
                        break;
                }
            }
        }
    }

    public void deleteContact(){
        Scanner input1 = new Scanner(System.in);
        System.out.println(contacts);
        System.out.println("Enter name to delete : " );
        String name = input1.next();
        for (Contact person:contacts) {
            Predicate<String> personName = str -> str.equals(person.getFirstName());
            if(contacts.removeIf(contact -> personName.test(name))){
                System.out.println("Contact deleted successfully !!!");
            }
        }
    }

    public void displayContact(){
        for (Contact contact:contacts) {
            System.out.println(contact);
        }
    }


    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                '}';
    }
}
