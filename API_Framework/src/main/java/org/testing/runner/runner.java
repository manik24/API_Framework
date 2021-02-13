package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1;
import org.testing.TestScripts.TC2;
import org.testing.TestScripts.TC3;
import org.testing.TestScripts.TC4;

public class runner {

	public static void main(String[] args) throws IOException {
		
		
		TC1 tc1= new TC1();
		TC2 tc2 = new TC2();
		TC3 tc3 = new TC3();
		TC4 tc4 = new TC4();
		
		System.out.println("************************ TEST CASE 1 STARTED ******************************");
		tc1.testcase1();
		System.out.println("************************  TEST CASE 1 ENDED    ******************************");
		System.out.println("===========================================================================");
		System.out.println("************************ TEST CASE 2 STARTED ******************************");
		tc2.testcase2();
		System.out.println("************************ TEST CASE 2 ENDED ******************************");
		System.out.println("************************ TEST CASE 3 STARTED ******************************");
		tc3.testcase3();
		System.out.println("************************ TEST CASE 3 ENDED ******************************");
		System.out.println("************************ TEST CASE 4 STARTED ******************************");
		tc4.testcase4();
		System.out.println("************************ TEST CASE 4 ENDED ******************************");
	}
}
