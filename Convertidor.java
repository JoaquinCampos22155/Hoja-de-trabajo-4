public class Convertidor {
    
    /** 
     * @param infix
     * @return String
     */
    public String Traductor(String infix) {
    String postfix = "";
    FunStack<Character> stack = new FormaArrayL<>();

    for (char c : infix.toCharArray()) {
        if (Character.isDigit(c)) {
            postfix += c + " ";
        } else if (c == '(') {
            stack.push(c);
        } else if (c == ')') {
            while (!stack.empty() && stack.peek() != '(') {
                postfix += stack.pop() + " ";
            }
            stack.pop();
        } else {
            while (!stack.empty() && hasPrecedence(c, stack.peek())) {
                postfix += stack.pop() + " ";
            }
            stack.push(c);
        }
    }

    while (!stack.empty()) {
        postfix += stack.pop() + " ";
    }

    return postfix.trim();
}
private boolean hasPrecedence(char op1, char op2) {
    if (op2 == '(' || op2 == ')')
        return false;
    if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
        return false;
    return true;
}
}
