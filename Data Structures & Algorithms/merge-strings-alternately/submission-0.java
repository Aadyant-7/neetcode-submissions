class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();

        char[] W1 = word1.toCharArray();
        char[] W2 = word2.toCharArray();

        int l1 = W1.length;
        int l2 = W2.length;

        int i = 0;
        int j = 0;

        while(i != l1 || j != l2){
            if(i < l1){
                res.append(W1[i]);
                i++;
            }
            if(j < l2){
                res.append(W2[j]);
                j++;
            }
        }

        return res.toString();
    }
}