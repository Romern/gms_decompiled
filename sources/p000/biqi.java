package p000;

/* renamed from: biqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final biqi f121282e;

    /* renamed from: f */
    private static volatile bxxk f121283f;

    /* renamed from: a */
    public int f121284a;

    /* renamed from: b */
    public int f121285b;

    /* renamed from: c */
    public int f121286c;

    /* renamed from: d */
    public boolean f121287d;

    static {
        biqi biqi = new biqi();
        f121282e = biqi;
        GeneratedMessageLite.m124024a(biqi.class, biqi);
    }

    private biqi() {
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
            return GeneratedMessageLite.m124022a(f121282e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new biqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f121282e);
            }
            if (i2 == 5) {
                return f121282e;
            }
            bxxk bxxk = f121283f;
            if (bxxk == null) {
                synchronized (biqi.class) {
                    bxxk = f121283f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121282e);
                        f121283f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
