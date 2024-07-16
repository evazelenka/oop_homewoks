package attestation.model.impl;

import attestation.model.ComplexNumber;
import attestation.model.SimpleCalculator;

public class Calculator implements SimpleCalculator{

    private ComplexNumber result;

    public void sum(ComplexNumber... args) {
        result = new Sum().calculate(args[0], args[1]);
    }

    public void multiple(ComplexNumber... args) {
        result = new Multiple().calculate(args[0], args[1]);
    }

    public void divide(ComplexNumber... args) {
        result = new Divide().calculate(args[0], args[1]);
    }

    public ComplexNumber getResult() {
        return result;
    }
    
}
