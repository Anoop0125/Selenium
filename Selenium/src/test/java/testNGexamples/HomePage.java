package testNGexamples;

import org.testng.annotations.Test;

public class HomePage {
  @Test(groups= {"smoke"})
  public void search() {
	  System.out.println("Search");
  } 
  @Test(enabled=false)
  public void home() {
	  System.out.println("Home");
  }
}
