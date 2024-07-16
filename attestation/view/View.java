package attestation.view;

import java.util.Map;
import java.util.Scanner;

import attestation.controller.CalculatorController;
import attestation.model.Calculable;
import attestation.model.ComplexNumber;
import attestation.model.SimpleCalculator;

public class View {
    
    public static Map<String, Calculable> operations = CalculatorController.getOperations();
    
    private static ComplexNumber calculate(SimpleCalculator calculator) {
        int r = Integer.parseInt(prompt("Enter real of first complex number: "));
        int i = Integer.parseInt(prompt("Enter image of first complex number: "));
        System.out.println(" ");
        ComplexNumber cN1 = new ComplexNumber(r, i);
        int r2 = Integer.parseInt(prompt("Enter real of second complex number: "));
        int i2 = Integer.parseInt(prompt("Enter image of second complex number: "));
        System.out.println(" ");
        ComplexNumber cN2 = new ComplexNumber(r2, i2);
        System.out.printf("z1 = %s, z2 = %s", cN1, cN2);
        System.out.println(" ");
        System.out.println(" ");
        String operator = prompt("Enter math operation (+ / *): ");
        System.out.println(" ");
        System.out.print("z = ");
        CalculatorController.setCalculator(calculator);
        if (operations.containsKey(operator))
            return CalculatorController.getOperations().get(operator).calculate(cN1,cN2);
        else
            throw new RuntimeException("Unsupported math operation");
    }

    public void start(SimpleCalculator calculator){
        System.out.println(calculate(calculator));
    }

    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}
