package p000;

/* renamed from: blcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blcr f125969c;

    /* renamed from: e */
    private static volatile bxxk f125970e;

    /* renamed from: a */
    public String f125971a = "";

    /* renamed from: b */
    public String f125972b = "";

    /* renamed from: d */
    private int f125973d;

    static {
        blcr blcr = new blcr();
        f125969c = blcr;
        bxvk.m124024a(blcr.class, blcr);
    }

    private blcr() {
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
            return bxvk.m124022a(f125969c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blcr();
        } else {
            if (i2 == 4) {
                return new bxvd(f125969c);
            }
            if (i2 == 5) {
                return f125969c;
            }
            bxxk bxxk = f125970e;
            if (bxxk == null) {
                synchronized (blcr.class) {
                    bxxk = f125970e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125969c);
                        f125970e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
