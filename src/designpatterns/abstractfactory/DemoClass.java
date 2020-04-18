package designpatterns.abstractfactory;

public class DemoClass {
	public static void main(String args[]) {
		AbstractFactory abs = FactoryProducer.getFactory("Basic");
		FourWheeler fw = abs.createCar("SUV");
		fw.getCarType();

		AbstractFactory abs2 = FactoryProducer.getFactory("LuxuryPackage");
		FourWheeler fw2 = abs2.createCar("Sedan");
		fw2.getCarType();
	}
}
