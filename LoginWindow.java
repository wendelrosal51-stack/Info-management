import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
public class LoginWindow{
   ImageIcon image;

    void runLogin(){
        frame();
    }

    void frame(){
        JFrame frame = new JFrame();
        frame.setTitle("Info Management");
        frame.setIconImage(new ImageIcon("logo.png").getImage());
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.add(centerPanel());
        frame.add(topPanel());
        frame.add(leftPanel());
        frame.add(rightPanel());
        frame.setVisible(true);
        //frame.pack();
    }

    JPanel leftPanel(){
        JLabel leftlabel = new JLabel(); 
        JPanel leftPanel = new JPanel();

        leftlabel.setIcon(new ImageIcon("person1.png"));
        leftPanel.add(leftlabel);
        leftPanel.setBackground(Color.black);
        leftPanel.setBounds(1200, 550, 600, 500);
        return leftPanel;
    }

    JPanel rightPanel(){
        JLabel rightlabel = new JLabel(); 
        JPanel rightPanel = new JPanel();

        rightlabel.setIcon(new ImageIcon("person2.png"));
        rightPanel.add(rightlabel);
        rightPanel.setBackground(Color.black);
        rightPanel.setBounds(100, 550, 600, 500);
        return rightPanel;
    }

    JPanel topPanel(){
        JLabel toplabel = new JLabel(); 
        JPanel topPanel = new JPanel();

        toplabel.setIcon(new ImageIcon("banner.png"));
        topPanel.add(toplabel);
        topPanel.setBackground(Color.black);
        topPanel.setBounds(450, -50, 1100, 500);
        return topPanel;
    }

    JPanel centerPanel(){
        JLabel centerlabel = new JLabel(); 
        JPanel centerPanel = new JPanel();

        centerlabel.setIcon(new ImageIcon("logincard.png"));
        centerPanel.add(centerlabel);
        centerPanel.setOpaque(false);
       // centerPanel.setBackground(Color.green);
        centerPanel.setBounds(700, 250, 510, 775);
        return centerPanel;
    }

}