package p000;

/* renamed from: blaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blaf extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blaf f125750a;

    /* renamed from: e */
    private static volatile bxxk f125751e;

    /* renamed from: b */
    private int f125752b;

    /* renamed from: c */
    private int f125753c;

    /* renamed from: d */
    private byte f125754d = 2;

    static {
        blaf blaf = new blaf();
        f125750a = blaf;
        GeneratedMessageLite.m124024a(blaf.class, blaf);
    }

    private blaf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125754d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125754d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125750a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blgb.f126418a});
        } else if (i2 == 3) {
            return new blaf();
        } else {
            if (i2 == 4) {
                return new bxvd(f125750a);
            }
            if (i2 == 5) {
                return f125750a;
            }
            bxxk bxxk = f125751e;
            if (bxxk == null) {
                synchronized (blaf.class) {
                    bxxk = f125751e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125750a);
                        f125751e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
