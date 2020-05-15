package p000;

import java.security.KeyPair;
import java.security.PublicKey;

/* renamed from: xcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xcj implements xch {

    /* renamed from: a */
    private final byte[] f51924a;

    /* renamed from: b */
    private final KeyPair f51925b;

    /* renamed from: c */
    private final String f51926c;

    /* renamed from: d */
    private final xmo f51927d;

    public xcj(xmo xmo, byte[] bArr, KeyPair keyPair, String str) {
        bmxy.m108581a(xmo);
        bmxy.m108581a(bArr);
        bmxy.m108581a(keyPair);
        bmxy.m108581a(str);
        this.f51927d = xmo;
        this.f51924a = bArr;
        this.f51925b = keyPair;
        this.f51926c = str;
    }

    /* renamed from: a */
    public final bqgg mo29630a() {
        this.f51927d.mo29952a(this.f51926c, System.currentTimeMillis());
        return adbb.m50100a(this.f51927d.mo29951a(this.f51926c));
    }

    /* renamed from: b */
    public final byte[] mo29631b() {
        return this.f51924a;
    }

    /* renamed from: c */
    public final PublicKey mo29632c() {
        return this.f51925b.getPublic();
    }
}
