public class SingletonThreaded {
	private SingletonThreaded() {};

	// Instance variable is marked volatile
	private static volatile SingletonThreaded myClass = null;

	public static SingletonThreaded getInstance() {
		// Double check locking
		if (myClass == null) {
			synchronized(SingletonThreaded.class) {
				if (myClass == null) {
					myClass = new SingletonThreaded();
				}
			}
		}

		return myClass;
	}

	public void showMessage() {
		System.out.println("I am a singleton!");
	}
}