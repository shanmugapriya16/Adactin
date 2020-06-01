package org.stepdef;


import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {
	
	
@Before
private void beforeSceno() {
	System.out.println("Before hooks");
}

@After
private void aftersceno() {
	System.out.println("After hooks");

}


}
