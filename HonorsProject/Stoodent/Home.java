
import javax.swing.*;

import java.awt.*;
/** */
public class Home extends JFrame
{
    JLabel jl;
    JButton jb;
    JPanel jp, jp2;
    public Home()
    {   
        setTitle("Stoodent Home");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        jp = new JPanel();
        jp2 = new JPanel();
        jp.setLayout(new FlowLayout(2)); //FlowLayout(int align, int HoriGap, int, VertiGap);
        
        jl = new JLabel("This is a message");
        //add(jl);
        // set Resizeable(false);
        //gridLayout
        //.setBackground(Color.COLOR);
        // JLAbels can set images jl.setIcon(new ImageIcon("PATH"));
        // JButtons an be with images too jb.setIcon(new ImageIcon(""PATH));
        
        //actionsListenere for buttons:
        //jb.addActionListener(new ActionListener()
        //{
         //   public void actionPerformed(ActionEvent e)
         //{
             
          //
       // }
        //});
        jb = new JButton("This is a button");
        //add(jb);
        jp.add(jl);
        jp.add(jb);
        
        add(jp);
        
        jp2.add(jb);
        add(jp2, BorderLayout.SOUTH);
        
    }
   
    //public void paint(Graphics g)
    //{
       // .drawRect(x, y, w, h);
       //.fillRect(x,y,w,h);
       //.drawOval(x, y, horiRad, VertiRad); //oval = circle               
       //.drawLine(x1, y1, x2, y2);
        
    //}
    public static void main()
    {
        Home h = new Home();
        
    }
}
