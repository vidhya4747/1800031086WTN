package session3;
class Student
{
	int sid;
	String name;
	int marks;
	static String college="KLU";
	Student(int id,String n,int m)
	{
		sid=id;
		name=n;
		marks=m;
	}
	void display()
	{
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+name);
		System.out.println("Student marks:"+marks);
		System.out.println("Student college:"+college);
	}
	static
	{
		college="KL University";
	}
}

public class StaticDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s=new Student(2928,"Tejaswini",95);
     s.display();
	}

}
