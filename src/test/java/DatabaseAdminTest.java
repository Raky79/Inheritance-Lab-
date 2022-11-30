import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;
import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Priscilla", 760943, 120000.00 );
    }

    @Test
    public void dataBaseAdminHasAName() {
        assertEquals("Priscilla", databaseAdmin.getName());
    }

    @Test
    public void dataBaseAdminHasNiNumber() {
        assertEquals(760943, databaseAdmin.getNiNumber());
    }

    @Test
    public void dataBaseAdminhasASalary() {
        assertEquals(120000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void dataBaseAdminHasSalaryRaise() {
        databaseAdmin.raiseSalary(100);
        assertEquals(120100, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void dataBaseAdminGetsBonus() {
        assertEquals(1200.00, databaseAdmin.getBonus(1.0), 0.0);
    }
}
