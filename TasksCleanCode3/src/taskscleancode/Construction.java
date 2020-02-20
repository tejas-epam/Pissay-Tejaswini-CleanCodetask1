package taskscleancode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Construction {
	public static void main(String args[])
	{
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		System.out.println("enter area");
		String n=sc.next();
		int area=sc.nextInt();
		if(n.equals("standardmaterial"))
		{
			myOutput.print("constructioncost:"+(area*1200));
		}
		else if(n.equals("abovestandardmaterial"))
		{
			myOutput.print("constructioncost:"+(area*1500));
			
		}
		else if(n.equals("highstandardmaterial"))
		{
			myOutput.print("constructioncost:"+area*1800);
		}
		else if(n.equals("highandfullyautomated"))
		{
			myOutput.print("constructioncost:"+area*2500);
		}
		
		
	}

}
