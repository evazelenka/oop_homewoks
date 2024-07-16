package attestation;

import java.util.logging.Level;
import java.util.logging.Logger;

import attestation.model.ComplexNumber;
import attestation.model.SimpleCalculator;
import attestation.util.Log;

public class Decorator implements SimpleCalculator{

    private static Logger log = Log.log(Decorator.class.getName());
    private SimpleCalculator calculator;

    public Decorator(SimpleCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void sum(ComplexNumber... args) {
        calculator.sum(args[0],args[1]);
        log.log(Level.INFO, String.format("sum is done, result = %s", getResult()));
    }

    @Override
    public void multiple(ComplexNumber... args) {
        calculator.multiple(args[0],args[1]);
        log.log(Level.INFO, String.format("multiple is done, result = %s", getResult()));
    }

    @Override
    public void divide(ComplexNumber... args) {
        calculator.divide(args[0],args[1]);
        log.log(Level.INFO, String.format("divide is done, result = %s", getResult()));
        
    }

    @Override
    public ComplexNumber getResult() {
        return calculator.getResult(); 
    }

    
}
