package session4;
//SINGLE INHERITANCE
class Person
{
	int pid;
	String name;
	Person(int pid,String name)
	{
		this.pid=pid;
		this.name=name;
	}
	void display()
	{
		System.out.println("pid:"+pid);
		System.out.println("Person name:"+name);
	}
}
class Student extends Person
{
	String address;
	Student(int pid,String name,String address)
	{
		super(pid, name);
		this.address=address;
	}
	void show()
	{
		System.out.println("pid:"+pid);
		System.out.println("Person name:"+name);
		System.out.println("address:"+address);
	}
}

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s=new Student(2928,"Tejaswini","Bejathpuram");
	 s.show();
	}
}
