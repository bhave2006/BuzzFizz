/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author owner3
 */
public class FizzBuzz
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Sets the Variables
         
        String buzz = "buzz", fizz = "fizz";
                for (int i = 1; i <=100; i++)
                {
                // 3 * 5 Prints Fizz Buzz No Dupulicates
                 if (i % 15 == 0)                             
                 {
                 System.out.println(buzz + fizz + " " + i);
                 }     
                 // if can Divide by 3 print buzz
                 else if (i % 3 == 0)
                 {
                  System.out.println(buzz + " " + i);
                 }  
                 // if can Divide by 5 print fizz
                 else if (i % 5 == 0)
                 {
                 System.out.println(fizz + " " + i);
                 }    
                
    }
    
}
}
// End of Program