//Haotian Zhang
class Solution {
    public boolean isValid(String s) {
    	if(s.length()==1){
    		return false;
    	}
        if(s.length()==0){
            return true;
        }
		
		Stack<Character> st = new Stack<>();

		st.push(s.charAt(0));
		for(int i=1;i<s.length();i++){
			char current=s.charAt(i);
			if(current==')'||current==']'||current=='}'){
				if(!st.empty()&&current==getChar(st.peek())){
					st.pop();
				}else{
					return false;
				}
			}else{
				st.push(current);
			}

		}       
        if(!st.empty()){
            return false;
        }


        return true;
    }
    
    
    public  char getChar(char ch) {
    	switch(ch){
    	   case '[':
    		   return ']';
    	   case ']':
    		   return '[';
    	   case '(':
    		   return ')';
    	   case ')':
    		   return '(';
    	   case '{':
    		   return '}';
    	   case '}':
    		   return '{';
    		   default:
    			   return ' ';
    	}

    }
}



