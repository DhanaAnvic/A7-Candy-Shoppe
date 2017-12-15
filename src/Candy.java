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
        //initialze the variables
            super(name);
            this.weight = weight;
            this.pricePerLbs = pricePerLbs;
    }
    
    
    /**
     * A method to find the total cost of the Candy
     * @return the price in rounded form
     */
    @Override
    public int getCost(){
        //Multiplying the cost of the candie by the weight and the price per lbs
        double price =((this.weight) * (this.pricePerLbs));
        //return the price
        return (int) (Math.round(price));
        
    }
/**
 * A method to show a string representation of the object which is the Candy
 * @return the weight in pounds, the cost per pound, the name of the candy and the total cost of the candies in dollars
 */
    @Override
    public String toString(){
        //Converting the price into Dollars and cents
        String costInDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //Placement for the cost in the receipt
        int placement = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costInDollars.length();
         //create a for loop to print out the same exact amount of spaces
        for(int i = 0 ; i < placement; i++){
            costInDollars = " " + costInDollars;
        }
        //the output for the price in the reciept
         //retutning the output
        return this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb. \n" + super.getName() + costInDollars;
       
        
       
    }
}
