package model;

import java.math.BigDecimal;

public class CountryMusicHall extends Group{

    public CountryMusicHall(){
        super("Country Music Hall",new BigDecimal("5.50"));
    }

    public void getSound(){
        System.out.println("Music energizes you");
    }
}
