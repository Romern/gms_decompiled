package org.whispersystems.curve25519.java;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ge_p3_to_cached {

    /* renamed from: d2 */
    static int[] f192143d2 = {-21827239, -5839606, -30745221, 13898782, 229458, 15978800, -12551817, -6495438, 29715968, 9444199};

    public static void ge_p3_to_cached(ge_cached ge_cached, ge_p3 ge_p3) {
        fe_add.fe_add(ge_cached.YplusX, ge_p3.f192141Y, ge_p3.f192140X);
        fe_sub.fe_sub(ge_cached.YminusX, ge_p3.f192141Y, ge_p3.f192140X);
        fe_copy.fe_copy(ge_cached.f192129Z, ge_p3.f192142Z);
        fe_mul.fe_mul(ge_cached.T2d, ge_p3.f192139T, f192143d2);
    }
}
