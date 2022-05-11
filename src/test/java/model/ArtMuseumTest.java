package model;

import org.junit.Test;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ArtMuseumTest {
    @Test
    public void price_test(){
        Group testArt = new ArtMuseum();
        assertEquals("Art Museum",testArt.getName());
        assertEquals(new BigDecimal("5.00"),testArt.getPrice());

    }

}