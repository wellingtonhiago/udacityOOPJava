package gerenciadorContatos;

public class ContactsManager {
    private Contact [] myContacts;
    private int contactsCount;

    public ContactsManager () {
        this.contactsCount = 0;
        this.myContacts = new Contact[500];
    }

    public void addContact (Contact contact) {
        myContacts[getContactsCount()] = contact;
        setContactsCount(getContactsCount() + 1);
    }

    public Contact[] getMyContacts() {
        return myContacts;
    }

    public void setMyContacts(Contact[] myContacts) {
        this.myContacts = myContacts;
    }

    public int getContactsCount() {
        return contactsCount;
    }

    public void setContactsCount(int contactsCount) {
        this.contactsCount = contactsCount;
    }

    public Contact searchContact (String searchName) {
        for (int i = 0; i < contactsCount; i++) {
            if (myContacts[i].getName().equalsIgnoreCase(searchName)){
                return myContacts[i];
            }
        }
        return null;
    }
}
