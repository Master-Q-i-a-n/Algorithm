package sort;

import java.util.Scanner;

public class Mergesort {
	int a[];
	public Mergesort() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n]; 
		for (int i=0;i<n;i++) a[i]=sc.nextInt();
		merge(a,0,n);
		for (int i=0;i<n;i++) System.out.print(a[i]+" ");
		sc.close();
	}
	public void merge(int a[],int l,int r) {		
		if (r-l<=1) return;
		int temp[]=new int[a.length];
		int mid=l+(r-l)/2;
		merge(a,l,mid); merge(a,mid,r);
		for (int i=l,j=mid,k=l;k<r;k++) 
			if (j==r||(i<mid&&a[i]<=a[j]))
				temp[k]=a[i++]; 
			else temp[k]=a[j++];
		for (int i=l;i<r;i++) a[i]=temp[i];
	}
	public static void main(String[] args) {
		new Mergesort();
//123
	}

}
