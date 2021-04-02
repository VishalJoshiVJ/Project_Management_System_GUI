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

public class DisplayMarks extends Marks {

	JFrame dispMarksFrame,f;
	private JTextField grpNumTf;

	
	/**
	 * Create the application.
	 */
	public DisplayMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		dispMarksFrame = new JFrame("Academic Project Management System");
		dispMarksFrame.setBounds(100, 100, 883, 498);
		dispMarksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dispMarksFrame.getContentPane().setLayout(null);
		
		f = new JFrame();
		
		JLabel lblNewLabel = new JLabel("Marks Details");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(316, 26, 279, 32);
		dispMarksFrame.getContentPane().add(lblNewLabel);
		
		JLabel grpNumLbl = new JLabel("Enter Group Number");
		grpNumLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		grpNumLbl.setBounds(92, 91, 160, 14);
		dispMarksFrame.getContentPane().add(grpNumLbl);
		
		grpNumTf = new JTextField();
		grpNumTf.setBounds(251, 89, 47, 20);
		dispMarksFrame.getContentPane().add(grpNumTf);
		grpNumTf.setColumns(10);
		
		JLabel usnLbl = new JLabel("");
		usnLbl.setFont(new Font("Arial", Font.BOLD, 14));
		usnLbl.setBounds(49, 189, 46, 14);
		dispMarksFrame.getContentPane().add(usnLbl);
		
		JLabel rmLbl = new JLabel("");
		rmLbl.setFont(new Font("Arial", Font.BOLD, 14));
		rmLbl.setBounds(178, 188, 119, 14);
		dispMarksFrame.getContentPane().add(rmLbl);
		
		JLabel rm1Lbl = new JLabel("");
		rm1Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm1Lbl.setBounds(49, 238, 112, 14);
		dispMarksFrame.getContentPane().add(rm1Lbl);
		
		JLabel rm2Lbl = new JLabel("");
		rm2Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm2Lbl.setBounds(49, 263, 112, 14);
		dispMarksFrame.getContentPane().add(rm2Lbl);
		
		JLabel rm3Lbl = new JLabel("");
		rm3Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm3Lbl.setBounds(49, 288, 112, 14);
		dispMarksFrame.getContentPane().add(rm3Lbl);
		
		JLabel rm4Lbl = new JLabel("");
		rm4Lbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm4Lbl.setBounds(49, 313, 112, 14);
		dispMarksFrame.getContentPane().add(rm4Lbl);
		
		JLabel rm1OpLbl = new JLabel("");
		rm1OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm1OpLbl.setBounds(206, 238, 46, 14);
		dispMarksFrame.getContentPane().add(rm1OpLbl);
		
		JLabel rm2OpLbl = new JLabel("");
		rm2OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm2OpLbl.setBounds(206, 263, 46, 14);
		dispMarksFrame.getContentPane().add(rm2OpLbl);
		
		JLabel rm3OpLbl = new JLabel("");
		rm3OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm3OpLbl.setBounds(206, 287, 46, 14);
		dispMarksFrame.getContentPane().add(rm3OpLbl);
		
		JLabel rm4OpLbl = new JLabel("");
		rm4OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		rm4OpLbl.setBounds(206, 313, 46, 14);
		dispMarksFrame.getContentPane().add(rm4OpLbl);
		
		JLabel pmLbl = new JLabel("");
		pmLbl.setFont(new Font("Arial", Font.BOLD, 14));
		pmLbl.setBounds(409, 188, 142, 14);
		dispMarksFrame.getContentPane().add(pmLbl);
		
		
		
		JLabel pm1OpLbl = new JLabel("");
		pm1OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		pm1OpLbl.setBounds(469, 238, 46, 14);
		dispMarksFrame.getContentPane().add(pm1OpLbl);
		
		JLabel pm2OpLbl = new JLabel("");
		pm2OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		pm2OpLbl.setBounds(469, 263, 46, 14);
		dispMarksFrame.getContentPane().add(pm2OpLbl);
		
		JLabel pm3OpLbl = new JLabel("");
		pm3OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		pm3OpLbl.setBounds(469, 287, 46, 14);
		dispMarksFrame.getContentPane().add(pm3OpLbl);
		
		JLabel pm4OpLbl = new JLabel("");
		pm4OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		pm4OpLbl.setBounds(469, 313, 46, 14);
		dispMarksFrame.getContentPane().add(pm4OpLbl);
		
		JLabel tmLbl = new JLabel("");
		tmLbl.setFont(new Font("Arial", Font.BOLD, 14));
		tmLbl.setBounds(679, 188, 125, 14);
		dispMarksFrame.getContentPane().add(tmLbl);
		
		
		JLabel tm1OpLbl = new JLabel("");
		tm1OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		tm1OpLbl.setBounds(720, 238, 46, 14);
		dispMarksFrame.getContentPane().add(tm1OpLbl);
		
		JLabel tm2OpLbl = new JLabel("");
		tm2OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		tm2OpLbl.setBounds(720, 263, 46, 14);
		dispMarksFrame.getContentPane().add(tm2OpLbl);
		
		JLabel tm3OpLbl = new JLabel("");
		tm3OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		tm3OpLbl.setBounds(720, 287, 46, 14);
		dispMarksFrame.getContentPane().add(tm3OpLbl);
		
		JLabel tm4OpLbl = new JLabel("");
		tm4OpLbl.setFont(new Font("Arial", Font.BOLD, 14));
		tm4OpLbl.setBounds(720, 313, 46, 14);
		dispMarksFrame.getContentPane().add(tm4OpLbl);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int grpNum = Integer.parseInt(grpNumTf.getText());
				
				try {
				
				rm1Lbl.setText(Group.group[grpNum].groupLeaderUsn);
				rm2Lbl.setText(Group.group[grpNum].grpMemberUsn[0]);
				rm3Lbl.setText(Group.group[grpNum].grpMemberUsn[1]);
				rm4Lbl.setText(Group.group[grpNum].grpMemberUsn[2]);
				
				
				
				rm1OpLbl.setText(marks[grpNum].reportMarks[0]);
				rm2OpLbl.setText(marks[grpNum].reportMarks[1]);
				rm3OpLbl.setText(marks[grpNum].reportMarks[2]);
				rm4OpLbl.setText(marks[grpNum].reportMarks[3]);
				
				pm1OpLbl.setText(marks[grpNum].presentMarks[0]);
				pm2OpLbl.setText(marks[grpNum].presentMarks[1]);
				pm3OpLbl.setText(marks[grpNum].presentMarks[2]);
				pm4OpLbl.setText(marks[grpNum].presentMarks[3]);
				
				tm1OpLbl.setText(Integer.toString(marks[grpNum].totalMarks[0]));
				tm2OpLbl.setText(Integer.toString(marks[grpNum].totalMarks[1]));
				tm3OpLbl.setText(Integer.toString(marks[grpNum].totalMarks[2]));
				tm4OpLbl.setText(Integer.toString(marks[grpNum].totalMarks[3]));
				
				usnLbl.setText("USN");
				rmLbl.setText("Report Marks");
				pmLbl.setText("Presentation Marks");
				tmLbl.setText("Total Marks");
				
				}catch(NullPointerException e) {
					JOptionPane.showMessageDialog(f, "Invalid Group Number!!");
				}catch(ArrayIndexOutOfBoundsException e) {
					JOptionPane.showMessageDialog(f, "Invalid Group Number!!");
				}
			}
		});
		display.setBackground(Color.BLACK);
		display.setForeground(Color.WHITE);
		display.setFont(new Font("Times New Roman", Font.BOLD, 14));
		display.setBounds(659, 87, 89, 23);
		dispMarksFrame.getContentPane().add(display);
		
		JButton home = new JButton("Home");
		home.addActionListener(new ActionListener() {			//Return to Home Page
			public void actionPerformed(ActionEvent e) {
				dispMarksFrame.setVisible(false);
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
		home.setForeground(Color.WHITE);
		home.setBackground(Color.BLACK);
		home.setFont(new Font("Times New Roman", Font.BOLD, 14));
		home.setBounds(659, 401, 89, 23);
		dispMarksFrame.getContentPane().add(home);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\PROJECT_MANAGEMENT_SYSTEM_GUI\\src\\images\\pms3.jpg"));
		lblNewLabel_1.setBounds(0, 0, 867, 459);
		dispMarksFrame.getContentPane().add(lblNewLabel_1);
		
		
	}
}
