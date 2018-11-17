package Stringclass;


public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Type1
		String st="payment $100 done";
		
		System.out.println(st.length());
		
		System.out.println(st.charAt(8));
		
		//type2
		String st1=new String("payments $100 done");
		System.out.println(st1.length());
		
		System.out.println(st1.indexOf("$"));
		System.out.println(st1.substring(8));
		
		
	}

}
