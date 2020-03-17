package annniversary;



import javax.swing.*;
import javax.swing.text.DateFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class PersonJDialog extends JDialog {
    private JPanel AddPerson;
    private JButton OkButton;
    private JTextField nameTextField;
    private JFormattedTextField birthdayFormattedTextField;
    private Person person = null;


    public PersonJDialog(ActionListener parent, boolean modal) {


        OkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LocalDate birthday = Dater.parseIt(birthdayFormattedTextField.getText());
                    person = new Person(nameTextField.getText(), birthday);
                    dispose();
                } catch (ParseException | IllegalArgumentException ex){
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }
        });
        setContentPane(AddPerson);
        setModal(true);
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        DateFormatter df = new DateFormatter(format);
        JFormattedTextField birthdayFormattedTextField = new JFormattedTextField(df);
        birthdayFormattedTextField.setValue(new Date());

    }

    public Person getPerson(){
        return person;
    }

}
