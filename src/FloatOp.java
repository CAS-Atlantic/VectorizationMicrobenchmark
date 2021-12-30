/**
 *	Author: Md Alvee Noor (alvee.n@unb.ca, alvee.e1tech@gmail.com)
 *	Centre for Advanced Studies-Atlantic (CAS-Atlantic)
 *	Univerity of New Brunswick
*/

public class FloatOp {

    static long addF(float[] x, float y[]) {
        long startTime = System.nanoTime();

        for (int i = 0; i < x.length; i++) {
            x[i] += y[i];
        }

        return System.nanoTime() - startTime;
    }

    static long subF(float[] x, float y[]) {
        long startTime = System.nanoTime();

        for (int i = 0; i < x.length; i++) {
            x[i] -= y[i];
        }

        return System.nanoTime() - startTime;
    }

    static long mulF(float[] x, float y[]) {
        long startTime = System.nanoTime();

        for (int i = 0; i < x.length; i++) {
            x[i] *= y[i];
        }

        return System.nanoTime() - startTime;
    }

    static long divF(float[] x, float y[]) {
        long startTime = System.nanoTime();

        for (int i = 0; i < x.length; i++) {
            x[i] /= y[i];
        }

        return System.nanoTime() - startTime;
    }
}
