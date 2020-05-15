package p000;

import android.content.Context;

/* renamed from: igr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class igr {

    /* renamed from: a */
    public Context f20933a;

    /* renamed from: b */
    public axsg f20934b;

    /* renamed from: c */
    public axsn f20935c;

    /* renamed from: d */
    private rkb f20936d;

    public igr() {
    }

    /* renamed from: a */
    public final igs mo12996a(String str) {
        return mo12997a(str, new byte[0]);
    }

    public igr(Context context, rkb rkb, axsg axsg, axsn axsn) {
        bmxy.m108581a(context);
        this.f20933a = context;
        bmxy.m108581a(rkb);
        this.f20936d = rkb;
        bmxy.m108581a(axsg);
        this.f20934b = axsg;
        bmxy.m108581a(axsn);
        this.f20935c = axsn;
    }

    /* renamed from: a */
    public final igs mo12997a(String str, byte[] bArr) {
        bmxy.m108581a(this.f20936d);
        bmxy.m108581a(this.f20934b);
        bmxy.m108581a(this.f20935c);
        return new igs(this.f20933a, this.f20936d, this.f20934b, this.f20935c, str, bArr);
    }

    /* renamed from: a */
    public final void mo12998a(rkb rkb) {
        bmxy.m108581a(rkb);
        this.f20936d = rkb;
    }
}
