import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Susan", 321456, 150000.00, "Gremlins", 200000);
    }

    @Test
    public void directorHasName() {
        assertEquals("Susan", director.getName());
    }

    @Test
    public void directorHasNiNumber() {
        assertEquals(321456, director.getNiNumber());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(150000.00, director.getSalary(), 0.0);
    }

    @Test
    public void directorHasSalaryRise() {
        director.raiseSalary(50);
        assertEquals(150050, director.getSalary(), 0.0);
    }

    @Test
    public void directorGetsBonus() {
        assertEquals(1500.00, director.getBonus(1.0), 0.0);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(200000, director.getBudget());
    }
    
}
