package p000;

/* renamed from: cbly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbly extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final cbly f177579g;

    /* renamed from: h */
    private static volatile bxxk f177580h;

    /* renamed from: a */
    public int f177581a;

    /* renamed from: b */
    public int f177582b;

    /* renamed from: c */
    public int f177583c;

    /* renamed from: d */
    public int f177584d;

    /* renamed from: e */
    public int f177585e;

    /* renamed from: f */
    public int f177586f;

    static {
        cbly cbly = new cbly();
        f177579g = cbly;
        GeneratedMessageLite.m124024a(cbly.class, cbly);
    }

    private cbly() {
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
            return GeneratedMessageLite.m124022a(f177579g, "\u0000\u0006\u0000\u0000\u0003\t\u0006\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\b\f\t\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new cbly();
        } else {
            if (i2 == 4) {
                return new bxvd(f177579g);
            }
            if (i2 == 5) {
                return f177579g;
            }
            bxxk bxxk = f177580h;
            if (bxxk == null) {
                synchronized (cbly.class) {
                    bxxk = f177580h;
                    if (bxxk == null) {
                        bxxk = new bxve(f177579g);
                        f177580h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
