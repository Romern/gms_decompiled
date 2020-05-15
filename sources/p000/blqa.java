package p000;

/* renamed from: blqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqa extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blqa f127310c;

    /* renamed from: e */
    private static volatile bxxk f127311e;

    /* renamed from: a */
    public int f127312a;

    /* renamed from: b */
    public blpr f127313b;

    /* renamed from: d */
    private byte f127314d = 2;

    static {
        blqa blqa = new blqa();
        f127310c = blqa;
        bxvk.m124024a(blqa.class, blqa);
    }

    private blqa() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127314d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127314d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f127310c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blqa();
        } else {
            if (i2 == 4) {
                return new bxvd(f127310c);
            }
            if (i2 == 5) {
                return f127310c;
            }
            bxxk bxxk = f127311e;
            if (bxxk == null) {
                synchronized (blqa.class) {
                    bxxk = f127311e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127310c);
                        f127311e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
