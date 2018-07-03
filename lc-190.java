public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binaryNumber = Integer.toBinaryString(n);
        int length = binaryNumber.length();
        StringBuffer result = new StringBuffer();
        char temp;
        for(int i=length-1; i>=0; i--){
            temp = binaryNumber.charAt(i);
            result.append(temp);
        }
        int resultLength=result.length();
        for(int i=resultLength;i<32;i++){
            result.append('0');
        }
        
        String resultStr = new String(result);
        
        Long intResult = Long.parseLong(resultStr, 2);
        return intResult.intValue(); 
        
    }
}