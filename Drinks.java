/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milktea;

/**Java Final Project
 * Ordering Drinks System
 * @author minlihe Jianhua Zhang Sean
 */

import java.util.ArrayList;

public class Drinks 
{   
    ArrayList toppingList = new ArrayList();
    
    private String drinkType ;  
    private String temp;
    private int drinkQty = 0;
    private int percentSugar; 
    
    public Drinks (String drinkType)
    {
        this(drinkType, "cold", 1, 100 );
    }
    
    public Drinks (String drinkType, String temp, int drinkQty, int percentSugar)
    {
        this.drinkType = drinkType;
        this.temp = temp;
        this.drinkQty = drinkQty;
        this.percentSugar = percentSugar;
    }
    
    public String getDrinkType()
    {
        return drinkType;
    }
    public void setDrinkType( String drinkType )
    {
        this.drinkType = drinkType;
    }
    
    public String getTemp()
    {
        return temp;
    }
    public void setTemp( String temp )
    {
        this.temp = temp;
    }
    
    public int getDrinkQty()
    {
        return drinkQty;
    }
    public void setDrinkQty(int drinkQty)
    {
        this.drinkQty = drinkQty;
    }
    
    public int getPercentSugar()
    {
        return percentSugar;
    }
    public void setPercentSugar( int percentSugar )
    {
        this.percentSugar = percentSugar;
    }
    
    public ArrayList getTopping()
    {
        return toppingList;
    }
    public void addTopping( String topping )
    {
        toppingList.add(topping);
    }
    
    public double getTotal()
    {
        double total = 0.0;
        total = getDrinkQty() * 3.99 + toppingList.size() * 1.5 * getDrinkQty();
        return total;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name: %s\tQty: %d\n%s\tSugar: %d\nTopping: %s\n", getDrinkType(),getDrinkQty(),
                getTemp(), getPercentSugar(), getTopping());
    }
}


