package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.dev.Operations;

public class TestOperations {
	Operations opr = null;
	int val1, val2, exp;

	@BeforeClass
	public static void beforeClassTest() {

		System.out.println("before Class Test  onetimeBefore ");
	}

	@Before
	public void beforeTest() {

		opr = new Operations();
		val1 = val2 = 1;
		exp = 2;

		System.out.println("before Test before.. preSetup ");
	}

	@Test
	public void test() {
		int res = opr.doSum(val1, val2);
		assertEquals("Do sum is not working", exp, res);
		System.out.println("------\ntest Not yet implemented Test-1 ");
	}

	@After
	public void afterTest() {
		opr = null;
		val1 = val2 = exp = 0;
		System.out.println("after Test After.. postTest ");
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("after Class Test After All..");
	}
}
