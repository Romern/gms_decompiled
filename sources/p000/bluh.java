package p000;

/* renamed from: bluh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bluh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bluh f127804d;

    /* renamed from: f */
    private static volatile bxxk f127805f;

    /* renamed from: a */
    public int f127806a;

    /* renamed from: b */
    public int f127807b;

    /* renamed from: c */
    public int f127808c;

    /* renamed from: e */
    private int f127809e;

    static {
        bluh bluh = new bluh();
        f127804d = bluh;
        GeneratedMessageLite.m124024a(bluh.class, bluh);
    }

    private bluh() {
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
            return GeneratedMessageLite.m124022a(f127804d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bluh();
        } else {
            if (i2 == 4) {
                return new bxvd(f127804d);
            }
            if (i2 == 5) {
                return f127804d;
            }
            bxxk bxxk = f127805f;
            if (bxxk == null) {
                synchronized (bluh.class) {
                    bxxk = f127805f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127804d);
                        f127805f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
