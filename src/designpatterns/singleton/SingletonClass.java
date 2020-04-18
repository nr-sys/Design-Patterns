package designpatterns.singleton;

public class SingletonClass {
	//static member containing only one instance of the class
	private static SingletonClass singletonInstance = null;

	// Make constructor private so other objects cannot access it
	private SingletonClass() {}

	public static SingletonClass getInstance() {
		if (singletonInstance==null) {
			singletonInstance = new SingletonClass();
		}
		return singletonInstance;
	}

	public void showMessage() {
		System.out.println("I am a singleton!");
	}
}
