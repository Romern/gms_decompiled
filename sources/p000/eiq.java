package p000;

/* renamed from: eiq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eiq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final eiq f15085b;

    /* renamed from: c */
    private static volatile bxxk f15086c;

    /* renamed from: a */
    public long f15087a;

    static {
        eiq eiq = new eiq();
        f15085b = eiq;
        GeneratedMessageLite.m124024a(eiq.class, eiq);
    }

    private eiq() {
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
            return GeneratedMessageLite.m124022a(f15085b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
        } else if (i2 == 3) {
            return new eiq();
        } else {
            if (i2 == 4) {
                return new bxvd(f15085b);
            }
            if (i2 == 5) {
                return f15085b;
            }
            bxxk bxxk = f15086c;
            if (bxxk == null) {
                synchronized (eiq.class) {
                    bxxk = f15086c;
                    if (bxxk == null) {
                        bxxk = new bxve(f15085b);
                        f15086c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
