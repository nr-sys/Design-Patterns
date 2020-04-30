package designpatterns.facade;

public class OrderFacade {
	private Waiter waiter = new Waiter();
	private KitchenSystem kitchen = new KitchenSystem();
	
	public void orderFood() {
		System.out.println("orderFood::Facade is placing a series of independent calls on different systems");
		waiter.takeOrder();
		waiter.sendToKitchen();
		
		kitchen.prepareFood();
		kitchen.callWaiter();
		
		waiter.serveCustomer();
		waiter.billOrder();
		
		kitchen.cleanDishes();
	}
	
	public void orderTakeoutFood() {
		System.out.println("orderTakeoutFood::Facade is placing a series of independent calls on different systems");
		waiter.takeOrder();
		waiter.sendToKitchen();
		
		kitchen.prepareFood();
		kitchen.callWaiter();
		
		waiter.packOrder();
		waiter.billOrder();
		waiter.serveCustomer();
	}
}
