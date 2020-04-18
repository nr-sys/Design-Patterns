package designpatterns.abstractfactory;

public class LuxuryPackageSUV implements FourWheeler {
	@Override
	public void getCarType() {
		System.out.println("SUV With Luxury Package");
	}
}
