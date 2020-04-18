package designpatterns.abstractfactory;

public class BasicFactory extends AbstractFactory {
	@Override
	public FourWheeler createCar(String carType) {
		if (carType.equals("SUV")) {
			return new SUV();
		} 
		else if (carType.equals("Sedan")) {
			return new Sedan();
		}
		return null;
	}
}
