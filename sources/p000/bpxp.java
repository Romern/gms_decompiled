package p000;

/* renamed from: bpxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpxp f139751d;

    /* renamed from: e */
    private static volatile bxxk f139752e;

    /* renamed from: a */
    public int f139753a;

    /* renamed from: b */
    public int f139754b;

    /* renamed from: c */
    public int f139755c;

    static {
        bpxp bpxp = new bpxp();
        f139751d = bpxp;
        GeneratedMessageLite.m124024a(bpxp.class, bpxp);
    }

    private bpxp() {
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
            return GeneratedMessageLite.m124022a(f139751d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bqad.f140120a, "c"});
        } else if (i2 == 3) {
            return new bpxp();
        } else {
            if (i2 == 4) {
                return new bxvd(f139751d);
            }
            if (i2 == 5) {
                return f139751d;
            }
            bxxk bxxk = f139752e;
            if (bxxk == null) {
                synchronized (bpxp.class) {
                    bxxk = f139752e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139751d);
                        f139752e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
