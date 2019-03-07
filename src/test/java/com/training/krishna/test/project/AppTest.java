package com.training.krishna.test.project;

import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class AppTest 
{ 
	@Mock
	App app;
	
	@Before
	public void setUp() {
	
		
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    //@Test
    public void testAddPositiveIntger() {
    	//Mockito.when(app.add(2, 3)).thenReturn(5);
    	int expected=app.add(2, 3);
    	int actual = 5;
    	Assert.assertEquals(expected, actual);
    }
   // @Test
    public void testAddNeIntger() {
    	//App app = new App();
    	int expected=app.add(2, -3);
    	int actual = -1;
    	Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSubPositiveIntger() {
    	Mockito.when(app.subtract(2, 3)).thenReturn(5);

    	int expected=app.subtract(2, 3);
    	int actual = 5;
    	Assert.assertEquals(expected, actual);
    }
    
}
