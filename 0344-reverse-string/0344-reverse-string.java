class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int left=0, right=n-1;

        while(right>left){
            //swap
            char ch=s[left];
            s[left]=s[right];
            s[right]=ch;
            right--;
            left++;
        }

    }
}