//JAVA program to impliment binaryseach
import java.util.Scanner;
class binary{
		public int binSearch(int a[],int low,int high,int key){
			while(high>=low){
				int mid=(low+high)/2;
				if(a[mid]==key) return mid;
				else if(key>a[mid]) return binSearch(a,mid+1,high,key);
				else return binSearch(a,low,mid-1,key);
			}
			return -1;
		}
}
public class bsearch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] a=new int[30];
		int i,j,n;
		System.out.print("Enter the size of list: ");
		n=sc.nextInt(); 
		System.out.print("Enter the elements of list in increasing order only: ");
		for(i=0;i<n;i++) a[i]=sc.nextInt();
		System.out.print("List is: ");
		for(i=0;i<n;i++) System.out.print(a[i]+" ");
		System.out.println();
		System.out.print("Enter the element to be searched:");
		int key=sc.nextInt();
		binary bs;
		bs=new binary();
		int pos;
		pos=bs.binSearch(a,0,n-1,key);
		if(pos==-1)
			System.out.println("Search unsuccesful,Key not found");
		else
			System.out.println("Search is succesful,Key not found at index "+pos);
	}
}
