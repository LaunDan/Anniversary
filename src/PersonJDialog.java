import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonJDialog extends JDialog {
    private JPanel AddPerson;
    private JButton OkButton;
    private JTextField nameTextField;
    private JFormattedTextField birthdayFormattedTextField;


    public PersonJDialog() {
        setContentPane(AddPerson);
        setModal(true);
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        DateFormatter df = new DateFormatter(format);
        JFormattedTextField birthdayFormattedTextField = new JFormattedTextField(df);
        birthdayFormattedTextField.setValue(new Date());


    }




}
