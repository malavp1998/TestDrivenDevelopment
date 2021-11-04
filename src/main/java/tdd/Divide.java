package tdd;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Divide {
    public double divideFn(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("divide by zero");
        }
        return a / b;
    }
}
