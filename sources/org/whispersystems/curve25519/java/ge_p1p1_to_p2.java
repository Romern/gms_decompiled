package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_p1p1_to_p2 {
    public static void ge_p1p1_to_p2(ge_p2 ge_p2, ge_p1p1 ge_p1p1) {
        fe_mul.fe_mul(ge_p2.f192136X, ge_p1p1.f192133X, ge_p1p1.f192132T);
        fe_mul.fe_mul(ge_p2.f192137Y, ge_p1p1.f192134Y, ge_p1p1.f192135Z);
        fe_mul.fe_mul(ge_p2.f192138Z, ge_p1p1.f192135Z, ge_p1p1.f192132T);
    }
}
