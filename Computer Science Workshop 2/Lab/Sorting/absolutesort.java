//Example 4.14
import java.util.*;
public class absolutesort {
	public static void abssort(int arr[],int size,int ref){
		for (int i=0;i<size-1;i++) {
			for (int j=0;j<size -1-i;j++) {
				if(Math.abs(ref-arr[j]) >Math.abs(ref-arr[j+1])) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter reference value : ");
		int ref = sc.nextInt();
		int a[] = {4,10,3,30,40,5};
		int s = a.length;
		abssort(a,s,ref);
		for (int e : a ) {
			System.out.println(e);
		}
		sc.close();
	}
	
	//T(n) = O(n^2)
}
