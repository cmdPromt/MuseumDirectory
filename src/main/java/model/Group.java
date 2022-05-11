package model;

import java.math.BigDecimal;

public abstract class Group {

    private String name;
    private BigDecimal price;


    public Group(String name, BigDecimal price) {
        this.name = name;
        this.price = price;

    }

        public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }





    public abstract void getSound();


}


