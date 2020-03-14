import javax.swing.*;

public class PersonJDialog extends JDialog {
    private JPanel AddPerson;
    private JButton OKButton;
    private JTextField nameTextField;
    private JFormattedTextField birthdayFirmattedTextField;


    public PersonJDialog() {
        setContentPane(AddPerson);
        setModal(true);

    }


}
