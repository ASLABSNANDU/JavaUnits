package com.junitest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestExample {

	@BeforeClass
	public void beforeClassTest() {
		fail("before Class Test  onetimeBefore ");
	}

	@Before
	public void beforeTest() {
		fail("before Test before..");
	}

	@Test
	public void test() {
		fail("test Not yet implemented Test-1 ");
	}

	@After
	public void afterTest() {
		fail("after Test After.. ");
	}

	@AfterClass
	public void afterClassTest() {
		fail("after Class Test After All..");
	}
}
