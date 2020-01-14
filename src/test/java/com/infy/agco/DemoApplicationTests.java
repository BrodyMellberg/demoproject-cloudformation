//package com.example.demo;
package com.infy.agco;

import com.infy.agco.util.*;
import com.infy.agco.controller.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
//import static org.runners.JUnit4;

//import com.infy.agco.*; // import entire package

// Classes being tested are small, I will test everything in this one file

//@RunWith(JUnit4.class) ??
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
	// @autowired?
	private HealthCheckController healthCheck;
	private InvokeStoredProcedureController invokeController;
	private VPCLinkTestController vpcController;

	@Test
	public void healthCheckTest()
    {
	    assertThat(healthCheck).isNotNull();
    }

    @Test
    public void invokeTest()
	{
		assertThat(invokeController).isNotNull();
	}

	@Test
	public void vpcLinkTest()
	{
		assertThat(vpcController).isNotNull();
	}


    @Test
	public void testWelcome()
	{
		Welcome welcome = new Welcome("Test Message");
		assertEquals("Test Message", welcome.getMessage());
	}

	@Test
	public void testWelcomeEmpty()
	{
		Welcome welcome = new Welcome();
		assertEquals("", welcome.getMessage());
	}




/*	@After
	public void teardown()
	{
	}
*/
}
