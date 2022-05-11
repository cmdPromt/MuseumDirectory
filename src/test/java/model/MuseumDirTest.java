package model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MuseumDirTest {
@Test
    public void can_add_group_test(){
    MuseumDir testgroup = new MuseumDir();
    Group Artmuseum = new ArtMuseum();
    Group LaneMotorMuseum = new LaneMotorMuseum();
    Group CountryMusicHall = new CountryMusicHall();
    Group ParhenonMuseum = new ParthenonMuseum();
    testgroup.addGroup(Artmuseum);
    testgroup.addGroup(LaneMotorMuseum);
    testgroup.addGroup(CountryMusicHall);
    testgroup.addGroup(ParhenonMuseum);

    BigDecimal expectedTotal = new BigDecimal("21.25");
    BigDecimal actualTotal = testgroup.getTotalPrice();
    assertEquals(expectedTotal,actualTotal);

}
}