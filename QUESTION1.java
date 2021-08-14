import java.util.*;
public class QUESTION1 {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int m,n=25;
	    int Array[] = new int[n];
	    System.out.println("Enter 25 elements of array : ");
		for(m=0;m<n;m++){
			Array[m]=sc.nextInt();	
		}
	    int max = Array[0];
	    for (m = 1; m < n; m++){
	        if (Array[m] > max)
	            max = Array[m];
	       }
	    System.out.println(max);
	}
}

