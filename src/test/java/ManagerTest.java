import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Rodolf", 756899, 80000.00, "Squirrel");
    }

    @Test
    public void managerHasAName() {
        assertEquals("Rodolf", manager.getName());
    }

    @Test
    public void managerHasNiNumber() {
        assertEquals(756899, manager.getNiNumber());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(80000.00, manager.getSalary(),0.0);
    }

    @Test
    public void managerHasSalaryRaise () {
        manager.raiseSalary(100);
        assertEquals(80100.00, manager.getSalary(),0.0);
    }

    @Test
    public void managerGetsBonus() {
        assertEquals(800.0, manager.getBonus(1.0), 0.0);
    }

    @Test
    public void managerHasDeptName() {
        assertEquals("Squirrel", manager.getDeptName());
    }






}
