
package Controller;

import Common.Library;
import Common.Validation;
import Model.Contact;
import Repository.ContactRepository;
import Repository.IContactRepository;
import View.Menu;
import java.util.ArrayList;


public class ContactManager extends Menu<String>{
    private IContactRepository contactRepository;
    static String[] mc = {"Add a contact", "Display all contact", "Delete a Contact", "Exit"};
//    Library l;
//    Validation valid;
//    ArrayList<Contact> list;

    public ContactManager() {
        super("\nContact program", mc);
//        l = new Library();
//        valid = new Validation();
//        list = new ArrayList<>();
        contactRepository = new ContactRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                contactRepository.createContact();
                break;
            case 2:
                contactRepository.printAllContact();
                break;
            case 3:
                contactRepository.deleteContactd();
                break;
            case 4:
                System.exit(0);
        }
    }

//    public void createContact() {
//        int contactId = generateID();
//        String name = l.inputString("Enter Name: ");
//        String group = l.inputString("Enter group: ");
//        String address = l.inputString("Enter address: ");
//        String phone = l.inputString("Enter phone: ");
//        while (!valid.checkInputPhone(phone)) {
//            phone = l.inputString("Enter again: ");
//        }
//        String[] strSplit = name.split("\\s");
//        String firstName = null;
//        String lastName = null;
//        try {
//            firstName = strSplit[0];
//            lastName = strSplit[1];
//        } catch (Exception e) {
//            lastName = "  ";
//        }
//
//        list.add(new Contact(contactId, name, group, address,
//                phone, firstName, lastName));
//        System.err.println("Add successful.");
//    }
//
//    public void printAllContact(ArrayList<Contact> lc) {
//        if (lc.isEmpty()) {
//            System.out.println("Empty");
//        } else {
//            System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
//                    "First name", "Last name", "Group", "Address", "Phone");
//
//            for (Contact contact : lc) {
//                System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
//                        contact.getContactId(), contact.getFullName(),
//                        contact.getFirstName(), contact.getLastName(),
//                        contact.getGroup(), contact.getAddress(), contact.getPhone());
//            }
//        }
//    }
//
//    public void deleteContactd(ArrayList<Contact> lc) {
//        if (lc.isEmpty()) {
//            System.out.println("Empty");
//            return;
//        }
//        int idDelete = l.getInt("Enter id: ", 1, list.size() + 1);
//        ArrayList<Contact> contactDelete = getContactById(lc, idDelete);
//        lc.removeAll(contactDelete);
//        System.err.println("Delete successful.");
//    }
//
//    public ArrayList<Contact> getContactById(ArrayList<Contact> lc, int idDelete) {
//        ArrayList<Contact> listContactById = new ArrayList<>();
//        for (Contact contact : lc) {
//            if (contact.getContactId() == idDelete) {
//                listContactById.add(contact);
//            }
//        }
//        return listContactById;
//    }
//
//    public int generateID() {
//        int id = 0;
//        if (list.isEmpty()) {
//            return 1;
//        } else {
//
//            for (Contact s : list) {
//                if (s.getContactId() == list.size()) {
//                    id = s.getContactId() + 1;
//                }
//            }
//        }
//        return id;
//    }
}
