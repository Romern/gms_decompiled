package p000;

/* renamed from: bzxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzxw f171807d;

    /* renamed from: e */
    private static volatile bxxk f171808e;

    /* renamed from: a */
    public int f171809a;

    /* renamed from: b */
    public bzxu f171810b;

    /* renamed from: c */
    public bxwc f171811c = bxxn.f165040b;

    static {
        bzxw bzxw = new bzxw();
        f171807d = bzxw;
        GeneratedMessageLite.m124024a(bzxw.class, bzxw);
    }

    private bzxw() {
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
            return GeneratedMessageLite.m124022a(f171807d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bzxv.class});
        } else if (i2 == 3) {
            return new bzxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f171807d);
            }
            if (i2 == 5) {
                return f171807d;
            }
            bxxk bxxk = f171808e;
            if (bxxk == null) {
                synchronized (bzxw.class) {
                    bxxk = f171808e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171807d);
                        f171808e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
