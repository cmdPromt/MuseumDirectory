package model;

import java.math.BigDecimal;

public class LaneMotorMuseum extends Group{

    public LaneMotorMuseum(){
        super("Lane Motor Museum",new BigDecimal("7.25"));
    }

    public void getSound(){
        System.out.println("Great choice vintage cars loved by millions.");
    }
}
