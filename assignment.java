public class assignment{
    //the method that you can use to find the minimum value in a spesific array
    public int findMin(int[] intArray){
        int i = 100;
        for(int a : intArray){
            if(a<i){
                i = a;
            }
        }
        return i;
    
    }
    
    //the method that you can use to find the maximum value in a spesific array
    public int findMax(int[] intArray){
        int i = 0;
        for(int a : intArray){
            if(a>i){
                i = a;
            }
        }
        return i;
    
    }
}
