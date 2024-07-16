package attestation.service;

import java.util.HashMap;
import java.util.Map;

import attestation.model.Calculable;
import attestation.model.ComplexNumber;
import attestation.model.SimpleCalculator;

public class CalculatorService {
    
    private static Map<String, Calculable> operations = new HashMap<>();
    private static SimpleCalculator calculator;

    static{
        operations.put("+", args -> sum(args[0], args[1]));
        operations.put("*", args -> multiple(args[0], args[1]));
        operations.put("/", args -> divide(args[0], args[1]));
    }

    public static void setCalculator(SimpleCalculator calculator) {
        CalculatorService.calculator = calculator;
    }

    public Map<String, Calculable> getOperations() {
        return operations;
    }

    private static ComplexNumber multiple(ComplexNumber... args) {
        calculator.multiple(args[0], args[1]);
        return calculator.getResult();
    }

    private static ComplexNumber divide(ComplexNumber... args) {
        calculator.divide(args[0], args[1]);
        return calculator.getResult();
    }
    
    private static ComplexNumber sum(ComplexNumber... args) {
        calculator.sum(args[0], args[1]);
        return calculator.getResult();
    }

}
