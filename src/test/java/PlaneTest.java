import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane airCodeClan1;
    Plane airCodeClan2;
    ArrayList planes;

    @Before
    public void setUp() throws Exception {
        airCodeClan1 = new Plane(PlaneType.BOEING707);
        airCodeClan2 = new Plane(PlaneType.BOEING747);


    }

    @Test
    public void canInformOnPlanesCapacity() {
    assertEquals(200, airCodeClan2.getPlaneCapacity());
    }


    @Test
    public void canInformOnPlanesWeight(){
        assertEquals(100, airCodeClan1.getPlaneWeight());
    }
}
