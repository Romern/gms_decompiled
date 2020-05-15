package p000;

/* renamed from: bwya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwya extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwya f161433d;

    /* renamed from: e */
    private static volatile bxxk f161434e;

    /* renamed from: a */
    public int f161435a;

    /* renamed from: b */
    public int f161436b;

    /* renamed from: c */
    public float f161437c;

    static {
        bwya bwya = new bwya();
        f161433d = bwya;
        GeneratedMessageLite.m124024a(bwya.class, bwya);
    }

    private bwya() {
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
            return GeneratedMessageLite.m124022a(f161433d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"a", "b", bwxz.f161432a, "c"});
        } else if (i2 == 3) {
            return new bwya();
        } else {
            if (i2 == 4) {
                return new bxvd(f161433d);
            }
            if (i2 == 5) {
                return f161433d;
            }
            bxxk bxxk = f161434e;
            if (bxxk == null) {
                synchronized (bwya.class) {
                    bxxk = f161434e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161433d);
                        f161434e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
