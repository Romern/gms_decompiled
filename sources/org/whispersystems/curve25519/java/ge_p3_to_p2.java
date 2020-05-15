package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_p3_to_p2 {
    public static void ge_p3_to_p2(ge_p2 ge_p2, ge_p3 ge_p3) {
        fe_copy.fe_copy(ge_p2.f192136X, ge_p3.f192140X);
        fe_copy.fe_copy(ge_p2.f192137Y, ge_p3.f192141Y);
        fe_copy.fe_copy(ge_p2.f192138Z, ge_p3.f192142Z);
    }
}
