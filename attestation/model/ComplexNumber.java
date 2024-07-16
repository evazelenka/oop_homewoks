package attestation.model;

public class ComplexNumber {
    
    private double r;
    private double i;

    public ComplexNumber(double r, double i) {
        this.r = r;
        this.i = i;
    }

    public double getI() {
        return i;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        if(r != 0 && i > 0){
            if(i == 1){
                return String.format("%s + i", r);
            }else return String.format("%s + %si", r, i);
        }
        if(r == 0 && i != 0){
            return String.format("%si", i);   
        }
        if(r != 0 && i == 0){
            return String.valueOf(r);
        }
        if(r == 0 && i == 0){
            return null;
        }
        if(r != 0 && i < 0){
            if(i == -1){
                return String.format("%s - i", r);
            }else return String.format("%s - %si", r, -(i));
        }
        return null;
    }
}
