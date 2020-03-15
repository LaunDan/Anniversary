import javax.swing.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdministratorOfPerson {
    private DefaultListModel<Person> persons = new DefaultListModel<>();

    public ListModel getModel(){
        return persons;
    }

    public void add(Person person){
        persons.addElement(person);
    }

    public void delete(Person person){
        persons.removeElement(person);
    }

    public List<Person> getPersons(){
        return Collections.list(persons.elements());
    }
}
