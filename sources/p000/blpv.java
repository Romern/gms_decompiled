package p000;

/* renamed from: blpv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blpv f127300a;

    /* renamed from: b */
    private static volatile bxxk f127301b;

    static {
        blpv blpv = new blpv();
        f127300a = blpv;
        GeneratedMessageLite.m124024a(blpv.class, blpv);
    }

    private blpv() {
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
            return GeneratedMessageLite.m124022a(f127300a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blpv();
        }
        if (i2 == 4) {
            return new bxvd(f127300a);
        }
        if (i2 == 5) {
            return f127300a;
        }
        bxxk bxxk = f127301b;
        if (bxxk == null) {
            synchronized (blpv.class) {
                bxxk = f127301b;
                if (bxxk == null) {
                    bxxk = new bxve(f127300a);
                    f127301b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
