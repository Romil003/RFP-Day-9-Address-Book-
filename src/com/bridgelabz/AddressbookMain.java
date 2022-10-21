package com.bridgelabz;

import java.lang.reflect.Method;
import java.util.*;

public class AddressbookMain {


    public void creatingAddressBook(String a){
        System.out.println("Entering into Address book => " + a);
        ArrayList<AddressBook> book = new ArrayList<>();
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
                    AddressBook addressBook = new AddressBook();
                    addressBook.getContact();
                    book.add(addressBook);
                    System.out.println(book);
                    break;
                case 2 :
                    System.out.println("Enter a name");
                    String name = input.next();
                    ListIterator<AddressBook> iterator = book.listIterator();
                    while (iterator.hasNext()){
                        addressBook = iterator.next();
                        if(name.equals(addressBook.person.getFirstName())){
                            addressBook.editPersonDetails();
                            iterator.set(addressBook);
                        }
                    }
                    System.out.println(book);
                    break;
                case 3 :
                    System.out.println("Displaying Array : ");
                    Iterator<AddressBook> iterator2 = book.iterator();
                    while (iterator2.hasNext()) {
                        addressBook = iterator2.next();
                        System.out.println(addressBook);
                    }
                    break;
                case 4 :
                    System.out.println("Enter a name");
                    String name1 = input.next();
                    ListIterator<AddressBook> iterator1 = book.listIterator();
                    while (iterator1.hasNext()){
                        addressBook = iterator1.next();
                        if(name1.equals(addressBook.person.getFirstName())){
                            iterator1.remove();
                        }
                    }
                    break;
                case 5 :
                    System.out.println("Exiting from book");
                    break;
            }
            System.out.println();
        }while (option != 5);
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        AddressbookMain book1 = new AddressbookMain();

        System.out.print("Enter the number of address book you want : ");
        int num = in.nextInt();
        int i = 0;
        while ( i != num){
        System.out.print("Enter the name of address book : ");
        String bookName = in.next();
        book1.creatingAddressBook(bookName);
            i++;
        }

    }
}
