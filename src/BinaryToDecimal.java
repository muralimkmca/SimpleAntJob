import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n,k,d,s=0,c=0;
	    System.out.print("Binary number: ");
	    n=sc.nextInt();
	    k=n;
	    while(k!=0)
	    {
	      d=k%10;
	      s+=d*(int)Math.pow(2,c++);
	      k/=10;
	    }
	    System.out.println("Decimal equivalent:"+s);
	    sc.close();

	}

}
