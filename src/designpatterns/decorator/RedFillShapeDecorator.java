package designpatterns.decorator;

public class RedFillShapeDecorator extends ShapeDecorator {
	public RedFillShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Red Fill in circle");
	}
}
