package annniversary;

import javax.swing.*;
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

    public OverviewJFrame() {

        todayJLabel.setText(Dater.formatIt(LocalDate.now()));
        personsJList.setModel(adminOfPerson.getModel());
        if (!adminOfPerson.getPersons().isEmpty()){
            personsJList.setSelectedIndex(0);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Anniversary);
        this.pack();

    }


    public static void main(String[] args) {
        JFrame frame = new OverviewJFrame();
        frame.setTitle("Anniversary");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

}
