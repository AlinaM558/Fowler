import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {

    private String  compareString = "Rental Record for " + "joe" + "\n" + "\t" + 
    		"Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n" + "\t" + "movie1" + 
    		"\t" + "\t" + "10" + "\t" + "30.0" + "\n" + "\t" + "movie2" + "\t" + "\t" + 
    		"5" + "\t" + "4.5" + "\n" + "Amount owed is 34.5" + "\n" + 
    		"You earned 3 frequent renter points";
	
	 @Test
	  public void compareTest() {
	        Movie m1 = new Movie("movie1", 1);
	        Movie m2 = new Movie("movie2", 2);
	        Rental r1 = new Rental(m1, 10);
	        Rental r2 = new Rental(m2, 5);
	        Customer c1 = new Customer("joe");
	        c1.addRental(r1);
	        c1.addRental(r2);
	        String result = c1.statement();
	        assertEquals(compareString, result);
	        System.out.println(result);
	    }

}
