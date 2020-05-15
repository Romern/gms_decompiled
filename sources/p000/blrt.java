package p000;

/* renamed from: blrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blrt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final blrt f127524b;

    /* renamed from: c */
    private static volatile bxxk f127525c;

    /* renamed from: a */
    public bxvt f127526a = bxvm.f164965b;

    static {
        blrt blrt = new blrt();
        f127524b = blrt;
        GeneratedMessageLite.m124024a(blrt.class, blrt);
    }

    private blrt() {
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
            return GeneratedMessageLite.m124022a(f127524b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", blrs.m107508b()});
        } else if (i2 == 3) {
            return new blrt();
        } else {
            if (i2 == 4) {
                return new blrq();
            }
            if (i2 == 5) {
                return f127524b;
            }
            bxxk bxxk = f127525c;
            if (bxxk == null) {
                synchronized (blrt.class) {
                    bxxk = f127525c;
                    if (bxxk == null) {
                        bxxk = new bxve(f127524b);
                        f127525c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
