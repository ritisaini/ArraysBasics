public class SubArrays {
    public static void PrintSubArrays(int numbers[]){
        int ts=0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sum: " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        PrintSubArrays(numbers);
    }
}
// Total pairs = sum of n numbers = n(n+1)/2