import java.util.Scanner;
public class bubbleSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=scan.next();
        }
        String z;
        
        for (int i = 0; i<n-1;i++) {
            for (int j= 0; j<n-i-1;j++) {
                if(arr[j+1].compareTo(arr[j])<0) {
                    z=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=z;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
        	System.out.println(arr[i]);
        }
        
	}
}
