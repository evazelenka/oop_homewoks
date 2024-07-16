package attestation.model;

public interface SimpleCalculator {
    
    public void sum(ComplexNumber... args);
    public void multiple(ComplexNumber... args);
    public void divide(ComplexNumber... args);
    public ComplexNumber getResult();
}
