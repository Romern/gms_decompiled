package p000;

/* renamed from: bpyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyu extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bpyu f139934g;

    /* renamed from: h */
    private static volatile bxxk f139935h;

    /* renamed from: a */
    public int f139936a;

    /* renamed from: b */
    public int f139937b;

    /* renamed from: c */
    public int f139938c;

    /* renamed from: d */
    public int f139939d;

    /* renamed from: e */
    public int f139940e;

    /* renamed from: f */
    public int f139941f;

    static {
        bpyu bpyu = new bpyu();
        f139934g = bpyu;
        GeneratedMessageLite.m124024a(bpyu.class, bpyu);
    }

    private bpyu() {
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
            return GeneratedMessageLite.m124022a(f139934g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f139934g);
            }
            if (i2 == 5) {
                return f139934g;
            }
            bxxk bxxk = f139935h;
            if (bxxk == null) {
                synchronized (bpyu.class) {
                    bxxk = f139935h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139934g);
                        f139935h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
