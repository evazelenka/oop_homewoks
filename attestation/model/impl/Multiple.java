package attestation.model.impl;

import attestation.model.Calculable;
import attestation.model.ComplexNumber;

public class Multiple implements Calculable{
    
    public ComplexNumber calculate(ComplexNumber... args) {
        double r = args[0].getR()*args[1].getR() - args[0].getI()*args[1].getI();
        double i = args[0].getR()*args[1].getI() + args[0].getI()*args[1].getR();
        ComplexNumber result = new ComplexNumber(r, i);
        return result;
    }
}
