package kekishev.fun;

import org.apache.commons.math3.complex.Complex;
import org.springframework.stereotype.Component;

@Component
public class ZetaRiemannFunction {
    public static Complex count(Complex s, int precision) {
        Complex result = new Complex(0, 0);

        for (int i = 0; i < precision; i++) {
            Complex base = new Complex(i);
            base.pow(s);

            Complex one = new Complex(1);
            one.divide(base);
            result.add(one);
        }

        return result;
    }
}
