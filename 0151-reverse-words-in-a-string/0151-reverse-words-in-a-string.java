class Solution {
    public String reverseWords(String s) {
        StringBuilder ss = new StringBuilder(); 
        String[] arr = s.trim().split("\\s+");
        ss.append(arr[arr.length-1]);
        for(int i = arr.length-2; i >= 0 ; i--){
            ss.append(" ");
            ss.append(arr[i]);
        }
        return ss.toString();
    }
}