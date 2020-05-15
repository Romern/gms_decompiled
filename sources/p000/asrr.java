package p000;

import java.util.List;

/* renamed from: asrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asrr implements asry {

    /* renamed from: a */
    public int f89535a;

    /* renamed from: b */
    public boolean f89536b;

    /* renamed from: c */
    public String f89537c;

    /* renamed from: d */
    final asrk f89538d;

    /* renamed from: e */
    private final caof f89539e;

    public asrr(asro asro, caou caou, asqq asqq, List list) {
        this.f89538d = new asrk(asqq, caou, new asrp(this, caou));
        casa casa = asro.f89531a;
        asrk asrk = this.f89538d;
        caof a = caog.m126869a(casa, asrk, asrk, asrk, asrk, list);
        this.f89539e = a;
        try {
            a.mo74719a(this.f89538d, new caoe());
        } catch (capg e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final assf mo3391a() {
        return new asrq(this);
    }

    /* renamed from: a */
    public final byte[] mo3393a(byte[] bArr) {
        this.f89535a = 6;
        return this.f89539e.mo74720a(bArr);
    }
}
