package p000;

/* renamed from: bumt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bumt f154272b;

    /* renamed from: c */
    private static volatile bxxk f154273c;

    /* renamed from: a */
    public bxwc f154274a = bxxn.f165040b;

    static {
        bumt bumt = new bumt();
        f154272b = bumt;
        GeneratedMessageLite.m124024a(bumt.class, bumt);
    }

    private bumt() {
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
            return GeneratedMessageLite.m124022a(f154272b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bumz.class});
        } else if (i2 == 3) {
            return new bumt();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f154272b;
            }
            bxxk bxxk = f154273c;
            if (bxxk == null) {
                synchronized (bumt.class) {
                    bxxk = f154273c;
                    if (bxxk == null) {
                        bxxk = new bxve(f154272b);
                        f154273c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
