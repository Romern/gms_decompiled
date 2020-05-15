package p000;

/* renamed from: blri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blri extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blri f127454a;

    /* renamed from: b */
    private static volatile bxxk f127455b;

    static {
        blri blri = new blri();
        f127454a = blri;
        GeneratedMessageLite.m124024a(blri.class, blri);
    }

    private blri() {
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
            return GeneratedMessageLite.m124022a(f127454a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new blri();
        }
        if (i2 == 4) {
            return new bxvd(f127454a);
        }
        if (i2 == 5) {
            return f127454a;
        }
        bxxk bxxk = f127455b;
        if (bxxk == null) {
            synchronized (blri.class) {
                bxxk = f127455b;
                if (bxxk == null) {
                    bxxk = new bxve(f127454a);
                    f127455b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
