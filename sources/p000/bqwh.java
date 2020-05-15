package p000;

import java.security.interfaces.RSAPublicKey;

/* renamed from: bqwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwh implements bqoe {

    /* renamed from: a */
    public final RSAPublicKey f141714a;

    /* renamed from: b */
    public final int f141715b;

    public bqwh(RSAPublicKey rSAPublicKey, int i) {
        int i2 = bqwl.f141725a;
        bqwl.m113527b(rSAPublicKey.getModulus().bitLength());
        this.f141714a = rSAPublicKey;
        this.f141715b = i;
    }
}
