package sort;

import java.util.Scanner;

public class Insertionsort {
	public Insertionsort() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++) arr[i]=sc.nextInt();
		sort(arr);
		for (int i:arr) System.out.print(i+" ");
		sc.close();
	}
	
	public void sort(int arr[]) {
		for (int i=1;i<arr.length;i++) {
			int key=arr[i];
			int k=i-1;
			while (k>=0 && arr[k]>key) {
				arr[k+1]=arr[k];
				k--;
			}
			arr[k+1]=key;
		}
	}
	public static void main(String[] args) {
		new Insertionsort();

	}

}
