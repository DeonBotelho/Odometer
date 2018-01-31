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
public abstract class AbstractCounter implements Counter 
{
    //Store current digit value as an int
    protected int value;
    //default constucter 
    AbstractCounter ()
    {
        //default value is 0
        this.value = 0;
    }
    //Optional constucter incase a prior value exsits (not needed for this lab)
    AbstractCounter (int value)
    {
        this.value = value;
    }
    
    @Override
    public abstract void increment();/*not needed already exsits in Counter in this form*/
    @Override
    public abstract void decrement();/*not needed already exsits in Counter in this form*/
    @Override
    public void reset()
    {
        value = 0;/*reset value to 0*/
    }
    @Override
    public String count()
    {
        return String.valueOf(value);//Return String representation of int value        
    }
    public String queryCount()
    {
        return count();//Returns current value as a string
    }
    
    
}
