package gerenciadorContatos;

public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact mauricio = new Contact();

        mauricio.setName("Mauricio");
        mauricio.setPhoneNumber("99999-9999");

        myContactsManager.addContact(mauricio);

        System.out.println(myContactsManager.searchContact("mauricio"));
        System.out.println(myContactsManager.searchContact("paul"));

    }
}
