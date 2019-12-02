package miniproject2;

import java.util.ArrayList;

import static miniproject2.InputController.*;

public class ContactList {
    private ArrayList<Contact> itemList;

    public ContactList() {
        this.itemList = new ArrayList<>();
    }


    public void listContacts() {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.printf("%d. %s\n", i, itemList.get(i));
        }
    }

    public Contact addContact(Contact newContact, boolean update) {
        if (update) {
            return newContact;
        }
        if (itemList.contains(newContact)) {
            System.out.println("Contact already exists.");
        } else {
            itemList.add(newContact);
            System.out.println("Successfully added a new contact!");
        }
        return newContact;
    }

    public void removeContact(int index) {
        listContacts();
        System.out.println("Successfully removed " + itemList.get(index).getName());
        itemList.remove(index);
    }

    public void updateContact(Contact newContact) {
        listContacts();
        int input = getMandatoryInputAsInt("Enter the index of the contact to update: ", itemList.size());
        Contact updateContact = addContact(newContact, true);
        System.out.println("Successfully updated " + itemList.get(input) + " to " + updateContact);
        itemList.set(input, updateContact);
    }

    public int size() {
        return itemList.size();
    }
}
