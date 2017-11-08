package it.unical.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//prima Winners, poi Basic.
@RunWith(Suite.class)
@Suite.SuiteClasses({
	   AthleticGameWinnersTest.class,AthleticGameBasicTest.class
	})

//prima Basic, poi Winners.
/*@RunWith(Suite.class)
@Suite.SuiteClasses({
	   AthleticGameBasicTest.class,AthleticGameWinnersTest.class
	})*/

public class AthleticGameTestSuite {}
