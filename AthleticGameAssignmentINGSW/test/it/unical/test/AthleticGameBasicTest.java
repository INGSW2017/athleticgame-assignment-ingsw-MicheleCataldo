package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;


public class AthleticGameBasicTest {
	
	AthleticGame athletic = new AthleticGame("calcio");
	
	@Test
	public void addArrivalBasicTest() {
		System.out.println("Add Arrival Test");
		athletic.addArrival("cataldo", Instant.MIN);
		//athletic.addArrival("michele", Instant.MIN);
		Assert.assertEquals(1, athletic.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void getPartecipantBasicTest() {
		System.out.println("Get Parecipiant Time Test");
        athletic.getParecipiantTime("michele");
    }
}
