package p000;

/* renamed from: amks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amks extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final amks f75077g;

    /* renamed from: h */
    private static volatile bxxk f75078h;

    /* renamed from: a */
    public int f75079a;

    /* renamed from: b */
    public int f75080b;

    /* renamed from: c */
    public int f75081c;

    /* renamed from: d */
    public int f75082d;

    /* renamed from: e */
    public int f75083e;

    /* renamed from: f */
    public boolean f75084f;

    static {
        amks amks = new amks();
        f75077g = amks;
        GeneratedMessageLite.m124024a(amks.class, amks);
    }

    private amks() {
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
            return GeneratedMessageLite.m124022a(f75077g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new amks();
        } else {
            if (i2 == 4) {
                return new bxvd(f75077g);
            }
            if (i2 == 5) {
                return f75077g;
            }
            bxxk bxxk = f75078h;
            if (bxxk == null) {
                synchronized (amks.class) {
                    bxxk = f75078h;
                    if (bxxk == null) {
                        bxxk = new bxve(f75077g);
                        f75078h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
