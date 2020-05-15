package p000;

/* renamed from: cbmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbmz f177701d;

    /* renamed from: e */
    private static volatile bxxk f177702e;

    /* renamed from: a */
    public cbma f177703a;

    /* renamed from: b */
    public cbmx f177704b;

    /* renamed from: c */
    public bxwc f177705c = bxxn.f165040b;

    static {
        cbmz cbmz = new cbmz();
        f177701d = cbmz;
        GeneratedMessageLite.m124024a(cbmz.class, cbmz);
    }

    private cbmz() {
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
            return GeneratedMessageLite.m124022a(f177701d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\t\u0004\u001b", new Object[]{"a", "b", "c", cbma.class});
        } else if (i2 == 3) {
            return new cbmz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177701d);
            }
            if (i2 == 5) {
                return f177701d;
            }
            bxxk bxxk = f177702e;
            if (bxxk == null) {
                synchronized (cbmz.class) {
                    bxxk = f177702e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177701d);
                        f177702e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
