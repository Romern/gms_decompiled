package p000;

/* renamed from: buov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buov extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buov f154592d;

    /* renamed from: e */
    private static volatile bxxk f154593e;

    /* renamed from: a */
    public buou f154594a;

    /* renamed from: b */
    public int f154595b;

    /* renamed from: c */
    public int f154596c;

    static {
        buov buov = new buov();
        f154592d = buov;
        GeneratedMessageLite.m124024a(buov.class, buov);
    }

    private buov() {
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
            return GeneratedMessageLite.m124022a(f154592d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buov();
        } else {
            if (i2 == 4) {
                return new bxvd(f154592d);
            }
            if (i2 == 5) {
                return f154592d;
            }
            bxxk bxxk = f154593e;
            if (bxxk == null) {
                synchronized (buov.class) {
                    bxxk = f154593e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154592d);
                        f154593e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
