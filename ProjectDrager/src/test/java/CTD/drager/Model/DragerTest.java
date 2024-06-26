package CTD.drager.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DragerTest {

    @Test
    public void createDragerTest(){

        Drager drager = new Drager("Drager x-Am 1000", "ARXX-0001", "0123456", "Aleksandr Pushkin", "31.12.2054", "Calibration");
        assertNotNull(drager);
        assertEquals("Drager x-Am 1000", drager.getModel());
        assertEquals("ARXX-0001", drager.getSerial());
        assertEquals("0123456", drager.getInventoryNumber());
        assertEquals("Aleksandr Pushkin", drager.getOwner());
        assertEquals("31.12.2054", drager.getVerification());
        assertEquals("Calibration", drager.getStatus());
        assertEquals("white", drager.getFlag());
    }

    @Test
    public void dragerSettersTest() {

        Drager drager = new Drager();
        drager.setModel("Drager x-Am 1000");
        drager.setSerial("ARXX-0001");
        drager.setInventoryNumber("0123456");
        drager.setOwner("Aleksandr Pushkin");
        drager.setVerification("31.12.2054");
        drager.setStatus("Calibration");
        drager.setFlag("red");
        assertNotNull(drager);
        assertEquals("Drager x-Am 1000", drager.getModel());
        assertEquals("ARXX-0001", drager.getSerial());
        assertEquals("0123456", drager.getInventoryNumber());
        assertEquals("Aleksandr Pushkin", drager.getOwner());
        assertEquals("31.12.2054", drager.getVerification());
        assertEquals("Calibration", drager.getStatus());
        assertEquals("red", drager.getFlag());
    }
}
