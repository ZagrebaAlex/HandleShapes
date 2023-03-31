public class Square extends Shape {

	public Square(String name) {
		this.name = name;
	}

	@Override
	void draw() {
		System.out.println("Drawing Square " + this.name);
	}
}
