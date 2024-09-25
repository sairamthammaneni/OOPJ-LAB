//Java program to impliment bubble sort
import java.util.Scanner;
public class bsort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[30];
		int i,j,temp,n;
		System.out.print("Enter the size of list: ");
		n=sc.nextInt(); 
		System.out.print("Enter the elements of list: ");
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		System.out.print("List before sorting: ");
		for(i=0;i<n;i++) System.out.print(a[i]+" ");
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				if(a[j]<a[i]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("List after sorting: ");
		for(i=0;i<n;i++) System.out.print(a[i]+" ");
		System.out.println();
	}
}
