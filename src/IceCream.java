/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhana Anvic
 */
public class IceCream extends DessertItem {
    
    private int cost;

    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
        
    }
    
    /**
     * The method to get the total cost of the Ice cream
     * @return the cost
     */
    @Override
    public int getCost(){
        return cost;
        
    }

  /**
   * A method to show a string representation of the object which is the Ice cream
   * @return the Name of the ice cream and the total cost in dollars
   */
    @Override
    public String toString(){
       //Converting the price into Dollars and cents
        String costInDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //Placement for the cost in the receipt
        int placement = DessertShoppe.RECEIPT_WIDTH - super.getName().length()- costInDollars.length();
        //create a for loop to print out the same exact amount of spaces
        for(int i = 0 ; i < placement; i++){
           costInDollars = " " + costInDollars;
        }
         
        return super.getName() + costInDollars;

    
     
       
    }
    
}
