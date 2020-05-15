package p000;

import java.security.interfaces.RSAPublicKey;

/* renamed from: bqwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwj implements bqoe {

    /* renamed from: a */
    public final RSAPublicKey f141721a;

    /* renamed from: b */
    public final int f141722b;

    /* renamed from: c */
    public final int f141723c;

    /* renamed from: d */
    public final int f141724d;

    public bqwj(RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        int i4 = bqwl.f141725a;
        bqwl.m113527b(rSAPublicKey.getModulus().bitLength());
        this.f141721a = rSAPublicKey;
        this.f141723c = i;
        this.f141724d = i2;
        this.f141722b = i3;
    }
}
