import java.util.*;
public class ArrayReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
        	arr[i]=scan.nextInt();
        }
        int temp=0;
        for(int i=0,k=size-1;i<=size/2 && k>=size/2;i++,k--)
        {
        	temp=arr[i];
        	arr[i]=arr[k];
        	arr[k]=temp;
        }
        for(int i=0;i<size;i++)
        	System.out.print(arr[i]+" ");
	}
}
