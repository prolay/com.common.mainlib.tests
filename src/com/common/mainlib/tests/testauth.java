package com.common.mainlib.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.common.mainlib.auth;

public class testauth {

	auth obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new auth();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAuth() {
		boolean ret = obj.validate("Prolay1");
		assertTrue(ret);
	}
}
