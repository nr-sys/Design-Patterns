package designpatterns.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType.equals("Basic")) {
			return new BasicFactory();
		}
		if (factoryType.equals("Package")) {
			return new LuxuryPackageFactory();
		}
		return null;
	}
}
