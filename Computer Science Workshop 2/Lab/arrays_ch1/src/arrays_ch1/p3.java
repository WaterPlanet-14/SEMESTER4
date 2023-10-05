package arrays_ch1;

import java.util.Scanner;

public class p3 {
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
		System.out.println("Element found at index "+binarysearch(arr,size,ele));
		sc.close();
	}
	public static int binarysearch(int arr[],int size,int ele){
		int mid;
		int low=0;
		int high=size-1;
		while (low<=high) {
			mid=(low+high)/2;
			if (arr[mid] == ele){
				return mid;
			} 
			else if(arr[mid] < ele) {
				low = mid + 1;
			} 
			else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
