
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;

class RegistrationFrame extends JFrame {

    public RegistrationFrame() {
        FrameCreator();

    }

    public RegistrationFrame(String s) {
        super(s);
        FrameCreator();
    }

    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(800, 800);
        dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
    }

    public void FrameCreator() {
        JLabel L_CreateAccount, L_Name, L_Gender, L_PhoneNo, L_Email, L_Password, L_RePassword, L_CheckButton;
        JTextField T_Name, T_PhoneNo, T_Email, T_CheckButton;
        JPasswordField P_Password, P_RePassword;
        JRadioButton R_Male, R_Female;
        JCheckBox C_ChechBox;
        JButton B_Submit;

        //
        L_CreateAccount = new JLabel("CREATE   ACCOUNT");
        L_Name = new JLabel("YOUR  NAME");
        L_Gender = new JLabel("ENTER YOUR GENDER");
        L_PhoneNo = new JLabel("PHONE NO");
        L_Email = new JLabel("EMAIL ADDRESS");
        L_Password = new JLabel("PASSWORD");
        L_RePassword = new JLabel("CONFORM PASSWORD");
        L_CheckButton = new JLabel("I HAD READ ALL THE TERMS AND CONDITIONS");

        T_Name = new JTextField();
        T_PhoneNo = new JTextField();
        T_Email = new JTextField();
        T_CheckButton = new JTextField();
        P_Password = new JPasswordField();

        P_RePassword = new JPasswordField();
        R_Male = new JRadioButton("MALE");
        R_Female = new JRadioButton("FEMALE");
        ButtonGroup bg=new ButtonGroup();
        bg.add(R_Male);
        bg.add(R_Female);
        C_ChechBox = new JCheckBox();
        B_Submit=new JButton("SUBMIT");
        

        //dimension seeting
        L_CreateAccount.setBounds(280, 25, 300, 50);
        L_Name.setBounds(50, 150, 100, 30);
        T_Name.setBounds(180,150,400,30);
        L_Gender.setBounds(50, 210, 150, 30);
        R_Male.setBounds(200, 210, 200, 30);  
        R_Female.setBounds(200, 260, 200, 30);        
        L_PhoneNo.setBounds(50, 310, 100, 30); 
        T_PhoneNo.setBounds(180,310,400,30);
        L_Email.setBounds(50, 360, 100, 30);        
                
        T_Email.setBounds(180, 360, 400, 30);       
                
        L_Password.setBounds(50, 410, 100, 30);    
        P_Password.setBounds(180, 410, 400, 30);   
        L_RePassword.setBounds(50, 460, 130, 30);   
        P_RePassword.setBounds(180, 460, 400, 30);  
        C_ChechBox.setBounds(50, 560, 50, 30);  
        L_CheckButton.setBounds(100, 560, 300, 30);  
        B_Submit.setBounds(300, 650, 100, 30);  
                
        
        
        
        add(L_CreateAccount);
        add(L_Name);
        add(L_Gender);
        add(L_PhoneNo);
        add(L_Email);
        add(L_Password);
        add(L_RePassword);
        add(L_CheckButton);
        add(T_Name);
        add(T_PhoneNo);
        add(T_Email);
        add(T_CheckButton);
        add(P_Password);
        add(P_RePassword);
        add(R_Male);
        add(R_Female);
        add(C_ChechBox);
        add(B_Submit);
               
        
        
         //calling actionlistener
        B_Submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //code
               
                
                JOptionPane.showMessageDialog(null,"this project is underconstruction"," ",JOptionPane.INFORMATION_MESSAGE);
                //new LoginFrame();
                dispose();
               
                
                
            }
        });
        
        
        
        
        
        
        setScrren();

    }

}

public class Registration {

    public static void main(String[] args) {
        RegistrationFrame r = new RegistrationFrame("Registration Form");
    }

}
