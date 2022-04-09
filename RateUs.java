import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;



class FeedBack extends JFrame
{
    FeedBack()
    {
       FrameCreator(); 
    }
    
    FeedBack(String s)
    {
        super(s);
        FrameCreator();
    }
    
    public void setScrren() {
        setLayout(null);
        setVisible(true);
        setSize(600,600);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispatchEvent(new WindowEvent(null, WindowEvent.WINDOW_CLOSING));
    }
    
    public void FrameCreator()
    {
        //initilization of compunent
        JLabel L_TOP,L_Feedback;
        JTextArea T_Feedback;
        JButton B_Submit;
        
        
        //memmory allocation of compunents
        L_TOP=new JLabel("PLEASE GIVE YOUR FEEDBACK");
        L_Feedback=new JLabel("PLEASE GIVE US FEEDBACK FOR YOUR BETTER EXPERINCE");
        
        T_Feedback=new JTextArea();
        B_Submit=new JButton("SUBMIT");
        
        //size set
        L_TOP.setBounds(150, 50, 400, 50);
        L_Feedback.setBounds(100, 200, 400, 50);
        T_Feedback.setBounds(80, 250, 400, 200);
        B_Submit.setBounds(250, 500, 80, 30);
        
        
        //adding compunent in java
        add(L_TOP);
        add(L_Feedback);
        add(T_Feedback);
        add(B_Submit);
        
        
        //calling actionlistener
        B_Submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //code
                //new ToolCreater();
                JOptionPane.showMessageDialog(null,"this project is underconstruction"," ",JOptionPane.PLAIN_MESSAGE);
                
                
            }
        });

        //scrren set
        setScrren();
    }
}



public class RateUs {
    public static void main(String[] args)
    {
        FeedBack f=new FeedBack("FEEDBACK");
    }
    
}
