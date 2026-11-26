class Solution {

    public String encode(List<String> strs) {
       StringBuilder str = new StringBuilder();
       for(String string : strs){
        str.append(string.length()).append("#").append(string);
       }

       return str.toString();
    }


    public List<String> decode(String str) {
        List<String> decodelist = new ArrayList<>();
        int i = 0;
        

        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!= '#'){
                j++;
            }

            int le = Integer.parseInt(str.substring(i,j));

            i = j+1;
            j = le + i;

            decodelist.add(str.substring(i,j));
            i = j;

        }

        return decodelist;
    }
}
