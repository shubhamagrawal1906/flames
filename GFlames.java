import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class GFlames extends JFrame implements ActionListener{
int la,lb;
private final JLabel l1,l2,l3,l4;
private final JTextField t1,t2;
private final JPanel p1,p2,p3,p4;
private final JButton bt;
GFlames(){
   setTitle("FLAMES"); 
   setVisible(true);
   setResizable(true); 
   setSize(400,300);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new GridLayout(4,1));
   p1=new JPanel();
   p1.setLayout(new FlowLayout());
   p2=new JPanel();
   p2.setLayout(new FlowLayout());  
   p3=new JPanel();
   p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
   p4=new JPanel();
   p4.setLayout(new FlowLayout());
   l1=new JLabel("",JLabel.CENTER);
   l2=new JLabel("",JLabel.CENTER);
   l3=new JLabel("",JLabel.CENTER);
   l4=new JLabel("",JLabel.CENTER);
   l4.setFont(new Font("",Font.ITALIC,36));
   l1.setText("Enter the first name");
   l2.setText("Enter the second name");
   l3.setText("Click the button\n");
   l3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
   t1=new JTextField(30);
   t2=new JTextField(30);
   bt=new JButton("RELATIONSHIP");
   bt.setAlignmentX(JButton.CENTER_ALIGNMENT);
   bt.addActionListener(new ActionListener(){
   @Override
  public void actionPerformed(ActionEvent e){
      String x = t1.getText();
      String y = t2.getText();
      fun(x,y);
      fun1();
   }
});
   
   add(p1);
   add(p2);
   add(p3);
   add(p4);
   p1.add(l1);  
   p1.add(t1);
   p2.add(l2);
   p2.add(t2);
   p3.add(l3);
   p3.add(Box.createVerticalStrut(5));
   p3.add(bt);       
   p4.add(l4);
}
    void fun(String x1,String y1){
        int i,j,c,x,y;
        char a[],b[];
        x1=x1.toLowerCase();
        y1=y1.toLowerCase();
        a=x1.toCharArray();
        b=y1.toCharArray();
        la=a.length;
        lb=b.length;
      
        for(i=0;i<la;i++)
{
c=0;
for(j=0;j<lb;j++)
{
if(a[i]==b[j])
{
for(x=i--;x<la-1;x++){
a[x]=a[x+1];
}
for(y=j;y<lb-1;y++){
b[y]=b[y+1];
}
c=1;
la--;
lb--;
}
if(c==1)
break;
}
}
    }

     void fun1(){
  char p[];
  String str ="flames";
  String ch=null;
  int i,j,k,l,lf=6;
        p=str.toCharArray();
        i=0;
        l=la+lb;
        for(k=0;k<6;k++){
            i+=((l%lf)-1);
            if(i<0)
               i=lf-1;
            else if(i>=lf)
                i=i%lf;
            for(j=i;j<lf-1;j++){
                p[j]=p[j+1];
            }
            lf--;
        }
        switch(p[lf])
{
case 'f':
ch="FRIENDS";
break;
case 'l':
ch="LOVE";
break;
case 'a':
ch="AFFECTION";
break;
case 'm':
ch="MARRIAGE";
break;
case 'e':
ch="ENEMIES";
break;
case 's':
ch="SIBLINGS";
break;
default:
System.out.println("\n Wrong Input");
}
        l4.setText(ch);
    }

public static void main(String args[]){
    GFlames ob = new GFlames();
}
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JTextField setAlignmentX(float CENTER_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
