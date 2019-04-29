package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.dev.MailService;

public class TestMailService {

	String toAddr, sub, text;

	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("before Class Test  onetimeBefore ");
	}

	@Before
	public void beforeTest() {
		toAddr = "rana888mca@gmail.com";
		sub = "TEST Rana ";
		text = "HEllo.. Ranaaa";
		System.out.println("before Test before.. preSetup ");
	}

	@Test(timeout = 5 * 1000)
	public void test() {
		boolean flag = MailService.sendEmail(toAddr, sub, text);
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
