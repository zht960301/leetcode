class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        int result[]=new int[digits.length+1];

        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
                carry=true;
            }
        }
        if(carry){
            result[0]=1;
            for(int i=1;i<result.length;i++){
                result[i]=digits[i-1];
            }
        }
        return result;
    }
}