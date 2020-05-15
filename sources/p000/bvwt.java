package p000;

/* renamed from: bvwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvwt f158012e;

    /* renamed from: f */
    private static volatile bxxk f158013f;

    /* renamed from: a */
    public int f158014a;

    /* renamed from: b */
    public bxwc f158015b = bxxn.f165040b;

    /* renamed from: c */
    public int f158016c;

    /* renamed from: d */
    public boolean f158017d;

    static {
        bvwt bvwt = new bvwt();
        f158012e = bvwt;
        bxvk.m124024a(bvwt.class, bvwt);
    }

    private bvwt() {
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
            return bxvk.m124022a(f158012e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", bvws.class, "c", bvve.f157790a, "d"});
        } else if (i2 == 3) {
            return new bvwt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f158012e;
            }
            bxxk bxxk = f158013f;
            if (bxxk == null) {
                synchronized (bvwt.class) {
                    bxxk = f158013f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158012e);
                        f158013f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73395a() {
        if (!this.f158015b.mo73666a()) {
            this.f158015b = bxvk.m124021a(this.f158015b);
        }
    }
}
