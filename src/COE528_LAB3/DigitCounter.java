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
public class DigitCounter extends AbstractCounter
{
    //Default constucter
    DigitCounter ()
    {
        super();
    }
    //Not needed for this lab
    DigitCounter (int value)
    {
        super(value);
    }
    
    @Override
    public void increment()//add one to the digit
    {
        if (value < 9)
        {
            value = value + 1;
        }
        else 
        {
           value = 0;
        }
    }
    @Override
    public void decrement()//subtract one to the digit
    {
        if (value > 0) 
            value = value -1;
        else 
        {
            value = 9;
        }
        
    }
  
}
