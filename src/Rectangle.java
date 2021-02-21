
public class Rectangle {
	int length;
	int breadth;
	public Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	public int Area() {
		return length * breadth;
	}
	public int Perimeter() {
		return 2*(length+breadth);
	}
}
class Square extends Rectangle{
	int side;
	Square(int s){
		super(s,s);
	}
	


	public static void main(String[] args) {
		Rectangle rect = new Rectangle(7,9);
		Square squ = new Square(5);
		
		rect.Area();
		rect.Perimeter();
		
		squ.Area();
		squ.Perimeter();
		
		Square[] set = new Square[10];
		int x = 5;
		for(int i=0; i<10; i++) {
			set[i] = new Square(x);
			x++;
		}
		for(int i=0; i<10; i++) {
			set[i].Area();
			set[i].Perimeter();
		}

	}

}
