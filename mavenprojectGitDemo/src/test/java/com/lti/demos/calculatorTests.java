package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class calculatorTest {
	
	Calculator c = new Calculator();

	@Disabled
	@Test //ye important hai for jUnit to show
	public void testSayHello() {
		String actualMsg = c.sayHello();
		Assertions.assertEquals("Hello World",actualMsg, "Error, check code");
	}
	
	@Disabled //ek baar test ho gaya, toh use this, baar baar isko test nahi karna hai
	@Test
	public void testAddNo() {
		int result = c.addNum(100, 200);
		Assertions.assertEquals(300, result, "Error in 'Add' code");
	}
	
	@Disabled
	@Test
	public void testSubNo() {
		int result = c.subNum(500, 500);
		Assertions.assertEquals(0, result, "Error in 'Subtract' code"); //" " is optional, man marzi
	}
	
	@Test
	@Disabled
	public void testAssertNulls() {
		String s1 = null;
		String s2 = "Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	@Disabled
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10); //condition is false, so testAssertFalse is true
		Assertions.assertFalse(10>20, "10 is smaller");
		Assertions.assertNotEquals("Hello", "hello");
	}
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Assertions.assertTrue(myList.isEmpty());
		myList.add(56);
		Assertions.assertEquals(1,myList.size());
	}

}
