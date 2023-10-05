public class improvedbubblesort {
	public static void sort2(int []arr) {
		int size=arr.length;
		int i,j,temp,swapped=1;
		for(i=1;i<(size)&&swapped==1;i++) {  //(i=0;i<(size-1)&&swapped==1;i++)
			swapped=0;
			for(j=0;j<size-i;j++) { //(j=0;j<size-i-1;j++)
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=1;
				}
			}
		}
	}
	public static void main(String args[]) {
		int[] array= {9,1,8,2,7,3,6,4,5};
		sort2(array);
		for(int i=0;i<array.length;i++) {//array index starts from 1
			System.out.print(array[i]+ " ");
		}
	}
	
}