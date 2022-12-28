package sort;

import java.util.Scanner;

public class Shellsort {
	int arr[]; 
	final int t=3;
	public Shellsort() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arr=new int[n];
		for (int i=0;i<n;i++) arr[i]=sc.nextInt();
		shell(arr);
		for (int i:arr) System.out.print(i+" ");
		sc.close();
	}
	
	public int increvalue(int t,int k) {
		int power=t-k+1;
		return (int) (Math.pow(2, power)-1);
	}
	
	public void shell(int a[]) {
		for (int i=1;i<=t;i++) {
			int gap=increvalue(t,i);
			for (int st=0;st<gap;st++) {
				for (int cr=st+gap;cr<a.length;cr+=gap) {
					int key=a[cr];
					int k=cr-gap;
					while (k>=0 && a[k]>key) {
						a[k+gap]=a[k];
						k-=gap;
					}
					a[k+gap]=key;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Shellsort();

	}

}
