package com.app.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.dev.ConnectionUtil;

public class TestConnectionUtil {
	Connection con1, con2;

	@BeforeClass
	public static void beforeClassTest() {

		System.out.println("before Class Test  onetimeBefore ");
	}

	@Before
	public void beforeTest() {
		con1 = ConnectionUtil.getSingleTonConnection();
		con2 = ConnectionUtil.getSingleTonConnection();
		System.out.println("before Test before.. preSetup ");
	}

	@Test
	public void test() {
		assertNotNull(con1);
		assertNotNull(con2);
		System.out.println("------\ntest Not yet implemented Test-1 ");
	}

	@After
	public void afterTest() {
		con1 = con2 = null;
		System.out.println("after Test After.. postTest ");
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("after Class Test After All..");
	}
}
