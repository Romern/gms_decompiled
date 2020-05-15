package p000;

/* renamed from: blpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blpk f127238b;

    /* renamed from: d */
    private static volatile bxxk f127239d;

    /* renamed from: a */
    public boolean f127240a;

    /* renamed from: c */
    private int f127241c;

    static {
        blpk blpk = new blpk();
        f127238b = blpk;
        GeneratedMessageLite.m124024a(blpk.class, blpk);
    }

    private blpk() {
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
            return GeneratedMessageLite.m124022a(f127238b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blpk();
        } else {
            if (i2 == 4) {
                return new bxvd(f127238b);
            }
            if (i2 == 5) {
                return f127238b;
            }
            bxxk bxxk = f127239d;
            if (bxxk == null) {
                synchronized (blpk.class) {
                    bxxk = f127239d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127238b);
                        f127239d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
