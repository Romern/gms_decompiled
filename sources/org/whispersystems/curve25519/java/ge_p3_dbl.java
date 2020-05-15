package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_p3_dbl {
    public static void ge_p3_dbl(ge_p1p1 ge_p1p1, ge_p3 ge_p3) {
        ge_p2 ge_p2 = new ge_p2();
        ge_p3_to_p2.ge_p3_to_p2(ge_p2, ge_p3);
        ge_p2_dbl.ge_p2_dbl(ge_p1p1, ge_p2);
    }
}
