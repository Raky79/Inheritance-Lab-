import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;
import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Claire", 768932, 100000.00);
    }

    @Test
    public void developerHasAName() {
        assertEquals("Claire", developer.getName());
    }

    @Test
    public void developerHasNiNumber() {
        assertEquals(768932, developer.getNiNumber());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(100000, developer.getSalary(), 0.0);
    }

    @Test
    public void developerHasSalaryRaise() {
        developer.raiseSalary(200);
        assertEquals(100200, developer.getSalary(), 0.0);
    }

    @Test
    public void developerGetsBonus() {
        assertEquals(1000.00, developer.getBonus(1.0), 0.0);
    }

}
