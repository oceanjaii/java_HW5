package test_p35;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Sample5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello!");
			pw.println("Goodbye!");
			
			pw.close();
			
			System.out.println("info already writed in file");
		}
		
		catch(IOException e)
		{
			System.out.println("Input & Output error");
		}
	}

}
