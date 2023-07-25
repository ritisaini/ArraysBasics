package ARRAYCC;

public class smallest_an_array {
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("smallest is: "+ getSmallest(numbers));
    }
}
