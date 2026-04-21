
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count Frequencies (Yeh toh tujhe already aata hai)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: The VIP Line (Priority Queue)
        // Yahan hum PQ ko sikha rahe hain ki sort kaise karna hai:
        // "(a, b) -> map.get(b) - map.get(a)" ka matlab hai: "Jiski frequency (map.get) badi ho, usko aage rakho"
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        // Step 3: Saare numbers (Keys) ko is VIP line mein daal do.
        // PQ automatically unko unki frequency ke hisaab se sort kar legi.
        for (int key : map.keySet()) {
            pq.add(key);
        }

        // Step 4: Line ke sabse aage khade 'k' logo ko nikal lo
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll(); // .poll() line ke sabse aage wale element ko nikal kar de deta hai
        }

        return ans;
    }
}