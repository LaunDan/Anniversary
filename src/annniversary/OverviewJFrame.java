package annniversary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class OverviewJFrame extends JFrame {
    private JPanel Anniversary;
    private JButton addButton;
    private JButton deleteButton;
    private JList personsJList;
    private JLabel todayJLabel;
    private JLabel soonestJLabel;
    private JLabel birthdayJLabel;
    private JLabel ageJLabel;
    private AdministratorOfPerson adminOfPerson = new AdministratorOfPerson();



    public static void main(String[] args) {
        JFrame frame = new OverviewJFrame();
        frame.setTitle("Anniversary");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    public OverviewJFrame() {
        // find condition
        Person choosenPerson = (Person) personsJList.getSelectedValue();
        if (choosenPerson != null) {

            birthdayJLabel.setText(Dater.formatIt(choosenPerson.getBirthday()));
        }
        todayJLabel.setText(Dater.formatIt(LocalDate.now()));
        personsJList.setModel(adminOfPerson.getModel());
        if (!adminOfPerson.getPersons().isEmpty()) {
            personsJList.setSelectedIndex(0);

        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Anniversary);
        this.pack();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PersonJDialog personJDialog = new PersonJDialog(this, true);
                personJDialog.setSize(400, 200);
                personJDialog.setLocationRelativeTo(null);
                personJDialog.setVisible(true);

                Person newPerson = personJDialog.getPerson();
                if (newPerson != null) {
                    adminOfPerson.add(newPerson);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person choosenPerson = (Person) personsJList.getSelectedValue();
                if (choosenPerson != null) {
                    adminOfPerson.delete(choosenPerson);
                }
            }
        });
    }




}
