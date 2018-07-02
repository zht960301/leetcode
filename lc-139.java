//Haotian Zhang
class Solution {
    public boolean wordBreak(String s, List<String> dict) {
	    int len = s.length();
	    boolean[] dp = new boolean[len + 1];
	    dp[0] = true;
	    for (int i = 1; i <= len; i++)
		    for (int j = 0; j < i; j++) {
			    String tmp = s.substring(j, i);
			    if (dp[j] && dict.contains(tmp)) {
				    dp[i] = true;
				    break;
			    }
		    }
	    return dp[len];
    }
}
