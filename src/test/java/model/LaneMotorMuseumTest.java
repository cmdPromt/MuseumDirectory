package model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class LaneMotorMuseumTest {
@Test
    public void check_name_check_price_test(){
    Group check = new LaneMotorMuseum();
    assertEquals("Lane Motor Museum", check.getName());
    assertEquals(new BigDecimal(7.25),check.getPrice());
}
}