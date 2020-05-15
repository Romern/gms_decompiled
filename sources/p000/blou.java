package p000;

/* renamed from: blou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blou extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final blou f127145c;

    /* renamed from: d */
    private static volatile bxxk f127146d;

    /* renamed from: a */
    public int f127147a;

    /* renamed from: b */
    public String f127148b = "";

    static {
        blou blou = new blou();
        f127145c = blou;
        GeneratedMessageLite.m124024a(blou.class, blou);
    }

    private blou() {
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
            return GeneratedMessageLite.m124022a(f127145c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blou();
        } else {
            if (i2 == 4) {
                return new bxvd(f127145c);
            }
            if (i2 == 5) {
                return f127145c;
            }
            bxxk bxxk = f127146d;
            if (bxxk == null) {
                synchronized (blou.class) {
                    bxxk = f127146d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127145c);
                        f127146d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
