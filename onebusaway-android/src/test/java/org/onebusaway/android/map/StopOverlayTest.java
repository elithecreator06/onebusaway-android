import org.junit.Test;
import static org.junit.Assert.*;

import org.onebusaway.android.map.googlemapsv2.StopOverlay;

public class StopOverlayTest {

    @Test
    public void testClassExists() {
        assertNotNull(StopOverlay.class);
    }

    @Test
    public void testClassName() {
        assertEquals("StopOverlay", StopOverlay.class.getSimpleName());
    }
}
