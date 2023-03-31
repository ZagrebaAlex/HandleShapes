import java.util.ArrayList;


public class Application {

	private ArrayList<Window> windows;

	public Application() {
		this.windows = new ArrayList<Window>();
	}

	public void addWindow(Window window) {
		this.windows.add(window);
	}

	public void run() {
		System.out.println("Starting application...");
		System.out.println("Number of windows: " + this.windows.size());
	}
}




