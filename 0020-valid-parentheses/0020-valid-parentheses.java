class Solution {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '[' || t == '{') x.push(t);
            else 
            {
                if (x.isEmpty()) return false;
                char top = x.pop();
                if (t == ')' && top != '(') return false;
                if (t == ']' && top != '[') return false;
                if (t == '}' && top != '{') return false;
            }
        }
        return x.isEmpty();
    }
}