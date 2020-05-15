package p000;

/* renamed from: biqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final biqr f121325c;

    /* renamed from: e */
    private static volatile bxxk f121326e;

    /* renamed from: a */
    public int f121327a;

    /* renamed from: b */
    public int f121328b;

    /* renamed from: d */
    private byte f121329d = 2;

    static {
        biqr biqr = new biqr();
        f121325c = biqr;
        GeneratedMessageLite.m124024a(biqr.class, biqr);
    }

    private biqr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121329d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121329d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121325c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new biqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f121325c);
            }
            if (i2 == 5) {
                return f121325c;
            }
            bxxk bxxk = f121326e;
            if (bxxk == null) {
                synchronized (biqr.class) {
                    bxxk = f121326e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121325c);
                        f121326e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
