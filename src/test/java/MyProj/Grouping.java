package MyProj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Grouping {
  @Test(groups = { "group1", "my" })
  public void a_f() {
	  System.out.println("Test1");
  }
  @Test(groups = { "group1" })
  public void b_f() {
	  System.out.println("Test2");
  }
  @Test(groups = { "group1" })
  public void c_f() {
	  System.out.println("Test3");
  }
  @Test(groups = { "my" })
  public void d_f() {
	  System.out.println("Test4");
  }
  

}
