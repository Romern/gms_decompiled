package p000;

/* renamed from: lav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lav extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final lav f25623e;

    /* renamed from: f */
    private static volatile bxxk f25624f;

    /* renamed from: a */
    public lbf f25625a;

    /* renamed from: b */
    public kzz f25626b;

    /* renamed from: c */
    public int f25627c;

    /* renamed from: d */
    public boolean f25628d;

    static {
        lav lav = new lav();
        f25623e = lav;
        GeneratedMessageLite.m124024a(lav.class, lav);
    }

    private lav() {
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
            return GeneratedMessageLite.m124022a(f25623e, "\u0000\u0004\u0000\u0000\u0003\u0006\u0004\u0000\u0000\u0000\u0003\t\u0004\t\u0005\f\u0006\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new lav();
        } else {
            if (i2 == 4) {
                return new bxvd(f25623e);
            }
            if (i2 == 5) {
                return f25623e;
            }
            bxxk bxxk = f25624f;
            if (bxxk == null) {
                synchronized (lav.class) {
                    bxxk = f25624f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25623e);
                        f25624f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
