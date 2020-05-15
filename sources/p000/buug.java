package p000;

/* renamed from: buug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buug extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buug f154941c;

    /* renamed from: d */
    private static volatile bxxk f154942d;

    /* renamed from: a */
    public int f154943a;

    /* renamed from: b */
    public boolean f154944b;

    static {
        buug buug = new buug();
        f154941c = buug;
        GeneratedMessageLite.m124024a(buug.class, buug);
    }

    private buug() {
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
            return GeneratedMessageLite.m124022a(f154941c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buug();
        } else {
            if (i2 == 4) {
                return new bxvd(f154941c);
            }
            if (i2 == 5) {
                return f154941c;
            }
            bxxk bxxk = f154942d;
            if (bxxk == null) {
                synchronized (buug.class) {
                    bxxk = f154942d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154941c);
                        f154942d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
