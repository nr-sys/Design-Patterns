
public class SingletonDemo {
	public static void main(String args[]) {
		SingletonThreaded myClass = SingletonThreaded.getInstance();

		myClass.showMessage();
	}
}