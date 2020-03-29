package designpatterns.builder;

public class User {
	// All final attributes
	// the class is constructed always from builder, not by its own constructor
	private final String name;
	private final String phone;
	private final String email;
	private final int age;
	
	public static class UserBuilder {
		private final String name;
		private final String phone;
		private final String email;
		private final int age;
		
		public UserBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public UserBuilder age(int email) {
			this.email = email;
			return this;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone2;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
	
	// constructor is private
	private User(UserBuilder userBuilder) {
		this.name = userBuilder.name;
		this.phone = userBuilder.phone;
		this.email = userBuilder.email;
		this.age = userBuilder.age;
	}
	
	// Can specify getters but no setters to retain immutability
	
}