package Epam.TDDJUNIT_TASK;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TDDJunitTest {
	
	/* Basic Functionality Of the Code
	 * 1.  Input length is = 0 i.e input="" ---> output =""
	 * 2.  Input length is  = 1 i.e input = "A" ----> Output  =""
	 * 3.  Input length is  = 2 i.e input ="AA" ---> Output =""
	 * 4. Input length is = 3 i.e input ="BAB"   -----> Output ="BB"
	 * 5. Input Length is n i.e Input ="ABADAAKFNFK..." ----> Output ="BDAAKFNFK"
	 */
	DeleteInitialAs ds;
	@Before
	public void setUp() throws Exception{
		 ds= new DeleteInitialAs();
	}
	@Test
	public void test() {
		assertEquals("",ds.removingAifPresentInFirstTwoCharacters("AA"));
	}
	@Test
	public void test1() {
		assertEquals("KIT",ds.removingAifPresentInFirstTwoCharacters("AKIT"));
	}
	@Test
	public void test2() {
		assertEquals("",ds.removingAifPresentInFirstTwoCharacters("A"));
	}
	@Test
	public void test3() {
		assertEquals("KITE",ds.removingAifPresentInFirstTwoCharacters("KAITE"));
	}
	@Test
	public void test4() {
		assertEquals("VIKAAM",ds.removingAifPresentInFirstTwoCharacters("VIKAAM"));
	} 
	@Test
	public void test5() {
		assertEquals("",ds.removingAifPresentInFirstTwoCharacters(""));
	}
	@Test
	public void test6() {
		assertEquals("M",ds.removingAifPresentInFirstTwoCharacters("M"));
	}
}
