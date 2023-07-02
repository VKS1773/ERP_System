
package erp.portal.pkgfor.institutions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteFaculty extends JFrame implements ActionListener{
    
    
    JTextField tfddate;
    JLabel labelrollno,labeldob,labelx,labelxii,labelaadhar,labeladdate,labeladdress,labelphone,labelemail,labelcourse ,labelbranch ,labelname,labelfname;
    JButton submit, cancel;
    Choice crollno;
    String name,fname,dob,rollno,aadhar,address,x,xii,phone,email,course,branch,addate;
    DeleteFaculty() {
        
        setSize(900, 650);
        setLocation(350, 50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("Delete Teacher Details");
        heading.setBounds(50, 10, 500, 50);
        heading.setFont(new Font("Tahoma", Font.ITALIC, 35));
        add(heading);
        
        JLabel lblrollnumber = new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 100, 200, 20);
        lblrollnumber.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(250, 100, 200, 20);
        add(crollno);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);
        
         labelname = new JLabel();
        labelname.setBounds(200, 150, 150, 30);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelname);
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblfname);
        
         labelfname = new JLabel();
        labelfname.setBounds(600, 150, 150, 30);
        labelfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelfname);
        
        JLabel lblrollno = new JLabel("EmpID");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 20));
        add(lblrollno);
        
        labelrollno = new JLabel();
        labelrollno.setBounds(200, 200, 200, 30);
        labelrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelrollno);
        
        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);
        
         labeldob = new JLabel();
        labeldob.setBounds(600, 200, 150, 30);
        labeldob.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labeldob);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladdress);
        
         labeladdress = new JLabel();
        labeladdress.setBounds(200, 250, 150, 30);
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);
        
        labelphone = new JLabel();
        labelphone.setBounds(600, 250, 150, 30);
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);
        
       labelemail = new JLabel();
        labelemail.setBounds(200, 300, 150, 30);
        add(labelemail);
        
        JLabel lblx = new JLabel("Class X (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 20));
        add(lblx);
        
         labelx = new JLabel();
        labelx.setBounds(600, 300, 150, 30);
        labelx.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelx);
        
        JLabel lblxii = new JLabel("Class XII (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif", Font.BOLD, 20));
        add(lblxii);
        
        labelxii = new JLabel();
        labelxii.setBounds(200, 350, 150, 30);
        labelxii.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelxii);
        
        JLabel lblaadhar = new JLabel("Aadhar Number");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("serif", Font.BOLD, 20));
        add(lblaadhar);
        
         labelaadhar = new JLabel();
        labelaadhar.setBounds(600, 350, 150, 30);
        labelaadhar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labelaadhar);
        
        JLabel lblcourse = new JLabel("Qualification");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add(lblcourse);
        
         labelcourse = new JLabel();
        labelcourse.setBounds(200, 400, 150, 30);
        add(labelcourse);
        
        JLabel lblbranch = new JLabel("Department");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 20));
        add(lblbranch);
        
         labelbranch = new JLabel();
        labelbranch.setBounds(600, 400, 150, 30);
        add(labelbranch);
        
        JLabel lbladdate = new JLabel("Joining Date");
        lbladdate.setBounds(50, 450, 200, 30);
        lbladdate.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladdate);
        
         labeladdate = new JLabel();
        labeladdate.setBounds(200, 450, 150, 30);
        labeladdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(labeladdate);
        
        JLabel lblddate = new JLabel("Delete Date");
        lblddate.setBounds(400, 450, 200, 30);
        lblddate.setFont(new Font("serif", Font.BOLD, 20));
        add(lblddate);
        
        tfddate = new JTextField();
        tfddate.setBounds(600, 450, 150, 30);
        add(tfddate);
        
        
        try {
            Conn c = new Conn();
            String query = "select * from teacher where rollno='"+crollno.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                labelname.setText(rs.getString("name"));
                name=rs.getString("name");
                labelfname.setText(rs.getString("fname"));
                fname=rs.getString("fname");
                labeldob.setText(rs.getString("dob"));
                dob=rs.getString("dob");
                labeladdress.setText(rs.getString("address"));
                address=rs.getString("address");
                labelphone.setText(rs.getString("phone"));
                phone=rs.getString("phone");
                labelemail.setText(rs.getString("email"));
                email=rs.getString("email");
                labelx.setText(rs.getString("class_x"));
                x=rs.getString("class_x");
                labelxii.setText(rs.getString("class_xii"));
                xii=rs.getString("class_xii");
                labelaadhar.setText(rs.getString("aadhar"));
                aadhar=rs.getString("aadhar");
                labelrollno.setText(rs.getString("rollno"));
                rollno=rs.getString("rollno");
                labelcourse.setText(rs.getString("qualification"));
                course=rs.getString("qualification");
                labelbranch.setText(rs.getString("department"));
                branch=rs.getString("department");
                labeladdate.setText(rs.getString("cudate"));
                addate=rs.getString("cudate");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Conn c = new Conn();
                    String query = "select * from teacher where rollno='"+crollno.getSelectedItem()+"'";
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()) {
                        labelname.setText(rs.getString("name"));
                         name=rs.getString("name");
                        labelfname.setText(rs.getString("fname"));
                         fname=rs.getString("fname");
                        labeldob.setText(rs.getString("dob"));
                         dob=rs.getString("dob");
                        labeladdress.setText(rs.getString("address"));
                         address=rs.getString("address");
                        labelphone.setText(rs.getString("phone"));
                         phone=rs.getString("phone");
                        labelemail.setText(rs.getString("email"));
                         email=rs.getString("email");
                         labelx.setText(rs.getString("class_x"));
                         x=rs.getString("class_x");
                        labelxii.setText(rs.getString("class_xii"));
                        xii=rs.getString("class_xii");
                        labelaadhar.setText(rs.getString("aadhar"));
                        aadhar=rs.getString("aadhar");
                        labelrollno.setText(rs.getString("rollno"));
                        rollno=rs.getString("rollno");
                        labelcourse.setText(rs.getString("qualification"));
                        course=rs.getString("qualification");
                        labelbranch.setText(rs.getString("department"));
                        branch=rs.getString("department");
                        labeladdate.setText(rs.getString("cudate"));
                        addate=rs.getString("cudate");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        submit = new JButton("Delete");
        submit.setBounds(250, 500, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 500, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {

            String deletedate=(String)tfddate.getText();
            
            try {
                String query="insert into pastteacher values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"','"+addate+"','"+deletedate+"')";
                String query1="Delete from teacher where rollno='"+crollno.getSelectedItem()+"'";
                Conn con = new Conn();
                Conn con1=new Conn();
                con.s.executeUpdate(query);
                con.s.executeUpdate(query1);
                
                JOptionPane.showMessageDialog(null, "Faculty Details Deleted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new DeleteFaculty();
    }
    }

