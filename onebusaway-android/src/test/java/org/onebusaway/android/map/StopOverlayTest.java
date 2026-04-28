import org.junit.Test;
import static org.junit.Assert.*;

import org.onebusaway.android.map.StopOverlay;

public class StopOverlayTest {

    @Test
    public void testOverlayCreation() {
        StopOverlay overlay = new StopOverlay();
        assertNotNull(overlay);
    }

    @Test
    public void testOverlayInstance() {
        StopOverlay overlay = new StopOverlay();
        assertTrue(overlay instanceof StopOverlay);
    }
}
