package p000;

/* renamed from: cadj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cadj extends bxvk implements bxxd {

    /* renamed from: i */
    public static final cadj f172680i;

    /* renamed from: j */
    private static volatile bxxk f172681j;

    /* renamed from: a */
    public int f172682a;

    /* renamed from: b */
    public long f172683b;

    /* renamed from: c */
    public long f172684c;

    /* renamed from: d */
    public cadz f172685d;

    /* renamed from: e */
    public int f172686e;

    /* renamed from: f */
    public bxwc f172687f = bxxn.f165040b;

    /* renamed from: g */
    public int f172688g;

    /* renamed from: h */
    public boolean f172689h;

    static {
        cadj cadj = new cadj();
        f172680i = cadj;
        bxvk.m124024a(cadj.class, cadj);
    }

    private cadj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f172680i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0004ဉ\u0003\u0005င\u0004\u0006\u001b\u0007ဌ\u0005\bဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", cadp.class, "g", cadl.m126502b(), "h"});
        } else if (i2 == 3) {
            return new cadj();
        } else {
            if (i2 == 4) {
                return new cadi();
            }
            if (i2 == 5) {
                return f172680i;
            }
            bxxk bxxk = f172681j;
            if (bxxk == null) {
                synchronized (cadj.class) {
                    bxxk = f172681j;
                    if (bxxk == null) {
                        bxxk = new bxve(f172680i);
                        f172681j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74611c() {
        if (!this.f172687f.mo73666a()) {
            this.f172687f = bxvk.m124021a(this.f172687f);
        }
    }
}
