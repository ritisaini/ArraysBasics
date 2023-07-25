public class MaxSubSum_Bruteforce {
        public static void maxSubArraySum(int numbers[]){
            int currSum=0;
            int maxSum = Integer.MIN_VALUE;
            for(int i=0; i<numbers.length; i++){
                int start = i;
                for(int j=i; j<numbers.length; j++){
                    int end = j;
                    currSum=0;
                    for(int k=start; k<=end; k++){
                       currSum = currSum + numbers[k];
                    }
                    System.out.println(currSum);
                    if(maxSum < currSum){
                        maxSum = currSum;
                    }
                }
            }
            System.out.println("max sum: " + maxSum);
        }
        public static void main(String args[]){
            int numbers[] = {2,4,6,8,10};
            maxSubArraySum(numbers);
        }
    }
// TIME COMPLEXITY = o(n^3) i.e n cube bcoz 3 loops are there.
