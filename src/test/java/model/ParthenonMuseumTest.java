package model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ParthenonMuseumTest {
    @Test
    public void check_price_check_name_test(){
        Group check = new ParthenonMuseum();
        assertEquals("Parthenon Museum", check.getName());
        assertEquals(new BigDecimal("3.50"),check.getPrice());
    }

}