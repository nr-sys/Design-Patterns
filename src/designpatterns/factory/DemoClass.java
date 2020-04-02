public class DemoClass {
	public static void main(String args[]) {
		CarFactory cfact = new CarFactory();

		FourWheeler fw = cfact.createCar("Sedan");
		fw.getCarType();

		FourWheeler fw2 = cfact.createCar("SUV");
		fw2.getCarType();
	}
}