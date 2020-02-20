package taskscleancode;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleCompoundInterests {
public static void main(String args[])
	{
	    double si,ci;
	    PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc=new Scanner(System.in);
		System.err.println("enter sp sr st");
		System.err.println("enter cp cr ct");
		double sp=sc.nextDouble();
		double sr=sc.nextDouble();
		double st =sc.nextDouble();
		double cp=sc.nextDouble();
		double cr=sc.nextDouble();
		double ct=sc.nextDouble();
		si=(sp*sr*st)/100;
		ci=cp*Math.pow((1+cr/100),ct);
		myOutput.print("The simple interest is:"+si);
		myOutput.print("\n");
		myOutput.print("The compound interest is:"+ci);
		
	}

}
