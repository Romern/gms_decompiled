package p000;

/* renamed from: byyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final byyf f168912c;

    /* renamed from: d */
    private static volatile bxxk f168913d;

    /* renamed from: a */
    public int f168914a;

    /* renamed from: b */
    public boolean f168915b = true;

    static {
        byyf byyf = new byyf();
        f168912c = byyf;
        GeneratedMessageLite.m124024a(byyf.class, byyf);
    }

    private byyf() {
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
            return GeneratedMessageLite.m124022a(f168912c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byyf();
        } else {
            if (i2 == 4) {
                return new byye();
            }
            if (i2 == 5) {
                return f168912c;
            }
            bxxk bxxk = f168913d;
            if (bxxk == null) {
                synchronized (byyf.class) {
                    bxxk = f168913d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168912c);
                        f168913d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
