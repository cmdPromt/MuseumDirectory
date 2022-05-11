package model;

import model.Group;

import java.math.BigDecimal;

public class ArtMuseum extends Group {

    public ArtMuseum(){
        super("Art Museum", new BigDecimal("5.00"));
    }

    public void getSound(){
        System.out.println("Art is Fun!");
    }
}
