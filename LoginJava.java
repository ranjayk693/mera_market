
import java.awt.event.*;
import javax.swing.*;

class LoginFrame extends JFrame  {

    LoginFrame() {
        FrameCreator();
    }

    LoginFrame(String s) {
        super(s);
        FrameCreator();
    }

    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(600, 700);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
    }

    public void FrameCreator() {
        //defineing the compunent
        JLabel L_UserId, L_psd;
        JTextField T_UserTextArea;
        JPasswordField P_Pass;
        
        JButton B_Login, B_Skip, B_Exit ,J_BRegistration;

        //allocation of memmory to compunents
        L_UserId = new JLabel("USER ID");
        L_psd = new JLabel("PASSWORD");
        T_UserTextArea = new JTextField();
        P_Pass = new JPasswordField();
        B_Login = new JButton("LOGIN");
        B_Skip = new JButton("SKIP");
        B_Exit = new JButton("EXIT");
        J_BRegistration= new JButton("CREATE  YOUR  ACCOUNT  WITH   MeraMarket");
        
        //set the dimension
        L_UserId.setBounds(75, 100, 115, 20);
        T_UserTextArea.setBounds(225, 100, 260, 20);
        L_psd.setBounds(75, 200, 115, 20);
        P_Pass.setBounds(225, 200, 260, 20);  
        B_Login.setBounds(75, 300, 70, 30);        
        B_Skip.setBounds(250, 300, 70, 30); 
        B_Exit.setBounds(425, 300, 70, 30);       
        J_BRegistration.setBounds(75, 380, 400, 30);  
                
            
                
       
        
        
        //adding the element
        add(L_UserId);
        add(L_psd);
        
        add(T_UserTextArea);
        add(P_Pass);
        
        add(B_Login);
        add(B_Skip);
        add(B_Exit);
        add(J_BRegistration);     
        
        
        
        
        //event handling 
        
        
        B_Login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              String s=T_UserTextArea.getText();
              JOptionPane.showMessageDialog(null,"Dear "+s+"  we are currently facing issue so please press skip button to jump in MeraMarket" ," ",JOptionPane.INFORMATION_MESSAGE);
              //GET PASSWORD AND TEXT COMPARE AND THEN LOGIN
               
               }
        });
        
        
        
        B_Skip.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new ToolCreater();
               dispose();
               }
        });
        
        
        B_Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               System.exit(0);
            }
        });
        
        
        
        J_BRegistration.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new RegistrationFrame();
               dispose();
            }
        });
        //calling the frame
        setScrren();
        
    // gthis is just commentg
    }
}

public class LoginJava {
    public static void main(String[] args)
    {
        LoginFrame b = new LoginFrame("user login");
    }

    
}
