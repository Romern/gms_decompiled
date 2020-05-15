package p000;

/* renamed from: blwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blwd f127922a;

    /* renamed from: b */
    private static volatile bxxk f127923b;

    static {
        blwd blwd = new blwd();
        f127922a = blwd;
        GeneratedMessageLite.m124024a(blwd.class, blwd);
    }

    private blwd() {
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
            return GeneratedMessageLite.m124022a(f127922a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blwd();
        }
        if (i2 == 4) {
            return new bxvd(f127922a);
        }
        if (i2 == 5) {
            return f127922a;
        }
        bxxk bxxk = f127923b;
        if (bxxk == null) {
            synchronized (blwd.class) {
                bxxk = f127923b;
                if (bxxk == null) {
                    bxxk = new bxve(f127922a);
                    f127923b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
