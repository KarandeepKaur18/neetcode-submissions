class TimeMap {

    HashMap<String, ArrayList<Integer>> times;
    HashMap<String, ArrayList<String>> values;

    public TimeMap() {
        times = new HashMap<>();
        values = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        if (!times.containsKey(key)) {
            times.put(key, new ArrayList<>());
            values.put(key, new ArrayList<>());
        }

        times.get(key).add(timestamp);
        values.get(key).add(value);
    }

    public String get(String key, int timestamp) {

        if (!times.containsKey(key)) {
            return "";
        }

        ArrayList<Integer> t = times.get(key);
        ArrayList<String> v = values.get(key);

        int left = 0;
        int right = t.size() - 1;

        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (t.get(mid) <= timestamp) {
                ans = mid;
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        if (ans == -1) {
            return "";
        }

        return v.get(ans);
    }
}