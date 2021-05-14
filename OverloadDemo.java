package session3;
class Overload
{
	void add()
	{
		System.out.println("no parameters");
	}
	void add(int a)
	{
		System.out.println("a="+a);
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	float add(float a,float b)
	{
		float d=a+b;
		return d;
	}
	double add(double a,double b)
	{
		double e=a+b;
		return e;
	}
}

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Overload o=new Overload();
       o.add();
       o.add(10);
       int x=o.add(20, 30);
       System.out.println("Sum="+x);
       float y=o.add(10.0f,20.0f);
       System.out.println("Sum="+y);
       double z=o.add(20.0,30.0);
       System.out.println("Sum="+z);
       
	}

}
