package com.service.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.service.Addition;

public class TestAddition {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Addition addition = new Addition();
		int x = 10;
		int y = 20;
		int actual = addition.add(x, y);
		
		assertEquals(30, actual);
		
	}
	
	@Test
	public void tesAdd_negative()
	{
		Addition addition = new Addition();
		int x = 10;
		int y = 20;
		int actual = addition.add(x, y);
		assertTrue(10!=actual);
	}

}
