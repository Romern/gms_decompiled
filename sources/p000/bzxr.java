package p000;

/* renamed from: bzxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzxr f171793c;

    /* renamed from: d */
    private static volatile bxxk f171794d;

    /* renamed from: a */
    public int f171795a;

    /* renamed from: b */
    public int f171796b;

    static {
        bzxr bzxr = new bzxr();
        f171793c = bzxr;
        GeneratedMessageLite.m124024a(bzxr.class, bzxr);
    }

    private bzxr() {
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
            return GeneratedMessageLite.m124022a(f171793c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzxp.f171792a});
        } else if (i2 == 3) {
            return new bzxr();
        } else {
            if (i2 == 4) {
                return new bxvd(f171793c);
            }
            if (i2 == 5) {
                return f171793c;
            }
            bxxk bxxk = f171794d;
            if (bxxk == null) {
                synchronized (bzxr.class) {
                    bxxk = f171794d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171793c);
                        f171794d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
