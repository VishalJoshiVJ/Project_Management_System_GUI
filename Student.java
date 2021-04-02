package pmsgui;

class StudentNotAddedException extends Exception {
	String msg = new String();

	public StudentNotAddedException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

public class Student {
	
	String stdName = new String();
	String stdUsn = new String();
	String rollNo = new String();
	String stdEmail = new String();
	String address = new String();
	String phone = new String();
	static int stdCount = 0;
	
	static Student[] student = new Student[50];

}
