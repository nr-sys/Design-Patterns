package designpatterns.abstractfactory;

public class LuxuryPackageFactory extends AbstractFactory {
	@Override
	public FourWheeler createCar(String carType) {
		if (carType.equals("Sedan")) {
			return new LuxuryPackageSedan();
		}
		if (carType.equals("SUV")) {
			return new LuxuryPackageSUV();
		}
		return null;
	}
}
