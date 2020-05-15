package p000;

/* renamed from: blxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxq extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blxq f128116d;

    /* renamed from: e */
    private static volatile bxxk f128117e;

    /* renamed from: a */
    public int f128118a;

    /* renamed from: b */
    public bmaj f128119b;

    /* renamed from: c */
    public blxp f128120c;

    static {
        blxq blxq = new blxq();
        f128116d = blxq;
        GeneratedMessageLite.m124024a(blxq.class, blxq);
    }

    private blxq() {
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
            return GeneratedMessageLite.m124022a(f128116d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blxq();
        } else {
            if (i2 == 4) {
                return new bxvd(f128116d);
            }
            if (i2 == 5) {
                return f128116d;
            }
            bxxk bxxk = f128117e;
            if (bxxk == null) {
                synchronized (blxq.class) {
                    bxxk = f128117e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128116d);
                        f128117e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
