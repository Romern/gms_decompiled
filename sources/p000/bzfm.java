package p000;

/* renamed from: bzfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzfm f169831c;

    /* renamed from: e */
    private static volatile bxxk f169832e;

    /* renamed from: a */
    public bzfo f169833a;

    /* renamed from: b */
    public bxwc f169834b = bxxn.f165040b;

    /* renamed from: d */
    private int f169835d;

    static {
        bzfm bzfm = new bzfm();
        f169831c = bzfm;
        GeneratedMessageLite.m124024a(bzfm.class, bzfm);
    }

    private bzfm() {
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
            return GeneratedMessageLite.m124022a(f169831c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bzfn.class});
        } else if (i2 == 3) {
            return new bzfm();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f169831c;
            }
            bxxk bxxk = f169832e;
            if (bxxk == null) {
                synchronized (bzfm.class) {
                    bxxk = f169832e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169831c);
                        f169832e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
