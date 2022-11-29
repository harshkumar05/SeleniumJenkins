package userName;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NameDemo {
	
	@Test
	public void test (){
		String firstName="Harsh";
		String lastName="Kumar";
		System.out.println("Hello "+firstName+" "+lastName);
		Assert.assertTrue(true);
	}

}
