import java.util.ArrayList;

public class HandleShapes {

	public static void main(String[] args) {
		System.out.println("HandleShapes App");

		// Create two Window instances
		Window w1 = new Window("Window 1");
		Window w2 = new Window("Window 2");

		// Add shapes to window 1
		ArrayList<Shape> shapes1 = new ArrayList<Shape>();
		shapes1.add(new Square("r11"));
		shapes1.add(new Square("r12"));
		shapes1.add(new Triangle("tr11"));
		shapes1.add(new Circle("c11"));
		shapes1.add(new Circle("c12"));
		w1.addShapes(shapes1);

		// Add shapes to window 2
		ArrayList<Shape> shapes2 = new ArrayList<Shape>();
		shapes2.add(new Square("r21"));
		shapes2.add(new Square("r22"));
		shapes2.add(new Triangle("tr21"));
		shapes2.add(new Triangle("tr22"));
		shapes2.add(new Circle("c21"));
		shapes2.add(new Circle("c22"));
		w2.addShapes(shapes2);

		// Bring window 1 to front when clicked
		w1.onClick(() -> {
			w1.bringToFront();
		});

		// Start the application
		Application app = new Application();
		app.addWindow(w1);
		app.addWindow(w2);
		app.run();
	}

}