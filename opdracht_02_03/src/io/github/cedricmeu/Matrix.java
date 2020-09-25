package io.github.cedricmeu;

import java.util.Arrays;

/**
 * @author Cédric Meukens
 */
public class Matrix {
    public final static int SIZE = 3;
    int[][] data;

    public Matrix() {
        this.data = new int[SIZE][SIZE];
        for (int[] datum : data) {
            Arrays.fill(datum, 0);
        }
    }

    public int get(int x, int y) {
        return data[y][x];
    }

    public void set(int x, int y, int value) {
        this.data[y][x] = value;
    }

    public Matrix add(Matrix other) {
        Matrix result = new Matrix();

        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                result.set(x, y,
                        this.get(x, y) + other.get(x, y));
            }
        }

        return result;
    }

    public Matrix mul(Matrix other) {
        Matrix result = new Matrix();

        for (int x = 0; x < SIZE; x++) {
            for (int y = 0; y < SIZE; y++) {
                int value = 0;
                for (int i = 0; i < SIZE; i++) {
                    value += this.get(i, y) * other.get(x, i);
                }
                result.set(x, y, value);
            }
        }

        return result;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int x = 0; x < SIZE; x++) {
            builder.append("| ");
            for (int y = 0; y < SIZE; y++) {
                builder.append(this.get(x, y)).append(" ");
            }
            builder.append("|\n");
        }

        return builder.toString();
    }
}
