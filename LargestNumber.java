import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int arr[]=new int[n];
        int largest=0;
        for(int i=0;i<n;i++)
        {
        	arr[i]=scan.nextInt();
        	if(arr[i]>largest)
        		largest=arr[i];
        }
        System.out.println("the largest number is "+largest);
	}
}
