import javax.swing.*;

public class PersonJDialog extends JDialog {
    private JPanel AddPerson;
    private JButton OKButton;
    private JTextField nameTextField;
    private JFormattedTextField birthdayFormattedTextField;


    public PersonJDialog() {
        setContentPane(AddPerson);
        setModal(true);
        JFormattedTextField birthdayFormattedTextField = new JFormattedTextField();
        birthdayFormattedTextField.setFormatterFactory();


    }




}
