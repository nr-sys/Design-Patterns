package designpatterns.abstractfactory;

public class SUV implements FourWheeler {
	@Override
	public void getCarType() {
		System.out.println("I am a SUV");
	}
}
