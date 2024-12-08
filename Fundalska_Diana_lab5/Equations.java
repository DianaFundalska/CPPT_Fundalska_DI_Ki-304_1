package Fundalska_Diana_lab5;

public class Equations {
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = 1 / (Math.tan(2 * rad));
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 0 || x == 90 || x == -90)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if (x == 0)
                throw new CalcException("Exception reason: X = 0");

            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}