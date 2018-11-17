package Array;

public class minimun_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[2][3];
		 
		 a[0][0]=7;
		 a[0][1]=4;
		 a[0][2]=6;		
		 a[1][0]=2;
		 a[1][1]=10;
		 a[1][2]=1;
		 
		//int b[][]= {{1,2,3},{4,5,6}};
		 int min=a[0][0];
		 
		 
		
		 
		 for (int i=0;i<2;i++)//row
		 {
			 for (int j=0;j<3;j++)//column
			 {
				 System.out.println(a[i][j]);

				   if (a[i][j]<min)
				   {
					   min= a[i][j];
					   //System.out.println(a[i][j]);
				 }
			 
			 
				   
			   }
			 
			 
			 }
		 
		 
		 System.out.println("minimum value is " + min);
				 
		 }
		 
}








