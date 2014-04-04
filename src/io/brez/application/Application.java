package io.brez.application;

public class Application {
	boolean DEMO = true;
	boolean BROKEN = false;

	public String name() {
		return "Basic Quiz";
	}

  public String owner() {
    return "Marty Weasel";
  }

	public boolean isWorking() {
		return isDemo() && isBroken() == false;
	}

	private boolean isBroken() {
		return BROKEN;
	}

	private boolean isDemo() {
		return name().matches("(.*) Demo") && DEMO;
	}

	public String text() {
		return isBroken() ? "Having issues" : "Is working";
	}

	public static void main(String [] args) {
		Application app = new Application();

    System.out.print(app.owner() + "'s ");
		System.out.println(app.text() );
	}
}
