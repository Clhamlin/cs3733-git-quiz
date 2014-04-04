package io.brez.application;

public class Application {
	boolean DEMO = false;
	boolean BROKEN = false;

	public String name() {
		return "Application Demo";
	}

  public String owner() {
    return "Gonzo";
  }

	public boolean isWorking() {
		return isDemo() && isBroken() == false;
	}

	private boolean isBroken() {
		return BROKEN;
	}

	private boolean isDemo() {
		return name().matches("(.*) Demo") || DEMO;
	}

	public String text() {
		return isBroken() ? "Broken" : "Fine";
	}

	public static void main(String [] args) {
		Application app = new Application();

    System.out.println(app.owner() + "'s " + app.name());
		System.out.println(app.text() );
	}
}
