//package com.example.demo;
package com.infy.agco;


import com.infy.agco.util.*;

import jdk.internal.jline.internal.TestAccessible;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert.*;
//import static org.runners.JUnit4;

//import com.infy.agco.*; // import entire package

// Classes being tested are small, I will test everything in this one file

// @RunWith(JUnit4.class) do I need this
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

/*	Welcome welcome;

	@Before
	public void setup()
	{
		welcome = new Welcome("Test Welcome");
	}
*/
	@Test
	public void contextLoads()
    {
	    System.out.println("working?");
    }

    @Test
	public void testWelcome()
	{
		Welcome welcome = new Welcome("Test Message");
		Assert.assertEquals("Test Message", welcome.getMessage());
	}

	@Test
	public void testWelcomeEmpty()
	{
		Welcome welcome = new Welcome();
		Assert.assertEquals("", welcome.getMessage());
	}


/*	@After
	public void teardown()
	{
	}
*/
}
