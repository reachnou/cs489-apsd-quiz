package edu.miu.cs489.apsdquiz1.factory;

import edu.miu.cs489.apsdquiz1.model.Contact;
import edu.miu.cs489.apsdquiz1.model.EmailAddresses;
import edu.miu.cs489.apsdquiz1.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ContactFactory {
    private static final List<Contact> contacts = new ArrayList<>();

    public static void init() {

        Contact contact1 = new Contact(
                1,
                "David",
                "Sanger",
                "Argos LLC",
                "Sales Manager",
                List.of(new PhoneNumber("240-133-0011", "Home"), new PhoneNumber("240-112-0123", "Mobile")),
                List.of(new EmailAddresses("dave.sang@gmail.com", "Home"), new EmailAddresses("dsanger@argos.com", "Work"))
        );

        Contact contact2 = new Contact(
                2,
                "Carlos",
                "Jimenez",
                "Zappos",
                "Director",
                null,
                null
        );

        Contact contact3 = new Contact(
                3,
                "Ali",
                "Gafar",
                "BMI Services",
                "HR Manager",
                List.of(new PhoneNumber("412-116-9988", "Work")),
                List.of(new EmailAddresses("ali@bmi.com", "Work"))
        );

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
    }


    public static void printJSONFormat() {

        contacts.sort(Comparator.comparing(Contact::getLName));
        
        System.out.println("[");
        for (Contact contact : contacts) {
            System.out.println("\t{");
            System.out.println("\t  \"id\": " + contact.getId() + ",");
            System.out.println("\t  \"firstName\": \"" + contact.getFName() + "\",");
            System.out.println("\t  \"lastName\": \"" + contact.getLName() + "\",");
            System.out.println("\t  \"company\": \"" + contact.getCompany() + "\",");
            System.out.println("\t  \"jobTitle\": \"" + contact.getJobTitle() + ",");
            System.out.println("\t  \"phoneNumbers\": \"" + contact.getPhoneNumbers() + ",");
            System.out.println("\t  \"emailAddresses\": " + contact.getEmailAddresses());
            System.out.println("\t}");
        }
        System.out.println("]");
    }
}
