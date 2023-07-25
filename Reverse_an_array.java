public class Reverse_an_array{

    public static void reverse(int numbers[]){
        int first=0 , last=numbers.length-1;
        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
//1) we can make a new array and we reverse into that and copy but in this time complexity is o(n) but space complexity increases so we cannot use this approach.
//2) we use SWAPPING in this space complexity is constant i.e o(1)