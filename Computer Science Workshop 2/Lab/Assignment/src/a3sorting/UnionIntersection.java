package a3sorting;

public class UnionIntersection {
	public static void UniInter(int arr1[],int size1,int arr2[],int size2) {
		int first=0,second=0;
		int unionArr[]= new int[size1+size2];
		int interArr[]= new int[min(size1,size2)];
		int u=0,i=0;
		while(first<size1 && second<size2) {
			if (arr1[first]==arr2[second]) {
				unionArr[u]=arr1[first];
				interArr[i]=arr1[first];
				first++;
				second++;
				u++;i++;
			}
			else if(arr1[first]<arr2[second]) {
				unionArr[u] = arr1[first];
				first += 1;
				u++;
			}
			else {
				unionArr[u] = arr2[second];
				second += 1;
				u++;
			}
		}	
	}
	public static int min(int a,int b) {
		if(a>b) {
			return b;
		}
		else {
			return a;
		}
	}
}
