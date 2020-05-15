package p000;

/* renamed from: blqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blqf f127324c;

    /* renamed from: e */
    private static volatile bxxk f127325e;

    /* renamed from: a */
    public int f127326a;

    /* renamed from: b */
    public bxwc f127327b = bxxn.f165040b;

    /* renamed from: d */
    private int f127328d;

    static {
        blqf blqf = new blqf();
        f127324c = blqf;
        GeneratedMessageLite.m124024a(blqf.class, blqf);
    }

    private blqf() {
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
            return GeneratedMessageLite.m124022a(f127324c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", blqd.f127323a, "b", blox.class});
        } else if (i2 == 3) {
            return new blqf();
        } else {
            if (i2 == 4) {
                return new bxvd(f127324c);
            }
            if (i2 == 5) {
                return f127324c;
            }
            bxxk bxxk = f127325e;
            if (bxxk == null) {
                synchronized (blqf.class) {
                    bxxk = f127325e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127324c);
                        f127325e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
