import javax.swing.*;
// FINAL WILL BE ON CHAPTERS: 6 - 12
import java.awt.*;
import java.awt.event.*;
/**Final Project Shahaf Dan */
public class Screen extends JFrame
{
    JLabel jl1; 
    JButton jb1, jb2, jb3, jb4;
    JPanel jp1;
    JTextField jtf1, jft2, jtf3;
    DaBa db = new DaBa();
    Color blueIsh;
    public Screen()
    {
        setTitle("Stoodent Home");
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        ///////
        jl1 = new JLabel("Welcome, to the class's project manager! ");
        
         
        jb1 = new JButton("New Project");
        jb2 = new JButton("Change an existing Project");
        jb3 = new JButton("See all projects");
        
        jtf1 = new JTextField("Project's Name", 30);
        blueIsh = new Color(21, 152, 166); // defining a new color
        
        
        add(jb1); add(jb2); add(jb3); add(jl1); add(jtf1);//add to our frame
        jl1.setBounds(50, 15, 450, 25);
        
        //design and activate jb1 ("New Project");
        jb1.setBounds(50,75, 200, 50);
        jb1.setFont(new Font("Calibri", Font.PLAIN, 14));
        jb1.setForeground(blueIsh);
        jb1.addActionListener(new ActionListener()
        {
            @Override
            public void showEles(ActionEvent ae)
            {
                add(jtf1);
            }
        });
       
        
        
        jb2.setBounds(300,75, 200,50);
        jb3.setBounds(550, 75, 200, 50);
    
        jp1 = new JPanel();
    }
    public static void main()
    {
        Screen s = new Screen();
    }
    public void addProject()
    {
        
        db.insertProject(title, c, sub, g, nm);
    }
}
