
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Result array banaya (ismein by default sab 0 hai)
        int[] result = new int[temperatures.length];
        
        // Stack banaya INDICES store karne ke liye
        Stack<Integer> st = new Stack<>();

        // list.size() ki jagah temperatures.length use kiya
        for (int i = 0; i < temperatures.length; i++) {
            
            if (st.isEmpty()) {
                // Value ki jagah Index push kiya
                st.push(i); 
            } else {
                // Jab tak current temperature stack ke top wale din ke temperature se bada hai
                while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                    // indexOf ki zarurat hi nahi padi, kyunki st.peek() hi index hai!
                    int idx = st.peek(); 
                    
                    // Difference calculate karke result mein daal diya
                    result[idx] = i - idx;
                    
                    st.pop();
                }
                // Ab current day ka index push kardo stack mein
                st.push(i);
            }
        }

        // Woh ' ' wala loop hata diya kyunki array pehle se hi 0 se bhara hai
        return result;
    }
}