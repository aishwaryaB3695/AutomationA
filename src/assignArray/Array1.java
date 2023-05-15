package assignArray;

public class Array1 {

	public static void main(String[] args)
	{
		  boolean b1[]  = new boolean[4];
			byte b[] = new byte[4];
			long a[]=new long[4];
		    short s[] = new short[4];
		
			
			b1[0] = true;
			b1[1] = false;
			b1[2] = false;
			b1[3] = false;
			for(int i=0; i< b1.length;i++)
			{
				System.out.println("boolean array Element at : "+ i + " " + b1[i]);
			}
			
			System.out.println("===========================================================================");		
			
			b[0] = 20;
			b[1] = 10;
			b[2] = 30;
			b[3] = 5;
			 for(int i=0;i<b.length;i++)
				{
				 System.out.println("for byte, Element at Index : "+ i + "---> " + b[i]);
				}
			 System.out.println("===========================================================================");
			 
				a[0] = 100000L;
				a[1] = 300000L;
				a[2] = 400000L;
				a[3] = 786777L;			
				for(int i=0;i<a.length;i++)
				{
					System.out.println("Element at Index : "+ i + "---> " + a[i]);
				}
				 System.out.println("===========================================================================");

				 
			s[0] = 10;
			s[1] = 30;
			s[2] = 40;
			s[3] = 7;
			for(int i=0;i<s.length;i++)
			{
				System.out.println(" for short,Element at Index : "+ i + "--> " + s[i]);
		   }
			
	}
}
			
