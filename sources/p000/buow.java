package p000;

/* renamed from: buow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buow extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buow f154597c;

    /* renamed from: d */
    private static volatile bxxk f154598d;

    /* renamed from: a */
    public long f154599a;

    /* renamed from: b */
    public int f154600b;

    static {
        buow buow = new buow();
        f154597c = buow;
        GeneratedMessageLite.m124024a(buow.class, buow);
    }

    private buow() {
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
            return GeneratedMessageLite.m124022a(f154597c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buow();
        } else {
            if (i2 == 4) {
                return new bxvd(f154597c);
            }
            if (i2 == 5) {
                return f154597c;
            }
            bxxk bxxk = f154598d;
            if (bxxk == null) {
                synchronized (buow.class) {
                    bxxk = f154598d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154597c);
                        f154598d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
