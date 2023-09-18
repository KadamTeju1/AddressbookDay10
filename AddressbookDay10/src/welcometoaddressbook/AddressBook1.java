package com.addressbook;

//first and last names, address,
//        city, state, zip, phone number and
//        email...

import java.util.ArrayList;

class Contact3 {
    private String firstName;
    private String lastName;
    private String address;
    private int zipNo;
    private int phoneNumber;
    private String email;
    private static ArrayList<com.addressbook.Contact3> list = new ArrayList<com.addressbook.Contact3>();


    public Contact3(String firstName, String lastName, String address, int zipNo, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.zipNo = zipNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getZipNo() {
        return zipNo;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipNo(int zipNo) {
        this.zipNo = zipNo;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void addContact(com.addressbook.Contact3 add){
        list.add(add);
    }
    public static void removeContact(com.addressbook.Contact3 remove, String firstName){
        list.remove(remove);
    }

    public static  ArrayList<com.addressbook.Contact3> getContact(){
        return list;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", zipNo=" + zipNo +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
public class AddressBook1 {
    public static void main(String[] args) {
        com.addressbook.Contact3 c=new com.addressbook.Contact3("Shilpa","Bhonde","Yavatmal",400028,12345,"shilpa@gmail.com");
        com.addressbook.Contact3 c1=new com.addressbook.Contact3("Kunal","Wnnare","Umerkhed",400016,3546,"kunal@gmail.com");
        com.addressbook.Contact3 c2=new com.addressbook.Contact3("Avinash","Shende","Darwha",400034,18,"avinash@gmail.com");
        com.addressbook.Contact3 c3=new com.addressbook.Contact3("Chotey","Khadse","Amravati",400045,45,"kunal@gmail.com");

        com.addressbook.Contact3.addContact(c);
        com.addressbook.Contact3.addContact(c1);
        com.addressbook.Contact3.addContact(c2);
        com.addressbook.Contact3.addContact(c3);
        c.setFirstName("Shilpa");
        System.out.println(c.getFirstName());

        ArrayList<com.addressbook.Contact3> list= com.addressbook.Contact3.getContact();
        //System.out.println(Contact.getContact());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\n After removing");
        com.addressbook.Contact3.removeContact(c3,"Shilpa");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}