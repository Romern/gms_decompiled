package p000;

/* renamed from: cbnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbnr f177750d;

    /* renamed from: e */
    private static volatile bxxk f177751e;

    /* renamed from: a */
    public int f177752a;

    /* renamed from: b */
    public bxwc f177753b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f177754c = bxxn.f165040b;

    static {
        cbnr cbnr = new cbnr();
        f177750d = cbnr;
        GeneratedMessageLite.m124024a(cbnr.class, cbnr);
    }

    private cbnr() {
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
            return GeneratedMessageLite.m124022a(f177750d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"a", "b", cbmj.class, "c", cbmj.class});
        } else if (i2 == 3) {
            return new cbnr();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177750d;
            }
            bxxk bxxk = f177751e;
            if (bxxk == null) {
                synchronized (cbnr.class) {
                    bxxk = f177751e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177750d);
                        f177751e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
