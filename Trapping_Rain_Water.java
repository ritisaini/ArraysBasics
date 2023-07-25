package ARRAYCC;

public class Trapping_Rain_Water {
    public static int trappingRainWater(int height[]){
        // int n = height.length;
        //calculate left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        } 
        //calculate right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
          rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i=0; i<height.length; i++){
          //waterlevel = min(left max boundary,right max boundary)
          int waterlevel = Math.min(leftMax[i] , rightMax[i]);
            //trapped Water = waterlevel - height[i]
          trappedWater += waterlevel - height[i];
        }
       return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappingRainWater(height));
    }
}
//time complexity is o(n) i.e best time complexity ever