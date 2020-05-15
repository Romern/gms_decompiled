package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_precomp_0 {
    public static void ge_precomp_0(ge_precomp ge_precomp) {
        fe_1.fe_1(ge_precomp.yplusx);
        fe_1.fe_1(ge_precomp.yminusx);
        fe_0.fe_0(ge_precomp.xy2d);
    }
}
