
package Repository;


import DataAcess.ContactDAO;
import java.util.ArrayList;


public class ContactRepository implements IContactRepository{

    @Override
    public void createContact() {
        ContactDAO.Instance().createContact();
    }

    @Override
    public void printAllContact() {
        ContactDAO.Instance().printAllContact();
    }

    @Override
    public void deleteContactd() {
        ContactDAO.Instance().deleteContactd();
    }
}
