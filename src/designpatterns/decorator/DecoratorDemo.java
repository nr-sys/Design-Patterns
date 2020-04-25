package designpatterns.decorator;

public class DecoratorDemo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		
		Shape redFillShapeCircle = new RedFillShapeDecorator(new Circle());
		redFillShapeCircle.draw();
	}
}
