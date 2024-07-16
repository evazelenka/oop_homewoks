package attestation.controller;

import java.util.Map;

import attestation.model.Calculable;
import attestation.model.SimpleCalculator;
import attestation.service.CalculatorService;

public class CalculatorController {

    private static CalculatorService service = new CalculatorService();
    
    public static Map<String, Calculable> getOperations() {
        return service.getOperations();
    }

    public static void setCalculator(SimpleCalculator calculator){
        CalculatorService.setCalculator(calculator);
    }
}
