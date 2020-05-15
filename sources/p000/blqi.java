package p000;

/* renamed from: blqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqi extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blqi f127341b;

    /* renamed from: d */
    private static volatile bxxk f127342d;

    /* renamed from: a */
    public bxwc f127343a = bxxn.f165040b;

    /* renamed from: c */
    private byte f127344c = 2;

    static {
        blqi blqi = new blqi();
        f127341b = blqi;
        GeneratedMessageLite.m124024a(blqi.class, blqi);
    }

    private blqi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127344c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127344c = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127341b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", blrj.class});
        } else if (i2 == 3) {
            return new blqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f127341b);
            }
            if (i2 == 5) {
                return f127341b;
            }
            bxxk bxxk = f127342d;
            if (bxxk == null) {
                synchronized (blqi.class) {
                    bxxk = f127342d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127341b);
                        f127342d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
