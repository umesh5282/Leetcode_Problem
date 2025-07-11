class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        while (sb.length() < k) {
            int length = sb.length();
            for (int i = 0; i < length; i++) {
                sb.append((char)(sb.charAt(i) + 1));
            }
        }
        return sb.charAt(k - 1);
    }
}