/**This program will output the first 20 multiples of 15(starting with 0).  The sixth value will be changed to 527
 * 
 * @author Daksha Reddy
 * @version Jan_20_2016
 */
public class Multiple15
{
    final static int LIMIT = 20;
    final static int MULTIPLE = 15;
    
    public static void main (String[]args)
    {
        int[] list= new int[LIMIT];
        
        for( int index=0; index<LIMIT; index++)
        {
            list[index] = index * MULTIPLE;
            
            list[5] = 527;
        }
        
        for(int index=0; index<LIMIT; index++)
        {
            System.out.print(list[index] + "  ");
        }
        
        System.out.println ();
    
    }
}