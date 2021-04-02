package pmsgui;

import pmsgui.Group;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AssignMarks extends Marks {

	JFrame assMarksFrame;
	private JTextField grpNumTf;
	private JTextField reMarksTf1;
	private JTextField reMarksTf2;
	private JTextField reMarksTf3;
	private JTextField reMarksTf4;
	private JTextField preMarksTf1;
	private JTextField preMarksTf2;
	private JTextField preMarksTf3;
	private JTextField preMarksTf4;

	

	/**
	 * Create the application.
	 */
	public AssignMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		assMarksFrame = new JFrame("Academic Project Management System");
		assMarksFrame.setBounds(100, 100, 893, 495);
		assMarksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		assMarksFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Marks");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(295, 24, 273, 30);
		assMarksFrame.getContentPane().add(lblNewLabel);
		
		JLabel grpNumLbl = new JLabel("Enter Group Number");
		grpNumLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		grpNumLbl.setBounds(133, 92, 154, 14);
		assMarksFrame.getContentPane().add(grpNumLbl);
		
		grpNumTf = new JTextField();
		grpNumTf.setBounds(295, 90, 49, 20);
		assMarksFrame.getContentPane().add(grpNumTf);
		grpNumTf.setColumns(10);
		
		JLabel tltleLbl_1 = new JLabel("Enter Marks for Report for all Group Members");
		tltleLbl_1.setFont(new Font("Arial", Font.BOLD, 14));
		tltleLbl_1.setBounds(133, 155, 326, 14);
		assMarksFrame.getContentPane().add(tltleLbl_1);
		
		JLabel lbl1 = new JLabel("1.");
		lbl1.setFont(new Font("Arial", Font.BOLD, 14));
		lbl1.setBounds(133, 203, 29, 14);
		assMarksFrame.getContentPane().add(lbl1);
		
		reMarksTf1 = new JTextField();
		reMarksTf1.setBounds(169, 201, 49, 20);
		assMarksFrame.getContentPane().add(reMarksTf1);
		reMarksTf1.setColumns(10);
		
		JLabel lbl2 = new JLabel("2.");
		lbl2.setFont(new Font("Arial", Font.BOLD, 14));
		lbl2.setBounds(272, 204, 29, 14);
		assMarksFrame.getContentPane().add(lbl2);
		
		reMarksTf2 = new JTextField();
		reMarksTf2.setBounds(309, 201, 49, 20);
		assMarksFrame.getContentPane().add(reMarksTf2);
		reMarksTf2.setColumns(10);
		
		JLabel lbl3 = new JLabel("3.");
		lbl3.setFont(new Font("Arial", Font.BOLD, 14));
		lbl3.setBounds(411, 204, 29, 14);
		assMarksFrame.getContentPane().add(lbl3);
		
		reMarksTf3 = new JTextField();
		reMarksTf3.setBounds(450, 201, 49, 20);
		assMarksFrame.getContentPane().add(reMarksTf3);
		reMarksTf3.setColumns(10);
		
		JLabel lbl4 = new JLabel("4.");
		lbl4.setFont(new Font("Arial", Font.BOLD, 14));
		lbl4.setBounds(554, 204, 29, 14);
		assMarksFrame.getContentPane().add(lbl4);
		
		reMarksTf4 = new JTextField();
		reMarksTf4.setBounds(593, 201, 49, 20);
		assMarksFrame.getContentPane().add(reMarksTf4);
		reMarksTf4.setColumns(10);
		
		JLabel titleLbl_2 = new JLabel("Enter Marks for Presentation for all Group Members");
		titleLbl_2.setFont(new Font("Arial", Font.BOLD, 14));
		titleLbl_2.setBounds(133, 272, 385, 14);
		assMarksFrame.getContentPane().add(titleLbl_2);
		
		JLabel lbl5 = new JLabel("1.");
		lbl5.setFont(new Font("Arial", Font.BOLD, 14));
		lbl5.setBounds(133, 315, 29, 14);
		assMarksFrame.getContentPane().add(lbl5);
		
		preMarksTf1 = new JTextField();
		preMarksTf1.setBounds(169, 313, 49, 20);
		assMarksFrame.getContentPane().add(preMarksTf1);
		preMarksTf1.setColumns(10);
		
		JLabel lbl6 = new JLabel("2.");
		lbl6.setFont(new Font("Arial", Font.BOLD, 14));
		lbl6.setBounds(272, 316, 29, 14);
		assMarksFrame.getContentPane().add(lbl6);
		
		preMarksTf2 = new JTextField();
		preMarksTf2.setBounds(309, 313, 49, 20);
		assMarksFrame.getContentPane().add(preMarksTf2);
		preMarksTf2.setColumns(10);
		
		JLabel lbl7 = new JLabel("3.");
		lbl7.setFont(new Font("Arial", Font.BOLD, 14));
		lbl7.setBounds(411, 316, 29, 14);
		assMarksFrame.getContentPane().add(lbl7);
		
		preMarksTf3 = new JTextField();
		preMarksTf3.setBounds(450, 313, 49, 20);
		assMarksFrame.getContentPane().add(preMarksTf3);
		preMarksTf3.setColumns(10);
		
		JLabel lbl8 = new JLabel("4.");
		lbl8.setFont(new Font("Arial", Font.BOLD, 15));
		lbl8.setBounds(554, 316, 29, 14);
		assMarksFrame.getContentPane().add(lbl8);
		
		preMarksTf4 = new JTextField();
		preMarksTf4.setBounds(593, 313, 49, 20);
		assMarksFrame.getContentPane().add(preMarksTf4);
		preMarksTf4.setColumns(10);
		
		JButton assign = new JButton("Assign");
		assign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int grpNum = Integer.parseInt(grpNumTf.getText());
				
				JFrame f = new JFrame();
				
				try {
					
					if(grpNum > Group.grpCount) {
						throw new GroupNotAddedYetException("Group "+grpNum+" is not added yet");
					}
				
				marks[grpNum] = new Marks();
				
				marks[grpNum].reportMarks[0] = reMarksTf1.getText();
				marks[grpNum].reportMarks[1] = reMarksTf2.getText();
				marks[grpNum].reportMarks[2] = reMarksTf3.getText();
				marks[grpNum].reportMarks[3] = reMarksTf4.getText();
				
				marks[grpNum].presentMarks[0] = preMarksTf1.getText();
				marks[grpNum].presentMarks[1] = preMarksTf2.getText();
				marks[grpNum].presentMarks[2] = preMarksTf3.getText();
				marks[grpNum].presentMarks[3] = preMarksTf4.getText();
				
				for(int i = 0 ; i<4 ; i++) 
					marks[grpNum].totalMarks[i] = Integer.parseInt(marks[grpNum].reportMarks[i]) + Integer.parseInt(marks[grpNum].presentMarks[i]);
				
				
				JOptionPane.showMessageDialog(f, "Marks Assigned Successfully for Group "+grpNum);
				
				}catch(GroupNotAddedYetException e1) {
					JOptionPane.showMessageDialog(f, e1.getMessage());
				}
				
				assMarksFrame.setVisible(false);
				
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
		assign.setBackground(Color.BLACK);
		assign.setForeground(Color.WHITE);
		assign.setFont(new Font("Times New Roman", Font.BOLD, 14));
		assign.setBounds(252, 395, 89, 23);
		assMarksFrame.getContentPane().add(assign);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {		//Return to Home Page
			public void actionPerformed(ActionEvent e) {
				assMarksFrame.setVisible(false);
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
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.WHITE);
		cancel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		cancel.setBounds(537, 395, 89, 23);
		assMarksFrame.getContentPane().add(cancel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT_MANAGEMENT_SYSTEM_GUI\\src\\images\\pms1(1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 877, 456);
		assMarksFrame.getContentPane().add(lblNewLabel_1);
	}

}
