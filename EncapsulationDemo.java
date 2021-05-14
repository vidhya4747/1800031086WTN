package session4;
class Employee
{
	private int eid;
	private String name;
	private int salary;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e=new Employee();
     e.setEid(2928);
     e.setName("Tejaswini");
     e.setSalary(100000);
     System.out.println("Employee id:"+e.getEid());
     System.out.println("Employee name:"+e.getName());
     System.out.println("Employee salary:"+e.getSalary());
	}

}
