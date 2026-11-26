class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charAr = s.toCharArray();
        Arrays.sort(charAr);

        char[] charAr2 = t.toCharArray();
        Arrays.sort(charAr2);

        if(Arrays.equals(charAr,charAr2)){
            return true;
        }else{
            return false;
        }
    }
}
