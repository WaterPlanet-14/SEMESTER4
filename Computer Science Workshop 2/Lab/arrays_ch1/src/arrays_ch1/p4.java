package arrays_ch1;
import java.util.*;
public class p4 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int size=arr.length;
		System.out.println("Enter by how many times you want to rotate its  elements");
		int k=sc.nextInt();
		rotateArray(arr,size,k);
		System.out.print("{");
		for(int e:arr) {
			
			System.out.print(e + ",");
		}
		System.out.print("}");
		sc.close();
	}	
	public static void rotateArray(int[] a,int n,int k){
		reverseArray(a,0,k-1);
		reverseArray(a,k,n-1);
		reverseArray(a,0,n-1);
	}
	public static void reverseArray(int[] a,int start,int end) {
			for (int i = start, j = end; i < j; i++, j--) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		}
	}
}
