package p000;

/* renamed from: bxpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxpx f164333e;

    /* renamed from: f */
    private static volatile bxxk f164334f;

    /* renamed from: a */
    public int f164335a;

    /* renamed from: b */
    public int f164336b;

    /* renamed from: c */
    public int f164337c;

    /* renamed from: d */
    public int f164338d;

    static {
        bxpx bxpx = new bxpx();
        f164333e = bxpx;
        GeneratedMessageLite.m124024a(bxpx.class, bxpx);
    }

    private bxpx() {
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
            return GeneratedMessageLite.m124022a(f164333e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0005င\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxpx();
        } else {
            if (i2 == 4) {
                return new bxvd(f164333e);
            }
            if (i2 == 5) {
                return f164333e;
            }
            bxxk bxxk = f164334f;
            if (bxxk == null) {
                synchronized (bxpx.class) {
                    bxxk = f164334f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164333e);
                        f164334f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
