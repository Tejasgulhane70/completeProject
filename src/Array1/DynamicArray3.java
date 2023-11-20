package Array1;

import java.util.Scanner;

public class DynamicArray3 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an element");
		int size = sc.nextInt();
		System.out.println("enter elemenet5");
		
		int[]a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("printed array element5");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
