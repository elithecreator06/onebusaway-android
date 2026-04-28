import org.junit.Test;
import static org.junit.Assert.*;

import org.onebusaway.android.map.bike.BikeshareMapController;

public class BikeshareMapControllerTest {

    @Test
    public void testControllerCreation() {
        BikeshareMapController controller = new BikeshareMapController();
        assertNotNull(controller);
    }

    @Test
    public void testControllerNotNullAfterInit() {
        BikeshareMapController controller = new BikeshareMapController();
        assertTrue(controller != null);
    }
}
