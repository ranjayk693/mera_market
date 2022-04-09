

import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;

public class MeraMarket {

    public static void main(String[] args) {
        ToolCreater t = new ToolCreater("MeraMarket");
    }

}

class ToolCreater extends JFrame {

    public ToolCreater() {
        FrameCreator();
    }

    public ToolCreater(String s) {
        super(s);
        FrameCreator();
    }

    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(1367, 810);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setBackground() {
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("SwingBackground\\mm.jpg")));

    }

    public void SaleImage() {
        //BufferedImage myPicture = ImageIO.read(new File("D:\\projects\\HoliSale\\HoliSale.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon("HoliSale\\HoliSale.jpg"));
        add(picLabel);
        //picLabel.SetBounds(50,300,907,484);
        picLabel.setBounds(120, 200, 907, 484);

    }

    public void FrameCreator() {
        //calling background function
        setBackground();

        //initalization of compunents
        //1st row compunent intilization
        JLabel L_Search;
        JTextField T_SearchBox;
        JButton B_Search, B_Account, B_Wishlist, B_Cart, B_Feedback;

        //2nd row compunent intilization
        JComboBox C_Fashions, C_Electronics, C_Home, C_Application;

        //memmory allocation of compunents
        //1st row memmory allocation 
        L_Search = new JLabel("Search");
        T_SearchBox = new JTextField();
        T_SearchBox = new JTextField();
        B_Feedback = new JButton(new ImageIcon("SwingIcon\\feedback.jpg"));
        B_Search = new JButton(new ImageIcon("SwingIcon\\search_icon.png"));
        B_Account = new JButton(new ImageIcon("SwingIcon\\login.jpg"));
        B_Wishlist = new JButton(new ImageIcon("SwingIcon\\wishlet.jpg"));
        B_Cart = new JButton(new ImageIcon("SwingIcon\\swing_kart.jpg"));

        //2nd row memmory allocation
        String[] fashion = {"fashion", "Men's Top wear", "Men's Bottom wear", "Female's Top wear", "Female's Bottom wear"};
        C_Fashions = new JComboBox(fashion);

        String[] Electronics = {"Electronics", "Laptop and Desktop", "Audio", "Mobiles", "Tablets"};
        C_Electronics = new JComboBox(Electronics);

        String[] Application = {"Applications", "Televisions", "Wasing machine", "Air conditioners"};
        C_Application = new JComboBox(Application);

        String[] Home = {"Home", "Home Furnishings", "Living Room", "Kitchen & Dining", "Bedroom"};
        C_Home = new JComboBox(Home);

        //adding the compunent into frame
        //1st row
        add(L_Search);
        add(B_Feedback);
        add(T_SearchBox);
        //add(C_Categories);
        add(B_Search);
        add(B_Account);
        add(B_Wishlist);
        add(B_Cart);

        //2nd row
        add(C_Fashions);
        add(C_Electronics);
        add(C_Application);
        add(C_Home);

        //setting up the dimension in frame
        //1st row     
        L_Search.setBounds(400, 25, 50, 50);
        T_SearchBox.setBounds(460, 25, 300, 40);

        B_Search.setBounds(765, 25, 50, 35);
        B_Account.setBounds(900, 5, 90, 81);
        B_Wishlist.setBounds(1000, 5, 90, 81);
        B_Cart.setBounds(1100, 5, 90, 81);
        B_Feedback.setBounds(1250, 5, 90, 81);

        //2nd row
        C_Fashions.setBounds(100, 150, 200, 50);
        C_Electronics.setBounds(400, 150, 200, 50);
        C_Application.setBounds(700, 150, 200, 50);
        C_Home.setBounds(1000, 150, 200, 50);

        //calling actionlistener
        B_Feedback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //code
                new FeedBack();
                JOptionPane.showMessageDialog(null, "Please give us FeedBack", "FeedBack", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "currently this project is not completed", " ", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "please login first", " LOGIN", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Wishlist.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Please login first", "WISHLIST", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        B_Cart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "please login first", "CART", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        //adding image
        SaleImage();

        setScrren();

    }
}
