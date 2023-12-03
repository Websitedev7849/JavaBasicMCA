package RectanglePackage;

public class ObjectCreationDemo {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		
//			System.out.println("r1.height : " + r1.height + " r1.width : " + r1.width);

//			System.out.println("r1.getArea : " + r1.getArea() + " r1.width : " + r1.getWidth());

//		r1.setHeight(10);
//		r1.setWidth(20);
		
//		System.out.println("r1.getArea : " + r1.getArea() + " r1.width : " + r1.getPerimeter());
//
		Rectangle r2 = r1;

		r2.setHeight(15);
		r2.setWidth(25);

		System.out.println("r1.getArea : " + r1.getArea() + " r1.width : " + r1.getPerimeter());
		System.out.println("r2.getArea : " + r2.getArea() + " r2.width : " + r2.getPerimeter());

	}

}
