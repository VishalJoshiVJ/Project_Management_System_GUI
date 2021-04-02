package pmsgui;

import pmsgui.Group;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AssignProject extends Project {

	JFrame assProjectFrame;
	private JTextField grpNumTf;
	private JTextField titleTf;

	

	/**
	 * Create the application.
	 */
	public AssignProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		assProjectFrame = new JFrame("Academic Project Management System");
		assProjectFrame.setBounds(100, 100, 639, 336);
		assProjectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		assProjectFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Project Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(227, 11, 216, 24);
		assProjectFrame.getContentPane().add(lblNewLabel);
		
		JLabel grpNumLbl = new JLabel("Enter Group Number");
		grpNumLbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		grpNumLbl.setBounds(50, 69, 138, 14);
		assProjectFrame.getContentPane().add(grpNumLbl);
		
		grpNumTf = new JTextField();
		grpNumTf.setBounds(216, 67, 42, 20);
		assProjectFrame.getContentPane().add(grpNumTf);
		grpNumTf.setColumns(10);
		
		JLabel titleLbl = new JLabel("Project Title");
		titleLbl.setFont(new Font("Arial", Font.BOLD, 14));
		titleLbl.setBounds(64, 112, 111, 14);
		assProjectFrame.getContentPane().add(titleLbl);
		
		titleTf = new JTextField();
		titleTf.setBounds(227, 110, 267, 20);
		assProjectFrame.getContentPane().add(titleTf);
		titleTf.setColumns(10);
		
		JLabel taskLbl = new JLabel("Task");
		taskLbl.setFont(new Font("Arial", Font.BOLD, 14));
		taskLbl.setBounds(65, 170, 46, 14);
		assProjectFrame.getContentPane().add(taskLbl);
		
		JTextArea taskTa = new JTextArea();
		taskTa.setBounds(227, 156, 267, 39);
		assProjectFrame.getContentPane().add(taskTa);
		
		JButton assign = new JButton("Assign");
		assign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int grpNum = Integer.parseInt(grpNumTf.getText());
				JFrame f = new JFrame();
				
				try {
					if(grpNum > Group.grpCount) {
						throw new GroupNotAddedYetException("Group "+grpNum+" is not added yet");
					}
				project[grpNum] = new Project();
				project[grpNum].title = titleTf.getText();
				project[grpNum].task = taskTa.getText();
				
				
				JOptionPane.showMessageDialog(f, "Project Assigned Successfully for Group "+grpNum);
				
				}catch(GroupNotAddedYetException e1){
					JOptionPane.showMessageDialog(f, e1.getMessage());
				}
				
				assProjectFrame.setVisible(false);
				
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
		assign.setForeground(Color.WHITE);
		assign.setBackground(Color.BLACK);
		assign.setFont(new Font("Times New Roman", Font.BOLD, 14));
		assign.setBounds(169, 242, 89, 23);
		assProjectFrame.getContentPane().add(assign);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {		//Return to Home Page
			public void actionPerformed(ActionEvent e) {
				assProjectFrame.setVisible(false);
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
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(Color.BLACK);
		cancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cancel.setBounds(354, 242, 89, 23);
		assProjectFrame.getContentPane().add(cancel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT_MANAGEMENT_SYSTEM_GUI\\src\\images\\system.jpg"));
		lblNewLabel_1.setBounds(0, 0, 623, 297);
		assProjectFrame.getContentPane().add(lblNewLabel_1);
	}
}
