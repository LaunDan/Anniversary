import javax.swing.*;

public class OverviewJFrame extends JFrame {
    private JPanel Anniversary;

    public void OverviewJFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Anniversary);
        this.pack();
    }
    public static void main(String[] args){
        JFrame frame = new OverviewJFrame();
        frame.setTitle("Anniversary");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
