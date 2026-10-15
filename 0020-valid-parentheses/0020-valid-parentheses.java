class Solution {
    public boolean isValid(String s) {
        int count=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char first=s.charAt(0);
            if(first==')'||first==']'||first=='}') return false;
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty())return false;
                char top =st.pop();
                if(ch==')' && top!='(')return false;
                if(ch==']' && top!='[')return false;
                if(ch=='}' && top!='{')return false;
                
            }
        }
      return st.isEmpty();
    }
}