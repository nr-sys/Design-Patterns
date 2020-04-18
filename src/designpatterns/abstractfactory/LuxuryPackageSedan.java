package designpatterns.abstractfactory;

public class LuxuryPackageSedan implements FourWheeler {
	@Override
	public void getCarType() {
		System.out.println("Sedan with Luxury Package");
	}
}
