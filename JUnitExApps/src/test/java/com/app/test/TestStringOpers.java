package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStringOpers {
	String str;

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("before Class Test  onetimeBefore ");
	}

	@Before
	public void beforeTest() {
		str = "CABCA";
		System.out.println("before Test before.. preSetup ");
	}

	@Test
	public void test() {
		assertTrue(StringOpers.isFollwingABCCycle(str));
		System.out.println("------\ntest Not yet implemented Test-1 ");
	}

	@After
	public void afterTest() {
		str = null;
		System.out.println("after Test After.. postTest ");
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("after Class Test After All..");
	}
}