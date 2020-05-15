package p000;

/* renamed from: cabt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cabt extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cabt f172477c;

    /* renamed from: d */
    private static volatile bxxk f172478d;

    /* renamed from: a */
    public int f172479a;

    /* renamed from: b */
    public cabq f172480b;

    static {
        cabt cabt = new cabt();
        f172477c = cabt;
        GeneratedMessageLite.m124024a(cabt.class, cabt);
    }

    private cabt() {
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
            return GeneratedMessageLite.m124022a(f172477c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cabt();
        } else {
            if (i2 == 4) {
                return new bxvd(f172477c);
            }
            if (i2 == 5) {
                return f172477c;
            }
            bxxk bxxk = f172478d;
            if (bxxk == null) {
                synchronized (cabt.class) {
                    bxxk = f172478d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172477c);
                        f172478d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
