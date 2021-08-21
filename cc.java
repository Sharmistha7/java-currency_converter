//Currecy Converter.

import javax.swing.*;																	//Importing reqired packages
import java.awt.*;
import java.awt.event.*;
import java.lang.*;


public class cc 
{
		public static void convert()
		{
			
			JFrame f=new JFrame("CONVERTER");											//Creating Frame
				
				
			JLabel l1,l2;																//Declraing labels
			JTextField t1,t2,t3,t4;														//Declaring TextFields
			JButton b1,b2,b3,b4;														//Declaring Buttons
			
			l1 = new JLabel("Rupees:");													//Assigning Labels
			l1.setBounds(20, 40, 60, 30);
			l2 = new JLabel("Dollars:");
			l2.setBounds(20, 80, 60, 30);
			
			t1 = new JTextField("");													//Assigning TextFields
			t1.setBounds(100, 40, 60, 30);
			
			t2 = new JTextField("");
			t2.setBounds(100, 80, 60, 30);
			
			t3 = new JTextField("");
			t3.setBounds(260,40,150,30);
			
			t4 = new JTextField("");
			t4.setBounds(260,80,150,30);
			
			b1 = new JButton("$");														//Assigning Buttons
			b1.setBounds(180, 40, 60, 25);
			b2 = new JButton("Rs");
			b2.setBounds(180, 80, 60, 25);
			b3 = new JButton("Close");
			b3.setBounds(250, 150, 80, 50);
			b4 = new JButton("Clear");
			b4.setBounds(150,150,80,50);
			
			
			b1.addActionListener(new ActionListener()									//ActionListener for button1
			{
				 public void actionPerformed(ActionEvent e)
            {
				 try																	//try and catch blocks for taking input only as nos
			{
					double f =Double.parseDouble(t1.getText());
					double f1= (f/74.30);
					String str= String.valueOf(String.format("%,.2f",f1));
					t3.setText(str);
			}
				catch (NumberFormatException n) 
			{
				JOptionPane.showMessageDialog(f,"Invalid Input");
			}
					
					
			}
			});
			
			
			b2.addActionListener(new ActionListener() 									//ActionListener for button2
			{
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						double f2 = Double.parseDouble(t2.getText());
						double f3= (f2 * 74.30);					
						String str2 = String.valueOf(String.format("%,.2f",f3));
						t4.setText(str2);
					}
					catch (NumberFormatException n) 
					{
						JOptionPane.showMessageDialog(f,"Invalid Input");
					}
									
				
				}
			});
			
			
			b3.addActionListener(new ActionListener()									//ActionListener for button3
			{
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
			});
				
			
			b4.addActionListener(new ActionListener()									//ActionListener for button4
			{
            public void actionPerformed(ActionEvent e)
            {			
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
			}
			});
	
			f.addWindowListener(new WindowAdapter() {									//Method for closing Frame
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
			});
			
			f.add(l1);																	//Adding all the components to frame
			f.add(t1);																	 
			f.add(l2);
			f.add(t2);
			f.add(t3);
			f.add(t4);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
  
        f.setLayout(null);
        f.setSize(500,300);
		f.setVisible(true);
    }
	

	public static void main(String args[])
	{
		convert();																		//Calling convert method 
	}
}
