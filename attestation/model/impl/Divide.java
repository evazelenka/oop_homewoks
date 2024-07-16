package attestation.model.impl;

import attestation.model.Calculable;
import attestation.model.ComplexNumber;

public class Divide implements Calculable{
    
    public ComplexNumber calculate(ComplexNumber... args) {
        ComplexNumber temp = new ComplexNumber(args[1].getR(), -(args[1].getI()));
        ComplexNumber numerator = new Multiple().calculate(args[0], temp);
        ComplexNumber denominator = new Multiple().calculate(args[1], temp);
        ComplexNumber result = new ComplexNumber(numerator.getR()/denominator.getR(), numerator.getI()/denominator.getR());
        return result;
    }
}
