package p000;

/* renamed from: blcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blcm f125941c;

    /* renamed from: d */
    private static volatile bxxk f125942d;

    /* renamed from: a */
    public int f125943a;

    /* renamed from: b */
    public blcp f125944b;

    static {
        blcm blcm = new blcm();
        f125941c = blcm;
        GeneratedMessageLite.m124024a(blcm.class, blcm);
    }

    private blcm() {
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
            return GeneratedMessageLite.m124022a(f125941c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blcm();
        } else {
            if (i2 == 4) {
                return new bxvd(f125941c);
            }
            if (i2 == 5) {
                return f125941c;
            }
            bxxk bxxk = f125942d;
            if (bxxk == null) {
                synchronized (blcm.class) {
                    bxxk = f125942d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125941c);
                        f125942d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
