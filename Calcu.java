public class Calcu {
    private static Calcu calcus;
    private FunStack<Double> stack;

    private Calcu(FunStack<Double> stack) {
        this.stack = stack;
    }

    
    /** 
     * @param stack
     * @return Calcu
     */
    public static Calcu getInstance(FunStack<Double> stack) {
        if (calcus == null) {
            calcus = new Calcu(stack);
        }
        return calcus;
    }
    public double calcular(String expression) {
        char[] expr = expression.toCharArray();
        for (int i = 0; i < expr.length; i++) {
            if (expr[i] != ' ') {
                if (expr[i] == '+') {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a + b);
                } else if (expr[i] == '-') {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                } else if (expr[i] == '*') {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a * b);
                } else if (expr[i] == '/') {
                    double b = stack.pop();
                    double a = stack.pop();
                    if (b == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    stack.push(a / b);
                } else {
                    String numStr = String.valueOf(expr[i]);
                    double num = Double.parseDouble(numStr);
                    stack.push(num);
                }
            }
        }
        return stack.pop();
    }
    
}
