package io.github.cedricmeu;

public class Main {

    public static void main(String[] args) {
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();

        //       | 4 4 4 |
        //  m1 = | 4 4 4 |
        //       | 4 4 4 |
        for (int y = 0; y < Matrix.SIZE; y++) {
            for (int x = 0; x < Matrix.SIZE; x++) {
                m1.set(x, y, 4);
            }
        }

        //       | 2 0 0 |
        //  m2 = | 0 3 0 |
        //       | 0 0 4 |
        m2.set(0,0,2);
        m2.set(1,1,3);
        m2.set(2,2,4);

        //        | 5 4 4 |
        //  add = | 4 5 4 |
        //        | 4 4 5 |
        Matrix add = m1.add(m2);

        //       |  8  8  8 |
        //  m2 = | 12 12 12 |
        //       | 16 16 16 |
        Matrix mul = m1.mul(m2);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(add);
        System.out.println(mul);
    }
}
