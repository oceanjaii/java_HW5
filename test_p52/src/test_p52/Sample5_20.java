package test_p52;

public class Sample5_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company cmp = new Company();
		
		Driver drv1 = new Driver(cmp);
		drv1.start();
		
		Driver drv2 = new Driver(cmp);
		drv2.start();
	}

}

class Company
{
	private int sum = 0;
	public void add(int a)
	{
		int tmp = sum;
		System.out.println("�ثe���X�p���B�O" + tmp +"��");
		System.out.println("�Ȩ�" + a + "���F");
		
		tmp = tmp + a;
		System.out.println("�X�p���B�O" + tmp + "��");
		sum = tmp;
	}
}

class Driver extends Thread
{
	private Company comp;
	public Driver(Company c)
	{
		comp =c;
	}
	
	public void run()
	{
		for(int i=0;i<3;i++) {
			comp.add(50);
		}
	}
}