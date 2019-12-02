package miniproject2;


import static miniproject2.InputController.*;

public class Main {

    private enum Menu {
        LIST, ADD, REMOVE, UPDATE, QUIT;
        public static Menu fromInteger(int x) {
            switch(x) {
                case 1:
                    return LIST;
                case 2:
                    return ADD;
                case 3:
                    return REMOVE;
                case 4:
                    return UPDATE;
                case 5:
                    return QUIT;
            }
            return null;
        }
    }

    private static Menu mainMenu() {
        System.out.println();
        System.out.println("+===  Contact  App  ===+");
        System.out.println("| 1. List all Contacts | ");
        System.out.println("| 2. Add new Contact   |");
        System.out.println("| 3. Remove Contact    |");
        System.out.println("| 4. Update Contact    |");
        System.out.println("| 5. Quit              | ");
        System.out.println("+======================+");

        return Menu.fromInteger(getMandatoryInputAsInt("Enter your option: ", 1, 5));
    }

    private static Contact getNewContactInfo() {
        String name = getMandatoryInput("Enter name: ");
        String mobile = getMandatoryInput("Enter mobile: ");
        String work = getOptionalInput("Enter work: ");
        String home = getOptionalInput("Enter home: ");
        String city = getOptionalInput("Enter city: ");
        return new Contact(name, mobile, work, home, city);
    }

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        while (true) {
            Menu option = mainMenu();
            switch (option) {
                case LIST:
                    contactList.listContacts();
                    break;
                case ADD:
                    contactList.addContact(getNewContactInfo(),false);
                    break;
                case REMOVE:
                    int index = getMandatoryInputAsInt("Enter the index of the contact to remove: ", contactList.size());
                    contactList.removeContact(index);
                    break;
                case UPDATE:
                    contactList.updateContact(getNewContactInfo());
                    break;
                case QUIT:
                    System.out.println("Bye");
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
    }
}
