package methodsteps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {
@Before
public void beforeScenario(Scenario sc) {
	System.out.println(sc.getName());
	System.out.println(sc.getId());
}
public void afterScenario(Scenario sc) {
	System.out.println(sc.getUri());
	System.out.println(sc.getStatus());
	
}
}
