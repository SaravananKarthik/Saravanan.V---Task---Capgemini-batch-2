package saravanan;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("......Fibonacci Series.........");
		int f1=0,f2=1,f3;
		System.out.println(f1);
		System.out.println(f2);
		for(int j=1;j<=5;j++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}

}
