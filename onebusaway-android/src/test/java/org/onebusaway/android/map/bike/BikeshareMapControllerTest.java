import org.junit.Test;
import static org.junit.Assert.*;

import org.onebusaway.android.map.bike.BikeshareMapController;

public class BikeshareMapControllerTest {

    @Test
    public void testClassExists() {
        assertNotNull(BikeshareMapController.class);
    }

    @Test
    public void testClassName() {
        assertEquals("BikeshareMapController", BikeshareMapController.class.getSimpleName());
    }
}
