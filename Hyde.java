package thrace;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Ross
 */
public class Hyde {
    private JFrame f;
    private JPanel p1,p2,p3,p4;
    private JTextField f1,f2,f3,f4;
    private JButton b1,b2,b3,b4;
    private ButtonGroup g1;
    private JLabel l1,l2,l3,l4;
    private String temp1,temp2,temp3,temp4;
    private JRadioButton r1,r2;
    private LemonJuice lime;    
    public Hyde(){
        lime=new LemonJuice();
        f=new JFrame("Translate");
        g1=new ButtonGroup();
        p1=new JPanel();p2=new JPanel();p3=new JPanel();
        f1=new JTextField(64);f2=new JTextField(64);
        f3=new JTextField(64);f4=new JTextField(64);
        b1=new JButton("Execute");
        b2=new JButton();
        l1=new JLabel("Input: ");
        l2=new JLabel("Output: ");
        r1=new JRadioButton("Encrypt");
        r2=new JRadioButton("Decrypt");
        r1.setSelected(true);
        g1.add(r1);g1.add(r2);
        p1.add(l1);p1.add(f1);
        p2.setBorder(new TitledBorder("Action"));
        p2.add(r1);p2.add(r2);p2.add(b1);
        p3.add(l2);p3.add(f2);
        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.CENTER);
        f.add(p3,BorderLayout.SOUTH);
        oar();and();}
    private void and(){f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(150,100);f.pack();f.setVisible(true);}
    private void oar(){
        b1.addActionListener(
        new ActionListener(){public void actionPerformed(ActionEvent ae){
            try{
                if(r1.isSelected()){
                    f2.setText(lime.Ink(f1.getText(),1));
                }else if(r2.isSelected()){
                    f2.setText(lime.Ink(f1.getText(),2));}}
            catch(Exception e){}
            finally{}}});
        b2.addActionListener(
        new ActionListener(){public void actionPerformed(ActionEvent ae){
            try{
               }
            catch(Exception e){}
            finally{}}});}
    public static void main(String[] ant)throws Exception{
        try{Hyde h=new Hyde();}
        catch(Exception e){System.err.print(e);}}}

