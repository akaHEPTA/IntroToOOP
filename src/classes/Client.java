package classes;

public class Client {
    public static void main(String[] args) {
        Contact rick = new Contact("Rick", "ricktang1991@gamil.com", "778-986-8986");
        Contact dan = new Contact("Dan", "souzadanbr@gmail.com", "236-668-7354");
        Contact mika = new Contact("Mika", "mika@gmail.com", "123-456-7890");


        ContactsManager app = new ContactsManager();
        app.addContact(rick);
        app.addContact(dan);
        app.addContact(mika);

        app.searchContact("Dan");

        app.listAllContacts();



    }
}
