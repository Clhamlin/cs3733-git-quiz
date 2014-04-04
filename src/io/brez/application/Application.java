package io.brez.application;

public class Application {
	boolean DEMO_MODE = false;
	boolean BROKEN = false;
	
	public String name() {
		return "My App";
	}
	
	public boolean isWorking() {
		return isDemoMode() || !isBroken();
	}
	
	private boolean isBroken() {
		return BROKEN;
	}
	
	private boolean isDemoMode() {
		return DEMO_MODE;
	}
	
	public String text() {
		return isBroken() ? "BROKEN" : "Totally Fine!";
	}
	
	public static void main(String [] args) {
		Application app = new Application();
		
		System.out.println("This application is " + app.text() );
	}
}
