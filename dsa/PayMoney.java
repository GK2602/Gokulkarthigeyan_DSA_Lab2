package dsa;

import java.util.Scanner;

public class PayMoney {
	
	static int sol(int[] arr,int target) {
		
		int c=0;int d=0;
		for (int i = 0; i <arr.length;i++) {
			int b1=arr[i];	
			d=c;
			c= b1+c;				
			while(c>target) {
				if(d<target) {
					return i+1;
				}
				return i;
			}	
		}
		return c;
		}

	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array ");
		int x=in.nextInt();
		
		int array[] = new int[x];
		System.out.println("Enter the values of array");
		for (int i = 0; i < x; i++) {
		array[i]=in.nextInt();
		}
		int b=0;
		for (int i = 0; i < array.length;i++) {
			int a= array[i];
			 b=b+a;	
		}	
		System.out.println(b);
		System.out.println("enter the total no of targets that needs to be achieved");
		int notarget=in.nextInt();
		
		for (int i = 0; i <notarget; i++) {
			System.out.println();
			System.out.println("Enter the value of targets");
			int target=in.nextInt();
			
			if(b>target) {
				int result=PayMoney.sol(array,target);
				System.out.println("Target achieved after "+result+" Transactions");	
				
			}
			else {
			System.out.println("Target cannot be acheived");}
			System.out.println();	
			
		}
		
		}
		}