/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhana Anvic
 */
public class Candy extends DessertItem {
    
    //create an instance variable 
    private double weight;
    private int pricePerLbs;
    
    
    public Candy(String name, double weight, int pricePerLbs){
            super(name);
            this.weight = weight;
            this.pricePerLbs = pricePerLbs;
    }
    
    
    @Override
    public int getCost(){
        //Multiplying the cost of the candie by the weight and the price per lbs
        int cost = (int)(Math.round(this.weight) * (this.pricePerLbs));
        //return the price
        return cost;
        
    }

    @Override
    public String toString(){
        //create an empty String
        String output = "";
        //Converting the price into Dollars and cents
        String pricetoDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //Placement for the cost in the receipt
        int placement = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //the output for the price in the reciept
        output += this.weight + "lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + "/ lb. " + super.getName();
        //retutning the output
        return output;
        
       
    }
}
