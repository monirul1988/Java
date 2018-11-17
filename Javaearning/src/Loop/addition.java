package Loop;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int c[]= {1,3,5,7,9};
		System.out.println("array length is " + c.length);
		
		
		for (int i=0;i<c.length;i++)
			{
			sum=sum+c[i];
			
			
		}
		System.out.println("Total Sum is =" + sum);
		
		for (int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);	
		if(c[i]==7)
		{
			
			System.out.println("position in array is " + i);	
			break;
			
		}
		
		
	}
		
		
		
	}

}
