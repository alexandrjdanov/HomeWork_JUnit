import homework.transport.OffRoad;
import homework.transport.Truck;
import homework.transport.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest {

    Vehicle v1 = new Vehicle(10, 30, 20);
    OffRoad of1 = new OffRoad(5,80, 30, 10);
    Truck tr1 = new Truck(15, 60, 15,12);

    @Test
    public void canCalculateRange() {
        int result = 30 * 20;
        assertEquals("Can we calculate range", result, v1.getFuelcap() * v1.getMpg());
    }

    @Test
    public void canReturnRangeInt() {
        int result = 30 * 20;
        assertEquals("Can we return rangeInt", result, v1.rangeInt());
    }

    @Test
    public void canCalculateFuelNeeded() {
        double distance = 100;
        double result = distance / 20;
        assertEquals("Can we calculate fuel needed", result, v1.fuelNeeded(100), 0.0);
    }

    @Test
    public void canGetPassengers() {
        assertEquals("Can we get number of passengers", 10, v1.getPassengers());
    }

    @Test
    public void canSetPassengers() {
        v1.setPassengers(25);
        assertEquals("Can we set number of passengers", 25, v1.getPassengers());
    }

    @Test
    public void canGetFuelCap() {
        assertEquals("Can we get fuel cap volume", 20, v1.getMpg());
    }

    @Test
    public void canSetFuelCap() {
        v1.setFuelcap(50);
        assertEquals("Can we set fuel cap volume", 50, v1.getFuelcap());
    }

    @Test
    public void canGetMpg() {
        assertEquals("Can we get number of miles per gallon", 30, v1.getFuelcap());
    }

    @Test
    public void canSetMpg() {
        v1.setMpg(10);
        assertEquals("Can we set number of miles per gallon", 10, v1.getMpg());
    }

    @Test
    public void canGetGroundClearance() {
        assertEquals("Can we get number of ground clearance", 10, of1.getGroundClearance());
    }

    @Test
    public void canSetGroundClearance() {
        of1.setGroundClearance(20);
        assertEquals("Can we set number of ground clearance", 20, of1.getGroundClearance());
    }

    @Test
    public void canGetCargocap() {
        assertEquals("Can we get number of cargocap", 12, tr1.getCargocap());
    }

    @Test
    public void canPutCargocap() {
        tr1.putCargo(20);
        assertEquals("Can we set number of cargocap", 20, tr1.getCargocap());
    }
}
