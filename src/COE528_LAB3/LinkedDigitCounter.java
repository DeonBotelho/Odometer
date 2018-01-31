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
public class LinkedDigitCounter extends AbstractCounter
{
    //Store digit to the left of this one , to be intialized in constucter
    private Counter leftNeighbor= null;
   
    //"default" constucter needs leftNeighbor to point to
    LinkedDigitCounter (Counter leftNeighbor)
    {
        super();//call parent constucter
        this.leftNeighbor=leftNeighbor; //intialize instance variable       
    }
    
    //not needed for this lab , incase of prior value 
    LinkedDigitCounter (int value,Counter leftNeighbor)
    {
        super(value);
        this.leftNeighbor=leftNeighbor;        
    }
    
    @Override
    public void increment()//add one to the digit, if 9 make sure leftNeightbor also increments
    {
       if (value < 9)
           value = value + 1;
       else 
       {
           value = 0;
           //  increment digit to the left
           leftNeighbor.increment();
        }
    }
    @Override
    public void decrement()//subtract one to the digit, if 0 make sure leftNeightbor also decrements
    {
        if (value > 0) 
            value = value -1;
        else 
        {
            value = 9;
            //decrement digit to the left
            leftNeighbor.decrement();
        }
        
    }
    
   
    
    
}
