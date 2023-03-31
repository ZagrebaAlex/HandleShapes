

public class Triangle extends Shape {

	public Triangle(String name) {
		this.name = name;
	}

	@Override
	void draw() {
		System.out.println("Drawing Triangle " + this.name);
	}
}