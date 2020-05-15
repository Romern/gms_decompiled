package p000;

/* renamed from: bopa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopa extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bopa f134085e;

    /* renamed from: f */
    private static volatile bxxk f134086f;

    /* renamed from: a */
    public String f134087a = "";

    /* renamed from: b */
    public String f134088b = "";

    /* renamed from: c */
    public String f134089c = "";

    /* renamed from: d */
    public int f134090d;

    static {
        bopa bopa = new bopa();
        f134085e = bopa;
        GeneratedMessageLite.m124024a(bopa.class, bopa);
    }

    private bopa() {
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
            return GeneratedMessageLite.m124022a(f134085e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bopa();
        } else {
            if (i2 == 4) {
                return new bxvd(f134085e);
            }
            if (i2 == 5) {
                return f134085e;
            }
            bxxk bxxk = f134086f;
            if (bxxk == null) {
                synchronized (bopa.class) {
                    bxxk = f134086f;
                    if (bxxk == null) {
                        bxxk = new bxve(f134085e);
                        f134086f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
