/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhana Anvic
 */
public class Sundae extends IceCream{
    
    //create an instance variables
    private String toppingName;
    private int toppingCost;
    

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost){
        //initialize the variables
        super(icName, icCost);
        this.toppingCost = toppingCost;
        this.toppingName = toppingName;
        
       
    }
    /** a Method to find the total cost of the sundae
     * 
     * @return the price
     */
    @Override
    public int getCost(){
        //to get the price of the sundae just add the cost of the Icecream and the toppings cost
        //get the method getCost in the supperclass to know the cost of the icecream
        int price = super.getCost() + this.toppingCost;
        //return the price
        return price;
        
        
    }
    

    /**
     * A method to show a string representation of the object which is the Sundae
     * @return the topping name, Ice cream name and the total cost of the sundae in dollars
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
         
         return this.toppingName + " Sundae with \n" + super.getName() + costInDollars;

        
    }
    
}
