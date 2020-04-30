package designpatterns.facade;

public class Waiter{
	public void takeOrder() {
		System.out.println("Taking order..");
	}
	
	public void sendToKitchen() {
		System.out.println("Sending order to kitchen..");
	}
	
	public void serveCustomer() {
		System.out.println("Serving Customer..");
	}
	
	public void packOrder() {
		System.out.println("Packing order..");
	}
	
	public void billOrder() {
		System.out.println("Billing order..");
	}
}
