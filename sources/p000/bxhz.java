package p000;

/* renamed from: bxhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhz extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxhz f163490d;

    /* renamed from: e */
    private static volatile bxxk f163491e;

    /* renamed from: a */
    public int f163492a;

    /* renamed from: b */
    public int f163493b;

    /* renamed from: c */
    public bxih f163494c;

    static {
        bxhz bxhz = new bxhz();
        f163490d = bxhz;
        GeneratedMessageLite.m124024a(bxhz.class, bxhz);
    }

    private bxhz() {
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
            return GeneratedMessageLite.m124022a(f163490d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bxia.f163495a, "c"});
        } else if (i2 == 3) {
            return new bxhz();
        } else {
            if (i2 == 4) {
                return new bxvd(f163490d);
            }
            if (i2 == 5) {
                return f163490d;
            }
            bxxk bxxk = f163491e;
            if (bxxk == null) {
                synchronized (bxhz.class) {
                    bxxk = f163491e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163490d);
                        f163491e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
