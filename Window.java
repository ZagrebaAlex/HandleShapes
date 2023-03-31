import java.util.ArrayList;

public class Window {

	private String title;
	private ArrayList<Shape> shapes;
	private Runnable onClick;

	public Window(String title) {
		this.title = title;
		this.shapes = new ArrayList<Shape>();
	}

	public void addShapes(ArrayList<Shape> shapes) {
		this.shapes.addAll(shapes);
	}

	public void onClick(Runnable onClick) {
		this.onClick = onClick;
	}

	public void bringToFront() {
		System.out.println("Bringing window " + this.title + " to front");
	}

}