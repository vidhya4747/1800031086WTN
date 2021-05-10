package student;

public class Student {
int sid;
String sname;
int marks;
void SetAssign(int sid,String sname,int marks) {
	this.sid=sid;
	this.sname=sname;
	this.marks=marks;
}
public void display() {
	System.out.println("Student id "+sid);
	System.out.println("Student name "+sname);
	System.out.println("Student marks "+marks);
}

}
