package dsa;
import java.util.Iterator;
import java.util.Scanner;
public class denominations {		
	
	static void sort(int[] array) {
		for(int j=1;j<array.length;j++) {
			int key= array[j];
			int i=j-1;
			while(i>-1 && array[i]>key) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int SIZE= in.nextInt();
		
		int[] array=new int[SIZE];
		
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < SIZE; i++) {
			array[i]=in.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount= in.nextInt();
		
		sort(array);
		int i=0;
		for ( i = array.length-1; i >0; i--) {
			while(array[i]<=amount) {
				int b=amount/array[i];		
				int c=amount%array[i];
				System.out.println("Your payment approach in order to give min no of notes will be "+
					array[i]+":"+b);
				if(c==0) {
					return;
				}
				
				else if(c!=0) {		
					amount=c;
				}
			}
			
		}
	}
	}