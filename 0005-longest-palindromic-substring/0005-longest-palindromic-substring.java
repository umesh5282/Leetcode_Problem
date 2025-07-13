class Solution {
    public String longestPalindrome(String s) {
       if (s == null || s.length() < 1) return "";
       String result = s.substring(0, 1);
         for(int i=0; i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String sub =s.substring(i,j+1);
                if(isPalindrome(sub)&& sub.length()>result.length()){
                    result=sub;
                }
            }
         }
        return result;
    }
    public boolean isPalindrome(String s){
          int l=0, r=s.length()-1;
          while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
               return false;
            }
            l++;
            r--;
          }
          return true;
    }
   
}