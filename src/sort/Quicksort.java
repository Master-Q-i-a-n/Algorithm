package sort;

import java.util.Scanner;

public class Quicksort {
	private int a[];
	public Quicksort() {
		Scanner sc=new Scanner(System.in);
		String ss[]=sc.nextLine().split(" ");
		int n=ss.length;
		a=new int[n];
		for (int i=0;i<n;i++) a[i]=Integer.parseInt(ss[i]);	
		paixu(a,0,n-1);
		for (int i:a) System.out.print(i+" ");
		sc.close();
	}
	public void paixu(int a[],int start,int end) {
		if (start>=end || a==null || a.length<=1) return;
		int i=start,j=end; int pivot=a[start];
		while (i<=j) {
		while (a[i]<pivot) i++;
		while (a[j]>pivot) j--;
		if (i<j) {int t=a[i]; a[i]=a[j]; a[j]=t; 
		i++; j--;} else
			if (i==j) i++;
		}
		paixu(a,start,j);
		paixu(a,i,end);
		
	}
	public static void main(String[] args) {
		new Quicksort();

	}

}
