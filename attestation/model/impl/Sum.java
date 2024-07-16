package attestation.model.impl;

import attestation.model.Calculable;
import attestation.model.ComplexNumber;

public class Sum implements Calculable{
    
    public ComplexNumber calculate(ComplexNumber... args) {
        return new ComplexNumber(args[0].getR() + args[1].getR(), args[0].getI() + args[1].getI());
    }
}
