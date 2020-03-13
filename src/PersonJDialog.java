import javax.swing.*;

public class PersonJDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public PersonJDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        PersonJDialog dialog = new PersonJDialog();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
