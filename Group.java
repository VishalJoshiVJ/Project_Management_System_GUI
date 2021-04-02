package pmsgui;

class GroupNotAddedYetException extends Exception {
	String msg = new String();
	
	public GroupNotAddedYetException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

public class Group {
	
	String groupLeaderName = new String();
	String groupLeaderUsn = new String();
	String[] grpMemberName = new String[3];
	String[] grpMemberUsn = new String[3];
	int grpNumber = 0;
	static int grpCount = 0;
	
	static Group[] group = new Group[20]; 

}
