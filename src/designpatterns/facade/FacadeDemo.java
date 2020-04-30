package designpatterns.facade;

public class FacadeDemo {
	public static void main(String[] args) {
		OrderFacade orderFacade = new OrderFacade();
		
		orderFacade.orderFood();
		orderFacade.orderTakeoutFood();
	}
}
