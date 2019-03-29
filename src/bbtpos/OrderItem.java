/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbtpos;

/**
 *
 * @author theri
 */
public class OrderItem {
    // Attributes
    private int pos;
    private final String drink;
    private final String toppings;
    private final double price;
    private final String dispDrink;
    private final String dispToppings;
    private final String dispPrice;
    
    // Constructor
    public OrderItem(int position, String newDrink, String newToppings, double newPrice) {
        pos = position;
        drink = newDrink;
        toppings = newToppings;
        price = newPrice;
        switch (newDrink) {
            case "O": dispDrink = "Orig";
            break;
            case "S": dispDrink = "Slush";
            break;
            case "P": dispDrink = "PF";
            break;
            default: dispDrink = "N/A";
            break;
        }
        switch (newToppings) {
            case "0": dispToppings = "None";
            break;
            default: dispToppings = newToppings;
            break;
        }
        dispPrice = "$" + String.format("%.2f", newPrice);
    }
    
    // Methods
    public int getPos() {return pos;}
    public String getDrink() {return drink;}
    public String getToppings() {return toppings;}
    public double getPrice() {return price;}
    public Object[] outputItem() {
        Object[] item = new Object[5];
        item[0] = pos;
        item[1] = dispDrink;
        item[2] = dispToppings;
        item[3] = dispPrice;
        return item;
    }
    
    public void decPos() {pos -= 1;}
}
