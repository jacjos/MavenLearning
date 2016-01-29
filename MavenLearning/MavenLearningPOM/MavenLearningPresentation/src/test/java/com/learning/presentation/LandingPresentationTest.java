/**
 * 
 */
package com.learning.presentation;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 372123
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class LandingPresentationTest{
	
	private static final Logger logger = LoggerFactory.getLogger(LandingPresentation.class);
	
	@Mock LandingPresentation mockLandingPresentation;
	
	@BeforeClass
	public static void setup(){
	}	

	/**
	 * Test method for {@link com.learning.presentation.LandingPresentation#doProcess()}.
	 */
	@Test
	public void testDoProcess() {
		
		mockLandingPresentation.doProcess();		
		verify(mockLandingPresentation, times(1)).doProcess();
	}

	/**
	 * Test method for {@link com.learning.presentation.LandingPresentation#returnString()}.
	 */
	@Test
	public void testReturnString() {
		
		//doReturn("Mock String").when(mockLandingPresentation.returnString());
		when(mockLandingPresentation.returnString()).thenReturn("Mock String");
		assertEquals("Mock String", mockLandingPresentation.returnString());
	}

}
