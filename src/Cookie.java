/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhana Anvic
 */
public class Cookie extends DessertItem {
    
    //create instance variables
    private int number;
    
    private int pricePer12;
    
    
    public Cookie(String name, int number, int pricePer12){
        //initialize the variables
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }
    
    
    /**
     * A method to get the total cost of the cookies
     * @return the price
     */
  @Override
    public int getCost(){
      // to find the price of the cookies
      //multiply the number of cookies by the price of a dozzen cookies when is it divided by the dozen of cookies
        int price = ((this.number)  * this.pricePer12 /12);
        //and return the price
        return price;
        
        
        
    }
       
  /**
   * A method to show a string representation of the object which is the Cookie
   * @return the number of cookies, the price per dozen, the name of the cookies and the total cost in dollars
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
         
        return this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.getCost())+ " /dz\n" + super.getName() +costInDollars;


}
}

