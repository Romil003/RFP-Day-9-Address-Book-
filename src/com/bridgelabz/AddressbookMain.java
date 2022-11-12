package com.bridgelabz;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressbookMain {



    public static void main(String[] args) {
        ArrayList<AddressBook> addressBook = new ArrayList<>();
        AddressBook book = new AddressBook();
        Scanner input = new Scanner(System.in);
        int option;
        do{
            System.out.println("Options are : ");
            System.out.print("1.Add\t");
            System.out.print("2.Edit\t");
            System.out.print("3.Display\t");
            System.out.print("4.Delete\t");
            System.out.print("5.Exit\n");
            System.out.print("Enter an option from above :- ");
            option = input.nextInt();

            switch (option){

                case 1 :
                    System.out.println("Enter the number of contact you want ot add : ");
                    int numberOfContacts = input.nextInt();
                    for (int i =0; i < numberOfContacts ; i++){
                        book.getContactDetails();
                    }
                    addressBook.add(book);
                    System.out.println(addressBook);
                    break;
                case 2 :
                    book.editPersonDetails();

                    break;
                case 3 :
                    System.out.println("Displaying Array : ");
                    System.out.println(addressBook);
                    break;
                case 4 :
                    book.deleteContact();
                    break;
                case 5 :
                    System.out.println("Exiting from book");
                    break;

            }
        }while (option != 5);
    }
}
