package p000;

/* renamed from: blqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blqw f127418a;

    /* renamed from: b */
    private static volatile bxxk f127419b;

    static {
        blqw blqw = new blqw();
        f127418a = blqw;
        GeneratedMessageLite.m124024a(blqw.class, blqw);
    }

    private blqw() {
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
            return GeneratedMessageLite.m124022a(f127418a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blqw();
        }
        if (i2 == 4) {
            return new bxvd(f127418a);
        }
        if (i2 == 5) {
            return f127418a;
        }
        bxxk bxxk = f127419b;
        if (bxxk == null) {
            synchronized (blqw.class) {
                bxxk = f127419b;
                if (bxxk == null) {
                    bxxk = new bxve(f127418a);
                    f127419b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
