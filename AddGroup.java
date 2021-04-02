package pmsgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddGroup extends Group{

	JFrame addGrpFrame;
	private JTextField leadNameTf;
	private JTextField leadUsnTf;
	private JTextField mem1NameTf;
	private JTextField mem1UsnTf;
	private JTextField mem2NameTf;
	private JTextField mem2UsnTf;
	private JTextField mem3NameTf;
	private JTextField mem3UsnTf;

	

	/**
	 * Create the application.
	 */
	public AddGroup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addGrpFrame = new JFrame("Academic Project Management System");
		addGrpFrame.setBounds(100, 100, 768, 497);
		addGrpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addGrpFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Group Details");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(253, 24, 275, 36);
		addGrpFrame.getContentPane().add(lblNewLabel);
		
		JLabel leadLbl = new JLabel("Group Leader :");
		leadLbl.setFont(new Font("Arial", Font.BOLD, 14));
		leadLbl.setBounds(119, 105, 148, 14);
		addGrpFrame.getContentPane().add(leadLbl);
		
		JLabel mem1Lbl = new JLabel("Group Member 1 :");
		mem1Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		mem1Lbl.setBounds(119, 178, 148, 14);
		addGrpFrame.getContentPane().add(mem1Lbl);
		
		JLabel mem2Lbl = new JLabel("Group Member 2 :");
		mem2Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		mem2Lbl.setBounds(119, 252, 148, 14);
		addGrpFrame.getContentPane().add(mem2Lbl);
		
		JLabel mem3Lbl = new JLabel("Group Member 3 :");
		mem3Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		mem3Lbl.setBounds(119, 330, 148, 14);
		addGrpFrame.getContentPane().add(mem3Lbl);
		
		JLabel leadNameLbl = new JLabel("Name");
		leadNameLbl.setFont(new Font("Arial", Font.BOLD, 12));
		leadNameLbl.setBounds(178, 130, 46, 14);
		addGrpFrame.getContentPane().add(leadNameLbl);
		
		JLabel leadUsnLbl = new JLabel("USN");
		leadUsnLbl.setFont(new Font("Arial", Font.BOLD, 12));
		leadUsnLbl.setBounds(451, 130, 46, 14);
		addGrpFrame.getContentPane().add(leadUsnLbl);
		
		leadNameTf = new JTextField();
		leadNameTf.setBounds(234, 130, 123, 20);
		addGrpFrame.getContentPane().add(leadNameTf);
		leadNameTf.setColumns(10);
		
		leadUsnTf = new JTextField();
		leadUsnTf.setBounds(507, 127, 132, 20);
		addGrpFrame.getContentPane().add(leadUsnTf);
		leadUsnTf.setColumns(10);
		
		JLabel mem1NameLbl = new JLabel("Name");
		mem1NameLbl.setFont(new Font("Arial", Font.BOLD, 13));
		mem1NameLbl.setBounds(178, 204, 46, 14);
		addGrpFrame.getContentPane().add(mem1NameLbl);
		
		JLabel mem1UsnLbl = new JLabel("USN");
		mem1UsnLbl.setFont(new Font("Arial", Font.BOLD, 13));
		mem1UsnLbl.setBounds(451, 204, 46, 14);
		addGrpFrame.getContentPane().add(mem1UsnLbl);
		
		JLabel mem2NameLbl = new JLabel("Name");
		mem2NameLbl.setFont(new Font("Arial", Font.BOLD, 13));
		mem2NameLbl.setBounds(178, 277, 46, 14);
		addGrpFrame.getContentPane().add(mem2NameLbl);
		
		JLabel mem2UsnLbl = new JLabel("USN");
		mem2UsnLbl.setFont(new Font("Arial", Font.BOLD, 13));
		mem2UsnLbl.setBounds(451, 277, 46, 14);
		addGrpFrame.getContentPane().add(mem2UsnLbl);
		
		JLabel mem3NameLbl = new JLabel("Name");
		mem3NameLbl.setFont(new Font("Arial", Font.BOLD, 13));
		mem3NameLbl.setBounds(178, 355, 46, 14);
		addGrpFrame.getContentPane().add(mem3NameLbl);
		
		JLabel mem3UsnLbl = new JLabel("USN");
		mem3UsnLbl.setFont(new Font("Arial", Font.BOLD, 13));
		mem3UsnLbl.setBounds(451, 355, 46, 14);
		addGrpFrame.getContentPane().add(mem3UsnLbl);
		
		mem1NameTf = new JTextField();
		mem1NameTf.setBounds(234, 201, 123, 20);
		addGrpFrame.getContentPane().add(mem1NameTf);
		mem1NameTf.setColumns(10);
		
		mem1UsnTf = new JTextField();
		mem1UsnTf.setBounds(507, 201, 132, 20);
		addGrpFrame.getContentPane().add(mem1UsnTf);
		mem1UsnTf.setColumns(10);
		
		mem2NameTf = new JTextField();
		mem2NameTf.setBounds(234, 276, 123, 20);
		addGrpFrame.getContentPane().add(mem2NameTf);
		mem2NameTf.setColumns(10);
		
		mem2UsnTf = new JTextField();
		mem2UsnTf.setBounds(507, 274, 132, 20);
		addGrpFrame.getContentPane().add(mem2UsnTf);
		mem2UsnTf.setColumns(10);
		
		mem3NameTf = new JTextField();
		mem3NameTf.setBounds(234, 352, 123, 20);
		addGrpFrame.getContentPane().add(mem3NameTf);
		mem3NameTf.setColumns(10);
		
		mem3UsnTf = new JTextField();
		mem3UsnTf.setBounds(507, 352, 132, 20);
		addGrpFrame.getContentPane().add(mem3UsnTf);
		mem3UsnTf.setColumns(10);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				grpCount++;
				group[grpCount] = new Group();
				group[grpCount].groupLeaderName = leadNameTf.getText();
				group[grpCount].groupLeaderUsn = leadUsnTf.getText();
				group[grpCount].grpMemberName[0] = mem1NameTf.getText();
				group[grpCount].grpMemberUsn[0] = mem1UsnTf.getText();
				group[grpCount].grpMemberName[1] = mem2NameTf.getText();
				group[grpCount].grpMemberUsn[1] = mem2UsnTf.getText();
				group[grpCount].grpMemberName[2] = mem3NameTf.getText();
				group[grpCount].grpMemberUsn[2] = mem3UsnTf.getText();
				group[grpCount].grpNumber = grpCount;
				
				JFrame f  = new JFrame();
				JOptionPane.showMessageDialog(f  , "Group " +grpCount+" Added Successfully");
				
				addGrpFrame.setVisible(false);
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							User window = new User();
							window.userFrame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLACK);
		submit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		submit.setBounds(220, 411, 89, 23);
		addGrpFrame.getContentPane().add(submit);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {		//Return to Home Page
			public void actionPerformed(ActionEvent e) {
				addGrpFrame.setVisible(false);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							User window = new User();
							window.userFrame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		cancel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setBounds(408, 411, 89, 23);
		addGrpFrame.getContentPane().add(cancel);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT_MANAGEMENT_SYSTEM_GUI\\src\\images\\sppot light.jpg"));
		lblNewLabel_13.setBounds(0, 0, 752, 458);
		addGrpFrame.getContentPane().add(lblNewLabel_13);
	}

}
