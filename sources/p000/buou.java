package p000;

/* renamed from: buou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buou extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final buou f154588c;

    /* renamed from: d */
    private static volatile bxxk f154589d;

    /* renamed from: a */
    public buow f154590a;

    /* renamed from: b */
    public int f154591b;

    static {
        buou buou = new buou();
        f154588c = buou;
        GeneratedMessageLite.m124024a(buou.class, buou);
    }

    private buou() {
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
            return GeneratedMessageLite.m124022a(f154588c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new buou();
        } else {
            if (i2 == 4) {
                return new bxvd(f154588c);
            }
            if (i2 == 5) {
                return f154588c;
            }
            bxxk bxxk = f154589d;
            if (bxxk == null) {
                synchronized (buou.class) {
                    bxxk = f154589d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154588c);
                        f154589d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
