package p000;

/* renamed from: bipm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipm f121181c;

    /* renamed from: e */
    private static volatile bxxk f121182e;

    /* renamed from: a */
    public int f121183a;

    /* renamed from: b */
    public int f121184b;

    /* renamed from: d */
    private byte f121185d = 2;

    static {
        bipm bipm = new bipm();
        f121181c = bipm;
        GeneratedMessageLite.m124024a(bipm.class, bipm);
    }

    private bipm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121185d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121185d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121181c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bipm();
        } else {
            if (i2 == 4) {
                return new bxvd(f121181c);
            }
            if (i2 == 5) {
                return f121181c;
            }
            bxxk bxxk = f121182e;
            if (bxxk == null) {
                synchronized (bipm.class) {
                    bxxk = f121182e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121181c);
                        f121182e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
