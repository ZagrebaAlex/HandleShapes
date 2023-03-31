
public class Circle extends Shape {
	
	public Circle(String name) {
		this.name = name;
	}

	@Override
	void draw() {
		System.out.println("Drawing Circle " + this.name);
	}
}