package designpatterns.builder;

public class UserDemo {
	public static void main(String[] args) {
		User.UserBuilder userBuilder = new User.UserBuilder("John", 40);
		
		userBuilder.email("xyz@test.com");
		
		User user = userBuilder.build();
		System.out.println(user);
	}
}
