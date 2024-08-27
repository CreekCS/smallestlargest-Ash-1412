//Aasha Shakya
public class SmallestLargest{

    public static int[] arr = new int[10];

    public static void main(String[] args){
        for(int i = 0; i < 10; i++)
        {
            arr[i] = (int)((Math.random()*100)+1);
            System.out.println(arr[i]);

        }
        System.out.println("");
        System.out.println(smallestValue());
        System.out.println(largestValue());
    }
    public static int smallestValue(){

        int small = arr[0];
        for(int i = 0; i < 9; i++)
        {
            if(arr[i] < small)
            {
                small = arr[i];
            }
        }
        return small;
    }
    public static int largestValue(){
        int large = arr[0];
        for(int i = 0; i < 9; i++)
        {
            if(arr[i] > large)
            {
                large = arr[i];
            }
        }
        return large;
        
    }
}