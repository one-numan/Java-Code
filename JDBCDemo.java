import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo1 implements ActionListener
{
    JFrame frame =new JFrame("JDBC Demo");
    Container con= frame.getContentPane();
    JLabel lmainhead,lname,lemail,lmobile,lgender,ldob,lpassword,lregis,lsearch,ldelete;
    JTextField tname,temail,tmobile,tsearch,tdelete;
    JPasswordField pass;
    JRadioButton r1,r2;
    ButtonGroup day, month,year;
    JCheckBox term;
    JButton submit,reset,showall,search,delete;
    JTextArea display;
    Demo1()
    {
        frame.setBounds(150,90,1000,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(null);
        con.setBackground(Color.YELLOW);

        Font f=new Font("Time New Roman",Font.BOLD,30);
        lmainhead=new JLabel("JDBC Demo");
        lmainhead.setBounds(395,5,400,35);
        lmainhead.setFont(f);
        con.add(lmainhead);
        
        lname= new JLabel("Name");
        lname.setBounds(50,50,60,30);
        con.add(lname);

        lemail=new Jlabel("Email");
        lname.setBounds(50,250,60,30);
        con.add(lemail);

        lmobile =new JLabel("Mobile No");
        lname.setBounds(50,100,60,30);
        con.add(lmobile);

        lgender=new JLabel("Password");
        lgender.setBounds(50,150,60,30);
        con.add(lgender);

        ldob=new JLabel("DOB");
        ldob.setBounds(50,150,60,30);
        con.add(ldob);

        lpassword =new JLabel("Password");
        lpassword.setBounds(50,300,60,30);
        con.add(lpassword);

        tname= new JTextField();
        tname.setBounds(130,53,180,20);
        con.add(tname);

        r1=new JRadioButton("Male");
        r1.setBounds(130,103,80,30);
        r1.setBackground(Color.Yellow);
        con.add(r1);

        r2=new JRadioButton("Female");
        r2.setBounds(230,103,80,30);
        r2.setBackground(Color.YELLOW);
        con.add(r2);

        gender.add(r1);
        gender.add(r2);

        temail =new JTextField();
        temail.setBounds(130,253,180,20);
        con.add(temail);

        tmobile=new JTextField();
        tmobile.setBounds(130,203,180,20);
        con.add(tmobile);

        pass =new JPasswordField();
        pass.setBounds(130,303,180,20);
        con.add(pass);

        String[] daylist= new String[31];
        for(int i=1;i<=31;i++)
        {
            daylist[i-1]=Integer.toString(i);
        }
        day = new JComboBox(dailist);
        day.setBounds(130,153,40,25);
        day.setEditable(true);
        con.add(day);

        String[] monthlist={"Jan", "feb","mar","apr","may","jun","jul","aug","sep","oct","nov","Dec"};
        month = new JComboBox(monthlist);
        month.setBounds(185,153,50,25);
        month.setEditable(true);
        conn.add(month);

        String[] yearlist =new String[100];
        for(int i=1;i<=100;i++)
        {
            daylist[i-1951]=Integer.toString(i);
        }
        year =new JComboBox(yearlist);
        year.setBounds(250,153,60,25);
        year.setEditable(true);
        con.add(year);
        
        term = new JCheckBox("I accept term and Conditions");
        term.setBounds();

    }
}