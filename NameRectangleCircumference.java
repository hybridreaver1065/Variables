
public class NameRectangleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Name
		String personName = "Dr.Person";
		
		//Rectangle
		int recSideOne= 2;
		
		int recSideTwo = 4;
		
		int recArea = 0;
		
		//Circle
		int radius = 4;
		
		double pi = 3.14;
		
		double area = 0;
		
		
		
		
		System.out.print("His rectangle had an area of ");
		recArea = recSideTwo * recSideOne;
		System.out.println(recArea);
		
		System.out.print("but his circle had an area of ");
		area = pi*radius*radius;
		System.out.println(area);
		
		System.out.print("And his name was ");
		System.out.println(personName);
	}

}
