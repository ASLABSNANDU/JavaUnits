package com.app.test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.dev.Mathematics;

public class TestMathematics {
	int num;

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("before Class Test  onetimeBefore ");
	}

	@Before
	public void beforeTest() {
		num = 1531;
		System.out.println("before Test before.. preSetup ");
	}

	@Test
	public void test() {
		boolean flag = Mathematics.isArmStrong(num);
		assertTrue(flag);
		System.out.println("------\ntest Not yet implemented Test-1 ");
	}

	@After
	public void afterTest() {
		System.out.println("after Test After.. postTest ");
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("after Class Test After All..");
	}
}
