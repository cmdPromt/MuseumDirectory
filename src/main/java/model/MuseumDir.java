package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class MuseumDir {

    private List<Group> group = new ArrayList<>();

    private BigDecimal totalPrice = new BigDecimal("0.0");


    public BigDecimal getTotalPrice() {
        return totalPrice;
    }


    public void addGroup(Group group) {
        this.group.add(group);
        this.totalPrice = this.totalPrice.add(group.getPrice());

    }

    @Override
    public String toString() {

        String str = "------------------------\n";
        str += "Thank you for ordering with us: \n";

        if (group.size() == 2) {

            str += "You got a 10% discount \n";
            this.totalPrice = this.totalPrice.multiply(new BigDecimal(0.90));
        }else if(group.size() == 3){
            str += "You got a 15% discount \n";
            this.totalPrice = this.totalPrice.multiply(new BigDecimal(0.85));
        }
        str += "Your order is: \n";

        for (Group group : group) {
            str += group.getName() + " $" + group.getPrice().setScale(2, RoundingMode.HALF_UP) + "\n";
        }

        str += "Total price $" + this.totalPrice.setScale(2, RoundingMode.HALF_UP);

        return str;
    }

}
