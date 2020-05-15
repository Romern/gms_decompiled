package p000;

/* renamed from: apyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apyu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final apyu f85187f;

    /* renamed from: h */
    private static volatile bxxk f85188h;

    /* renamed from: a */
    public String f85189a = "";

    /* renamed from: b */
    public bxwc f85190b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f85191c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f85192d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f85193e = bxxn.f165040b;

    /* renamed from: g */
    private int f85194g;

    static {
        apyu apyu = new apyu();
        f85187f = apyu;
        bxvk.m124024a(apyu.class, apyu);
    }

    private apyu() {
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
            return bxvk.m124022a(f85187f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001b", new Object[]{"g", "a", "b", "c", "d", "e", apyt.class});
        } else if (i2 == 3) {
            return new apyu();
        } else {
            if (i2 == 4) {
                return new bxvd(f85187f);
            }
            if (i2 == 5) {
                return f85187f;
            }
            bxxk bxxk = f85188h;
            if (bxxk == null) {
                synchronized (apyu.class) {
                    bxxk = f85188h;
                    if (bxxk == null) {
                        bxxk = new bxve(f85187f);
                        f85188h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
