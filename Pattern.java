import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int arr[][]=new int[size][size];
        for(int i=0;i<size;i++)
        {
        	for(int j=0;j<size;j++)
        	{
        		arr[i][j]=scan.nextInt();
        	}
        }
        for(int i=0;i<size;i++)
        {
        	if(i%2==0){
        	for(int j=0;j<size;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}}
        	else
        	for(int j=size-1;j>=0;j--)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        }
	}
}
