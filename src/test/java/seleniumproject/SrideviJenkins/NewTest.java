package seleniumproject.SrideviJenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }
  @BeforeClass
  public void bb()
  {
	  System.out.println("before class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
