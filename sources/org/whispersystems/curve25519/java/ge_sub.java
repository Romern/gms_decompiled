package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_sub {
    public static void ge_sub(ge_p1p1 ge_p1p1, ge_p3 ge_p3, ge_cached ge_cached) {
        int[] iArr = new int[10];
        fe_add.fe_add(ge_p1p1.f192133X, ge_p3.f192141Y, ge_p3.f192140X);
        fe_sub.fe_sub(ge_p1p1.f192134Y, ge_p3.f192141Y, ge_p3.f192140X);
        fe_mul.fe_mul(ge_p1p1.f192135Z, ge_p1p1.f192133X, ge_cached.YminusX);
        int[] iArr2 = ge_p1p1.f192134Y;
        fe_mul.fe_mul(iArr2, iArr2, ge_cached.YplusX);
        fe_mul.fe_mul(ge_p1p1.f192132T, ge_cached.T2d, ge_p3.f192139T);
        fe_mul.fe_mul(ge_p1p1.f192133X, ge_p3.f192142Z, ge_cached.f192129Z);
        int[] iArr3 = ge_p1p1.f192133X;
        fe_add.fe_add(iArr, iArr3, iArr3);
        fe_sub.fe_sub(ge_p1p1.f192133X, ge_p1p1.f192135Z, ge_p1p1.f192134Y);
        int[] iArr4 = ge_p1p1.f192134Y;
        fe_add.fe_add(iArr4, ge_p1p1.f192135Z, iArr4);
        fe_sub.fe_sub(ge_p1p1.f192135Z, iArr, ge_p1p1.f192132T);
        int[] iArr5 = ge_p1p1.f192132T;
        fe_add.fe_add(iArr5, iArr, iArr5);
    }
}
