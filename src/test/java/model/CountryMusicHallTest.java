package model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CountryMusicHallTest {
    @Test
    public void check_price_check_name_test(){
        Group check = new CountryMusicHall();
        assertEquals("Country Music Hall",check.getName());
        assertEquals(new BigDecimal("5.50"),check.getPrice());

    }
}