package p000;

/* renamed from: blss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blss extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blss f127620f;

    /* renamed from: h */
    private static volatile bxxk f127621h;

    /* renamed from: a */
    public long f127622a;

    /* renamed from: b */
    public long f127623b;

    /* renamed from: c */
    public long f127624c;

    /* renamed from: d */
    public bxwc f127625d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f127626e = bxxn.f165040b;

    /* renamed from: g */
    private int f127627g;

    static {
        blss blss = new blss();
        f127620f = blss;
        bxvk.m124024a(blss.class, blss);
    }

    private blss() {
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
            return bxvk.m124022a(f127620f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004\u001c\u0005\u001b", new Object[]{"g", "a", "b", "c", "d", "e", blsr.class});
        } else if (i2 == 3) {
            return new blss();
        } else {
            if (i2 == 4) {
                return new bxvd(f127620f);
            }
            if (i2 == 5) {
                return f127620f;
            }
            bxxk bxxk = f127621h;
            if (bxxk == null) {
                synchronized (blss.class) {
                    bxxk = f127621h;
                    if (bxxk == null) {
                        bxxk = new bxve(f127620f);
                        f127621h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
