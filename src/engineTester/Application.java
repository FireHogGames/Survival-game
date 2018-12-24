package engineTester;

import org.lwjgl.opengl.Display;

import renderEngine.DisplayManager;

public class Application {

	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()) {
			//game logic
			
			//render
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.closeDisplay();
	}
}
