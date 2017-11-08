package it.unical.test;

import it.unical.asde.AthleticGame;
import java.time.Instant;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author MikeUgo
 */
public class AthleticGameWinnersTest {
    
    private static AthleticGame athletic;
    @BeforeClass
    public static void init(){
    	System.out.println("Before class: inizializzazione");
        athletic = new AthleticGame("calcio");
    }
    
    @Before
    public void startTest(){
    	System.out.println("Before: richiama metodo start()");
        athletic.start();
    }
    
    @After
    public void resetTest(){
    	System.out.println("After: richiama metodo reset()");
        athletic.reset();
    }
    
    @Test
    public void getWinnerTest(){
    	System.out.println("Get Winner Test");
        athletic.addArrival("michele", Instant.now().minusMillis(1000));
        athletic.addArrival("simone", Instant.now().minusMillis(500));
        Assert.assertEquals("michele", athletic.getWinner());
    }
    
    @Test
    public void getWinnerTest2() {
    	System.out.println("Get Winner Test 2");
    	athletic.addArrival("michele", Instant.now());
    	athletic.addArrival("simone", Instant.now().plusMillis(10));
    	athletic.addArrival("carlo", Instant.now().plusMillis(15));
    	Assert.assertEquals("michele", athletic.getWinner());
    }
}
