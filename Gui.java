import javax.swing.*;
import java.awt.*;

class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("POS System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);


        // make the menu for header 
        JMenuBar mb = new JMenuBar(); //menu bar 
        mb.setOpaque(true);
        mb.setBackground(Color.WHITE); // making background color 
        mb.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // set the size and boder

        // file name in the menu 
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Function");
        JMenu m3 = new JMenu("Orders");
        JMenu m4 = new JMenu("Exit");
        JMenu m5 = new JMenu("Reports");
        JMenu m6 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        mb.add(m6);

        // name in the file 
        JMenuItem m12 = new JMenuItem("Open");
        JMenuItem m13 = new JMenuItem("Save as");
        JMenuItem m14 = new JMenuItem("File Folder");
        JMenuItem m15 = new JMenuItem("More Option");
        JMenuItem m16 = new JMenuItem("Contact");
        JMenuItem m17 = new JMenuItem("Policy");
        JMenuItem m18 = new JMenuItem("Till balance");
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);
        m1.add(m17);
        m1.add(m18);

       // set the name of the project second name 
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS)); // Vertical stacking

        JLabel label1 = new JLabel("POS SALES", SwingConstants.LEFT);
        label1.setBorder(BorderFactory.createEmptyBorder(10, 15, 5, 15));
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setOpaque(true);
        

        JLabel label2 = new JLabel("MINI MART", SwingConstants.LEFT);
        label2.setBorder(BorderFactory.createEmptyBorder(5, 15, 10, 15));
        label2.setFont(new Font("Arial", Font.ITALIC,15));
        label2.setOpaque(true);
        

        topPanel.add(label1);
        topPanel.add(label2);

        JTextArea ta = new JTextArea();

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        inputPanel.add(label);
        inputPanel.add(tf);
        inputPanel.add(send);
        inputPanel.add(reset);

        frame.setJMenuBar(mb);
        frame.getContentPane().add(topPanel, BorderLayout.NORTH);  // Added here!
        frame.getContentPane().add(ta, BorderLayout.CENTER);
        frame.getContentPane().add(inputPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
