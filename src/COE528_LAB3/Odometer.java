/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COE528_LAB3;
import java.lang.IllegalArgumentException;
/**
 *
 * @author Deon
 */
public class Odometer implements Counter
{
    private int numOfDigits;//store number of digits
    private Counter digits[];//array of all LDC and DC 
    
    //Constructer
    Odometer(int n)
    {
        if(n<=0)
        {
            throw new IllegalArgumentException();
        }
        this.numOfDigits=n;
        digits= new Counter[n];//intialize array of digits
        digits [0] = new DigitCounter();//first digit (left most) is a DC
        for (int i=1;i<n;i++)
        {
            //Intialize all other digits pointed to their left neighbor.
            digits[i] = new LinkedDigitCounter(digits[i-1]);
        }
    }
    /* The current value of this Counter as a String of digits. */
    @Override
    public String count()
    {
        String output = "";
        Boolean flag = false;//false until a non zero value is found
        for (int i = 0; i < numOfDigits;i++)//supress highorder 0's
        {
             if(digits[i].count().equals("0")&& flag == false)
             {
                 /*Supress high order 0's */
                 output= output + "-"; //"' -' represent the supressed 0
             }
             else
             {
                 flag = true;
                 output= output + digits[i].count();//add all string values together
             }
             
        }
        return output;
    }
    /* Increment this Counter.   */
    @Override
    public void increment()
    {
        digits[numOfDigits-1].increment();//increment right most digit
    }
    /* Decrement this Counter.  */
    @Override
    public void decrement()
    {
        digits[numOfDigits-1].decrement();//decrement right most digit
    }
    /* Reset this Counter.  */
    @Override
    public void reset()
    {
        for (int i = 0; i < numOfDigits;i++)
        {
            digits[i].reset();//reset all digits
        }
    }
}
