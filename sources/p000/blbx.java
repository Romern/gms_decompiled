package p000;

/* renamed from: blbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blbx f125879b;

    /* renamed from: d */
    private static volatile bxxk f125880d;

    /* renamed from: a */
    public bxwc f125881a = bxxn.f165040b;

    /* renamed from: c */
    private byte f125882c = 2;

    static {
        blbx blbx = new blbx();
        f125879b = blbx;
        GeneratedMessageLite.m124024a(blbx.class, blbx);
    }

    private blbx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125882c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125882c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125879b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", blcb.class});
        } else if (i2 == 3) {
            return new blbx();
        } else {
            if (i2 == 4) {
                return new bxvd(f125879b);
            }
            if (i2 == 5) {
                return f125879b;
            }
            bxxk bxxk = f125880d;
            if (bxxk == null) {
                synchronized (blbx.class) {
                    bxxk = f125880d;
                    if (bxxk == null) {
                        bxxk = new bxve(f125879b);
                        f125880d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
