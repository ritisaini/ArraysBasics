// Compute how much water it can trap after raining?
public class Trap_after_raining {
    public int trap(int height[]){
        int n = height.length;
        int res = 0, l = 0, r = n-1;
        int rMax = height(r) , lMax = height[l];

        while(l<r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, height(l));
                res = lMax-height(l);
            } else {
                r--;
                rMax = Math.max(rMax, height(r));
                res += rMax - height(r);
            }
        }
        return res;
    }
}
