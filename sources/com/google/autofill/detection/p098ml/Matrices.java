package com.google.autofill.detection.p098ml;

/* renamed from: com.google.autofill.detection.ml.Matrices */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Matrices {
    private Matrices() {
    }

    public static boolean equal(Matrix matrix, Matrix matrix2) {
        if (matrix.width != matrix2.width || matrix.height != matrix2.height) {
            return false;
        }
        for (int i = 0; i < matrix.height; i++) {
            for (int i2 = 0; i2 < matrix.width; i2++) {
                if (Float.compare(matrix.get(i, i2), matrix2.get(i, i2)) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static ArrayMatrix multiply(Matrix matrix, Matrix matrix2) {
        if (matrix.width == matrix2.height) {
            ArrayMatrix arrayMatrix = new ArrayMatrix(matrix.height, matrix2.width);
            for (int i = 0; i < arrayMatrix.height; i++) {
                for (int i2 = 0; i2 < matrix.width; i2++) {
                    float f = matrix.get(i, i2);
                    for (int i3 = 0; i3 < arrayMatrix.width; i3++) {
                        arrayMatrix.add(i, i3, matrix2.get(i2, i3) * f);
                    }
                }
            }
            return arrayMatrix;
        }
        throw new IllegalArgumentException(String.format("Attempting to multiply matrices with incompatible sizes: (%d, %d) x (%d, %d)", Integer.valueOf(matrix.height), Integer.valueOf(matrix.width), Integer.valueOf(matrix2.height), Integer.valueOf(matrix2.width)));
    }
}
