package com.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataTest {

	@Test
	public void testData() {
		Data obj1 = null;
		assertNull(obj1); 
		Data obj2 = new Data();
		assertNotNull(obj2);
	}
	
	@Test
	public void testPosNeg() {
		Data obj = new Data();
		assertTrue(obj.posNeg(5));
		assertFalse(obj.posNeg(-5));
	}
	
	@Test
	public void testMinArray() {
		int[] a = {5,23,8,24,-3,22,84};
		Data obj = new Data();
		assertEquals(-3, obj.minArray(a));
	}
	@Test 
	public void testFact() {
		Data obj = new Data();
		assertEquals(120, obj.fact(5));
	}
	
	@Test
	public void testMax3() {
		Data obj = new Data();
		assertEquals(5, obj.max3(5, 2, 3));
		assertEquals(5, obj.max3(2, 5, 3));
		assertEquals(5, obj.max3(2, 3, 5));
	}
	@Test 
	public void testSum() {
		Data obj = new Data();
		assertEquals(5, obj.sum(2, 3));
	}
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to JUnit Programming...", obj.sayHello());
	}

}
