package designpatterns.abstractfactory;

public class Sedan implements FourWheeler {
	@Override
	public void getCarType() {
		System.out.println("I am a Sedan");
	}
}