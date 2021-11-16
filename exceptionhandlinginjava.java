package saravanan;

public class exceptionhandlinginjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		     int[] a= {1,2,3,4};
		     System.out.println(a[5]);
		   }
		catch (Exception e) 
		
		{
			
		    System.out.println("print the catch the statments....");
		}
		finally 
		{
			System.out.println("Report the statments.....");
		}

	}

}
