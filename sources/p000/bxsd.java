package p000;

/* renamed from: bxsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bxsd f164664d;

    /* renamed from: e */
    private static volatile bxxk f164665e;

    /* renamed from: a */
    public int f164666a;

    /* renamed from: b */
    public int f164667b;

    /* renamed from: c */
    public int f164668c;

    static {
        bxsd bxsd = new bxsd();
        f164664d = bxsd;
        GeneratedMessageLite.m124024a(bxsd.class, bxsd);
    }

    private bxsd() {
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
            return GeneratedMessageLite.m124022a(f164664d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bxsm.f164713a});
        } else if (i2 == 3) {
            return new bxsd();
        } else {
            if (i2 == 4) {
                return new bxvd(f164664d);
            }
            if (i2 == 5) {
                return f164664d;
            }
            bxxk bxxk = f164665e;
            if (bxxk == null) {
                synchronized (bxsd.class) {
                    bxxk = f164665e;
                    if (bxxk == null) {
                        bxxk = new bxve(f164664d);
                        f164665e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
