package io.brez.application;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void testIsWorking() {
		Application app = new Application();
		
		assertTrue(app.isWorking());
	}
}
