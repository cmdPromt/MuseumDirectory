package model;

import java.math.BigDecimal;

public class ParthenonMuseum extends Group{

    public ParthenonMuseum(){
        super("Parthenon Museum", new BigDecimal("3.50"));

    }

    public void getSound(){
        System.out.println("Great choice back to the roots of civilization.");
    }

}
