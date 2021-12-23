package test_p44;

public class Sample5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("car no.1");
		car1.start();
		
		for(int i =0;i<5;i++)
		{
			System.out.println("正在進行main()的處理工作");
		}
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
	for(int i=0;i<5;i++)
	{
		System.out.println("正在進行" + name + "的處理工作");
	}
}
}
