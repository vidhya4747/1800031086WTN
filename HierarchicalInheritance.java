package session5;
class Bank{
	int amount=10000;
	}
class  ICICI extends Bank{
	void roi()
	{
		System.out.println(amount*0.1);
	}
}

class  HDFC extends Bank{
	void roi()
	{
		System.out.println(amount*0.4);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HDFC h=new HDFC();
       h.roi();
       ICICI i=new ICICI();
	}

}
