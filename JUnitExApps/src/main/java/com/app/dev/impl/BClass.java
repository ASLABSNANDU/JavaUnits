package com.app.dev.impl;

import static com.app.test.AClass.*;

public class BClass {
	void show() {
		System.out.println(pid);
		m2(); // method call
	}

	public static void main(String[] args) {
		new BClass().show();
	}
}
