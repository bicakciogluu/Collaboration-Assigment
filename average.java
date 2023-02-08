**
 * average
 */
public class average {
 
private int sum=0;
 private int average; 
// Find an average  

public int  getAverage( int [] array)
{
   for (int element : array)
   {
     sum+= element;
   }
  average= sum/array.length;
  return average;
}
 
public  int  [] getNewArray  ( int [] array)
{
    // Average
    for (int element : array)
   {
     sum+= element;
   }
   average= sum/array.length;
  
    int [] new_array= new int [array.length];
    for(int i=0; i<array.length; i++)
    {
         new_array[i]=  average- array[i];
    }
    return new_array;
}
}