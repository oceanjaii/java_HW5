package test_p36;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample5_13 {

	public static void main(String[] args) {
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println("Two letters writed into file is ");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
		}
		
		catch(IOException e)
		{
			System.out.println("Input & Output error");
		}

	}

}
