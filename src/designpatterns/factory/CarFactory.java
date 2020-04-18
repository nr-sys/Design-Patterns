package designpatterns.factory;

public class CarFactory {
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