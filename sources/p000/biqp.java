package p000;

/* renamed from: biqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biqp f121312c;

    /* renamed from: e */
    private static volatile bxxk f121313e;

    /* renamed from: a */
    public int f121314a;

    /* renamed from: b */
    public int f121315b;

    /* renamed from: d */
    private byte f121316d = 2;

    static {
        biqp biqp = new biqp();
        f121312c = biqp;
        GeneratedMessageLite.m124024a(biqp.class, biqp);
    }

    private biqp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121316d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121316d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121312c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new biqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f121312c);
            }
            if (i2 == 5) {
                return f121312c;
            }
            bxxk bxxk = f121313e;
            if (bxxk == null) {
                synchronized (biqp.class) {
                    bxxk = f121313e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121312c);
                        f121313e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
