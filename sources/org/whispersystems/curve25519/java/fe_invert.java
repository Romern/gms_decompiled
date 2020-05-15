package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fe_invert {
    public static void fe_invert(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        int[] iArr4 = new int[10];
        int[] iArr5 = new int[10];
        int[] iArr6 = new int[10];
        fe_sq.fe_sq(iArr3, iArr2);
        fe_sq.fe_sq(iArr4, iArr3);
        fe_sq.fe_sq(iArr4, iArr4);
        fe_mul.fe_mul(iArr4, iArr2, iArr4);
        fe_mul.fe_mul(iArr3, iArr3, iArr4);
        fe_sq.fe_sq(iArr5, iArr3);
        fe_mul.fe_mul(iArr4, iArr4, iArr5);
        fe_sq.fe_sq(iArr5, iArr4);
        for (int i = 1; i < 5; i++) {
            fe_sq.fe_sq(iArr5, iArr5);
        }
        fe_mul.fe_mul(iArr4, iArr5, iArr4);
        fe_sq.fe_sq(iArr5, iArr4);
        for (int i2 = 1; i2 < 10; i2++) {
            fe_sq.fe_sq(iArr5, iArr5);
        }
        fe_mul.fe_mul(iArr5, iArr5, iArr4);
        fe_sq.fe_sq(iArr6, iArr5);
        for (int i3 = 1; i3 < 20; i3++) {
            fe_sq.fe_sq(iArr6, iArr6);
        }
        fe_mul.fe_mul(iArr5, iArr6, iArr5);
        fe_sq.fe_sq(iArr5, iArr5);
        for (int i4 = 1; i4 < 10; i4++) {
            fe_sq.fe_sq(iArr5, iArr5);
        }
        fe_mul.fe_mul(iArr4, iArr5, iArr4);
        fe_sq.fe_sq(iArr5, iArr4);
        for (int i5 = 1; i5 < 50; i5++) {
            fe_sq.fe_sq(iArr5, iArr5);
        }
        fe_mul.fe_mul(iArr5, iArr5, iArr4);
        fe_sq.fe_sq(iArr6, iArr5);
        for (int i6 = 1; i6 < 100; i6++) {
            fe_sq.fe_sq(iArr6, iArr6);
        }
        fe_mul.fe_mul(iArr5, iArr6, iArr5);
        fe_sq.fe_sq(iArr5, iArr5);
        for (int i7 = 1; i7 < 50; i7++) {
            fe_sq.fe_sq(iArr5, iArr5);
        }
        fe_mul.fe_mul(iArr4, iArr5, iArr4);
        fe_sq.fe_sq(iArr4, iArr4);
        for (int i8 = 1; i8 < 5; i8++) {
            fe_sq.fe_sq(iArr4, iArr4);
        }
        fe_mul.fe_mul(iArr, iArr4, iArr3);
    }
}
