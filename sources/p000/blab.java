package p000;

/* renamed from: blab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blab extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blab f125730a;

    /* renamed from: e */
    private static volatile bxxk f125731e;

    /* renamed from: b */
    private int f125732b;

    /* renamed from: c */
    private int f125733c;

    /* renamed from: d */
    private byte f125734d = 2;

    static {
        blab blab = new blab();
        f125730a = blab;
        GeneratedMessageLite.m124024a(blab.class, blab);
    }

    private blab() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125734d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125734d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125730a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", "c", blfx.f126414a});
        } else if (i2 == 3) {
            return new blab();
        } else {
            if (i2 == 4) {
                return new bxvd(f125730a);
            }
            if (i2 == 5) {
                return f125730a;
            }
            bxxk bxxk = f125731e;
            if (bxxk == null) {
                synchronized (blab.class) {
                    bxxk = f125731e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125730a);
                        f125731e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
