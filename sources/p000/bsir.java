package p000;

/* renamed from: bsir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsir extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsir f144748a;

    /* renamed from: b */
    private static volatile bxxk f144749b;

    static {
        bsir bsir = new bsir();
        f144748a = bsir;
        GeneratedMessageLite.m124024a(bsir.class, bsir);
    }

    private bsir() {
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
            return GeneratedMessageLite.m124022a(f144748a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsir();
        }
        if (i2 == 4) {
            return new bxvd(f144748a);
        }
        if (i2 == 5) {
            return f144748a;
        }
        bxxk bxxk = f144749b;
        if (bxxk == null) {
            synchronized (bsir.class) {
                bxxk = f144749b;
                if (bxxk == null) {
                    bxxk = new bxve(f144748a);
                    f144749b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
