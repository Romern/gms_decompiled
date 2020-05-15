package p000;

/* renamed from: bpta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpta extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpta f139073e;

    /* renamed from: f */
    private static volatile bxxk f139074f;

    /* renamed from: a */
    public int f139075a;

    /* renamed from: b */
    public int f139076b = 0;

    /* renamed from: c */
    public Object f139077c;

    /* renamed from: d */
    public long f139078d;

    static {
        bpta bpta = new bpta();
        f139073e = bpta;
        GeneratedMessageLite.m124024a(bpta.class, bpta);
    }

    private bpta() {
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
            return GeneratedMessageLite.m124022a(f139073e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002်\u0000\u0003ဵ\u0000\u0004း\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new bpta();
        } else {
            if (i2 == 4) {
                return new bxvd(f139073e);
            }
            if (i2 == 5) {
                return f139073e;
            }
            bxxk bxxk = f139074f;
            if (bxxk == null) {
                synchronized (bpta.class) {
                    bxxk = f139074f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139073e);
                        f139074f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
