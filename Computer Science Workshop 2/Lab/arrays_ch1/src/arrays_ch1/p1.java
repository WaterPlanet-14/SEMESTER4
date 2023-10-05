package arrays_ch1;
import java.util.*;
public class p1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of all the elements of the given array is "+sumarray(arr));
		sc.close();
	}
	public static int sumarray(int[] arr){
		int sum=0;
		int size=arr.length;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	

}
