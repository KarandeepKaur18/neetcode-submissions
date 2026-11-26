class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        if(s.length() == 1){
            return true;
        }

        while(left<=right){
            
            if(!Character.isLetterOrDigit(s.charAt(left)) || s.charAt(left)== ' '){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right)) || s.charAt(right) == ' '){
                right--;
            }else{
                if(Character.toLowerCase(s.charAt(left))== Character.toLowerCase(s.charAt(right))){
                    left++;
                    right--;
                }else{
                    return false;
                }
            }

        
        }

        return true;
    }
}
