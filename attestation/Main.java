package attestation;

import attestation.model.impl.Calculator;
import attestation.view.View;

public class Main {
    public static void main(String[] args) {
        // ComplexNumber a = new ComplexNumber(1, 3);
        // ComplexNumber b = new ComplexNumber(2, 1);

        // System.out.println(new Divide().calculate(a, b));
        // System.out.println(new Multiple().calculate(a,b));

        View view = new View();
        view.start(new Decorator(new Calculator()));
    }
}
