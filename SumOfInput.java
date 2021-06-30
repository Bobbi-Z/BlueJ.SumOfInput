/**
 * Returning the sum of numbers 1 to n.
 *
 * @author Bobbi
 * @version 06/29/21
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private int oneToNumber;
    

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        //initialise instance variables
        Integer oneToNumber;
    }
    
    public Integer oneToNumber(int n){
       int sum = 0;
        
        for (int x = 1; x <= n; x++){
            sum += x;
        }
        
            return sum;
    }

}
