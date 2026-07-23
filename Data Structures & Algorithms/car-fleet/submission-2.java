class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        // 1. Cars ko pairs mein store karke position ke basis par sort karo
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i]; // Time to reach target
        }
        
        // Position ke ascending order mein sort karo (farthest from target to nearest)
        // Farthest to nearest sort karo (descending order)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        
        Stack<Double> stack = new Stack<>();
        
        // 2. Loop chalao (piche se shuru karo)
        for (int i = 0; i < n; i++) {
            double currentTime = cars[i][1];
            
            // Agar current car ko aage wali car se zyada time lag raha hai, 
            // matlab yeh usko catch nahi kar payegi -> naya fleet banega
            if (stack.isEmpty() || currentTime > stack.peek()) {
                stack.push(currentTime);
            }
            // Agar kam ya barabar time lag raha hai, toh yeh aage wale fleet ke sath merge ho jayegi
        }
        
        // Stack ka size hi total fleets batayega
        return stack.size();
    }
}