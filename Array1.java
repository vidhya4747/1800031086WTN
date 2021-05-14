package wtn_arrays;
import java.util.*;
	public class Array1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int sum=0,avg=0;
			Scanner sc=new Scanner(System.in);
			int arr[]= {10,20,30,40,50};
			for(int i=0;i<arr.length;i++) 
			{
				sum+=arr[i];
				avg=sum/(arr.length);
			}
			 System.out.println("SUM OF ELEMENTS:"+sum);
		     System.out.println("AVERAGE OF ELEMENTS:"+avg);
		}	
	}


