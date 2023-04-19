package practise;
import java.util.*;
public class Arms {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int pow=1;
		int len=0;
		while(temp>0) {
			//int rem=temp%10;
			len=len+1;
			temp/=10;
		}
		System.out.println("Len =" +len);
		temp=n;
		while(temp>0) {
			int rem;
			pow=1;
			rem=temp%10;
			for(int i=0;i<len;i++) {
				pow*=rem;
			    }
			sum+=pow;
			temp/=10;
		}
		System.out.println("Sum = "+sum);
		if(n==sum)
			System.out.println(n+" is armstrong num");
		else
			System.out.println(n+" is not armstrong num");
		
		sc.close();
	}

}
