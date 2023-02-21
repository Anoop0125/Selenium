package testNGexamples;

import org.testng.annotations.Test;

public class LoginPage {
  @Test(groups= {"smoke"})
  public void email() {
	  System.out.println("Email");
  }
@Test(priority=1)
  public void phoneNumber() {
	System.out.println("Phonenumber");
}
}
