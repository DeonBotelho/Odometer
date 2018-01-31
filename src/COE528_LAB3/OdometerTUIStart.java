/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528_LAB3;

/**
 *
 * @author Deon
 */
public class OdometerTUIStart 
{
    public static void main(String args[])
    {
        Odometer o = new Odometer(5);
        //'-' used to represent all the high order 0's supressed
        System.out.println("'-' represent suppressed '0's.");
        
        //Default odometer
        System.out.println("New Odometer");
        System.out.println(o.count());//print out new odometer value
        
        //Test increment
        System.out.println("\n5 digit odometer incremented 109 times");
        for (int i=0;i<109;i++)
        {
            o.increment();//increment odometer by 1
        }
        System.out.println(o.count());//print out new odometer value
        
        //Test Decrement
        System.out.println("\n5 digit odometer decremented 10 times");
        for (int i=0;i<10;i++)
        {
            o.decrement();//increment odometer by 1
        }
        System.out.println(o.count());//print out new odometer value
        
        //Test reset
        System.out.println("\nReset Odometer");
        o.reset();//reset all digits to 0
        System.out.println(o.count());//print out new odometer value
        
        //Test max value
        System.out.println("\nIncrementing odometer past max value of 99999");
        for (int i=0;i<99999;i++)
        {
            o.increment();//increment odometer by 1
        }
        System.out.println("Currently at 99999");
        System.out.println(o.count());//print out new odometer value
        System.out.println("One more increment");
        o.increment();//increment odometer by 1
        System.out.println(o.count());//print out new odometer value
        
        
    }
    
}
