package wtn_arrays;
import java.util.Scanner;
public class  Array2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int max=0,min=0;
      Scanner sc=new Scanner(System.in);
      int arr[]= {10,20,30,40,50};
      for(int i=0;i<arr.length;i++)
      {
    	  max=arr[0];
    	  if(arr[i]>max)
    	  {
    		  max=arr[i];
    	  }
    	  min=arr[0];
    	  if(arr[i]<min)
    	  {
    		  min=arr[i];
    	  }
      }
      System.out.println("Maximum:"+max);
      System.out.println("Minimum:"+min);  
	}
}
