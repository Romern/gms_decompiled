package p000;

/* renamed from: cbov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbov extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbov f177867c;

    /* renamed from: d */
    private static volatile bxxk f177868d;

    /* renamed from: a */
    public bxyk f177869a;

    /* renamed from: b */
    public int f177870b;

    static {
        cbov cbov = new cbov();
        f177867c = cbov;
        GeneratedMessageLite.m124024a(cbov.class, cbov);
    }

    private cbov() {
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
            return GeneratedMessageLite.m124022a(f177867c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbov();
        } else {
            if (i2 == 4) {
                return new bxvd(f177867c);
            }
            if (i2 == 5) {
                return f177867c;
            }
            bxxk bxxk = f177868d;
            if (bxxk == null) {
                synchronized (cbov.class) {
                    bxxk = f177868d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177867c);
                        f177868d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
