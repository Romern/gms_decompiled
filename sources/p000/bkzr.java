package p000;

/* renamed from: bkzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bkzr f125681c;

    /* renamed from: d */
    private static volatile bxxk f125682d;

    /* renamed from: a */
    public int f125683a;

    /* renamed from: b */
    public long f125684b;

    static {
        bkzr bkzr = new bkzr();
        f125681c = bkzr;
        GeneratedMessageLite.m124024a(bkzr.class, bkzr);
    }

    private bkzr() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f125681c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bkzr();
        } else {
            if (i2 == 4) {
                return new bxvd(f125681c);
            }
            if (i2 == 5) {
                return f125681c;
            }
            bxxk bxxk = f125682d;
            if (bxxk == null) {
                synchronized (bkzr.class) {
                    bxxk = f125682d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125681c);
                        f125682d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
