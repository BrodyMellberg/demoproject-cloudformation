package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.junit.Assert.*;
//import static org.runners.JUnit4;

//import com.infy.agco.*; // import entire package

// Classes being tested are small, I will test everything in this one file

// @RunWith(JUnit4.class) do I need this
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

/*	@Before
	public void setup()
	{
	}
*/
	@Test
	public void contextLoads()
    {
	    System.out.println("working?");
    }

/*	@After
	public void teardown()
	{
	}
*/
}
