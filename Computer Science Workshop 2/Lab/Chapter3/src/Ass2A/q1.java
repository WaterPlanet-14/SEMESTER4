package Ass2A;

import java.util.Scanner;
import java.util.TreeSet;
public class q1 {
	public static void main(String []args) {
		
		//implement
		TreeSet<Integer> ts=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements : ");
		for(int i=1;i<=6;i++) {
			ts.add(sc.nextInt());
		}
		//display
		for (int i:ts) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//search
		int value=10;
		int c=0;
		for(int i=0;i<5;i++) {
			if(ts.contains(value)) {
				c=1;
				break;
			}
		}
		if (c==1) {
			System.out.println("Present");
		}
		sc.close();
		
	}
}
