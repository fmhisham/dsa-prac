public class Main{
    public static void main(String args[]){
        int[] array={2,2,2,5,6,2,7};
        int target = 2;
        int count = 0;
        for(int i : array)
	{
         if(target == i)
             count++;
        }
        System.out.println("total repetation = "+count);
    }
}
