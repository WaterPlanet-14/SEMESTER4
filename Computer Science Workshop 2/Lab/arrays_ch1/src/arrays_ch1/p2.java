package arrays_ch1;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int ele=sc.nextInt();
		int size=arr.length;
		System.out.println(linearsearch(arr,size,ele));
		sc.close();
	}
	public static int linearsearch(int arr[],int size,int ele){
		for(int i=0;i<size;i++) {
			if (arr[i]==ele) {
				System.out.println("Element found at index :");
				return i;
			}
			
		}
		return -1;
	}
}
