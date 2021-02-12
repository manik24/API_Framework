package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1;
import org.testing.TestScripts.TC2;

public class runner {

	public static void main(String[] args) throws IOException {
		
		
		TC1 tc1= new TC1();
		TC2 tc2 = new TC2();
		
		System.out.println("************************ TEST CASE 1 STARTED ******************************");
		tc1.testcase1();
		System.out.println("************************  TEST CASE 1 ENDED    ******************************");
		System.out.println("===========================================================================");
		System.out.println("************************ TEST CASE 2 STARTED ******************************");
		tc2.testcase2();
		System.out.println("************************ TEST CASE 2 ENDED ******************************");
	}
}
