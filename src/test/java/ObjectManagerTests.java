import org.example.ObjectManager;
import org.example.Warehouse;
import org.junit.Test;
import org.junit.Assert;

public class ObjectManagerTests {
    @Test
    public void testAddNewObject() {
        Warehouse warehouse = new Warehouse("Kista");
        ObjectManager<Warehouse> warehouseObjectManager = new ObjectManager<>();

        warehouseObjectManager.addNewObject(warehouse);

        Assert.assertEquals(1, warehouseObjectManager.getAllObjects().size());
    }
}
