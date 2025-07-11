import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int result = -1;

        // Step 2: Find largest lucky number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            
            if (number == frequency) {
                result = Math.max(result, number);
            }
        }

        return result;
    }
}
