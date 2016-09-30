/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Carter Langbert - CHANGE TO YOUR NAME
 * @class AP CSA
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0; i < 100; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
                // If int i is evenly divisible by 3 and 5, print
                // out "FizzBuzz"
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
                // Otherwise, if int i is only evenly divisible by
                // 3, then print "Fizz"
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
                // Otherwise, if int i is only evenly divisible by
                // 5, then print "Buzz"
            }
            else
            {
                System.out.println(i);
                // Otherwise, if int i isn't divisible by neither
                // 3 or 5, just print out the integer value of int i
            }
        }
    }
    
}
