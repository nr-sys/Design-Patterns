package designpatterns.facade;

public class KitchenSystem {
	public void prepareFood() {
		System.out.println("Preparing food..");
	}
	
	public void callWaiter() {
		System.out.println("Calling waiter to take food..");
	}
	
	public void cleanDishes() {
		System.out.println("Cleaning Dishes..");
	}
}
