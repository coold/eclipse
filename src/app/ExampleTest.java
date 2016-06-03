package app;

import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class ExampleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getIntShouldReturn22() {
		assertThat(Example.getInt(), anyOf(is(22), is(11)) );
	}
	
	@Test
	public void permutateWithNegative_should_substract777() {
		assertThat(Example.permutate(-1), is(-778));
	}
	

	
	@Test(expected = IllegalArgumentException.class)
	public void permutateWithOver9999_should_throwException() {
		Example.permutate(10000);
	}
	
	
	

}
