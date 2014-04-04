package io.brez.application;

public class Application {
	boolean DEMO = true;
	boolean BROKEN = false;

	public String name() {
		return "My App";
	}

	public boolean isWorking() {
		return isDemoMode() && isBroken() == false;
	}

	private boolean isBroken() {
		return BROKEN;
	}

	private boolean isDemoMode() {
		return DEMO;
	}

	public String text() {
		return isBroken() ? "BROKEN" : "Fine";
	}

	public static void main(String [] args) {
		Application app = new Application();

		System.out.println("This application is " + app.text() );
	}
}
