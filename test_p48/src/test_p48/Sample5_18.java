package test_p48;

public class Sample5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("car no.1");
		car1.start();
		try
		{
			car1.join();
		}
		
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println("����main()���B�z�u�@");
	}

}

class Car extends Thread
{
	private String name;
	
	public Car(String nm)
	{
		name = nm;
	}
	
	public void run()
	{
		for(int i =0; i<5;i++)
		{
			System.out.println("���b�i��" + name + "���B�z�u�@");
		}
	}
}