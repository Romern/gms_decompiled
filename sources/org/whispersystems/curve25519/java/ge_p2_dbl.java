package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_p2_dbl {
    public static void ge_p2_dbl(ge_p1p1 ge_p1p1, ge_p2 ge_p2) {
        int[] iArr = new int[10];
        fe_sq.fe_sq(ge_p1p1.f192133X, ge_p2.f192136X);
        fe_sq.fe_sq(ge_p1p1.f192135Z, ge_p2.f192137Y);
        fe_sq2.fe_sq2(ge_p1p1.f192132T, ge_p2.f192138Z);
        fe_add.fe_add(ge_p1p1.f192134Y, ge_p2.f192136X, ge_p2.f192137Y);
        fe_sq.fe_sq(iArr, ge_p1p1.f192134Y);
        fe_add.fe_add(ge_p1p1.f192134Y, ge_p1p1.f192135Z, ge_p1p1.f192133X);
        int[] iArr2 = ge_p1p1.f192135Z;
        fe_sub.fe_sub(iArr2, iArr2, ge_p1p1.f192133X);
        fe_sub.fe_sub(ge_p1p1.f192133X, iArr, ge_p1p1.f192134Y);
        int[] iArr3 = ge_p1p1.f192132T;
        fe_sub.fe_sub(iArr3, iArr3, ge_p1p1.f192135Z);
    }
}
