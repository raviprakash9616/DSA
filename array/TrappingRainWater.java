package array;
//Trapping Rainwater Harvesting Problem
public class TrappingRainWater {
    public static int calculateTrappingWater(int height[]) {
        int n = height.length;
        //CALCULATE LEFT MOST BOUNDARY BY USING HELPER ARRAY/AUXALIARY ARRAY
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        //CALCULATE RIGHT MOST BOUNDARY BY USING HELPER ARRAY/AUXALIARY ARRAY
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        //LOOP
            int trappedWater=0;
        for(int i=0;i<n;i++){
            // WaterLevel=min(LeftMaxBound,RightMaxBound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //TrappedWater=waterLevel-height[i]
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
     int height[]={4,2,0,6,3,2,5};
        System.out.println(calculateTrappingWater(height));
    }
}
