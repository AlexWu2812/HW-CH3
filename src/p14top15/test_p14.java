package p14top15;

public class test_p14
{
	public static void main(String[] args) 
	{
		Car car1;
		car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}	
}

class Car
{
	int num;
	double gas;

	void setNum(int n)
	{
		num = n;
		System.out.println("�N�����]��" +num);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("�N�T�o�q�]��" +gas);
	}
	void setNumGas(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��" +num+"�A�T�o�q�]��"+ gas);
	}
	void show()
	{
		System.out.println("�����O" +this.num);
		System.out.println("�T�o�q�O" +this.gas);
	}
}

