package p000;

/* renamed from: boks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boks extends bxvk implements bxxd {

    /* renamed from: f */
    public static final boks f133448f;

    /* renamed from: g */
    private static volatile bxxk f133449g;

    /* renamed from: a */
    public int f133450a;

    /* renamed from: b */
    public bokk f133451b;

    /* renamed from: c */
    public bokr f133452c;

    /* renamed from: d */
    public bokm f133453d;

    /* renamed from: e */
    public bokp f133454e;

    static {
        boks boks = new boks();
        f133448f = boks;
        bxvk.m124024a(boks.class, boks);
    }

    private boks() {
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
            return bxvk.m124022a(f133448f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new boks();
        } else {
            if (i2 == 4) {
                return new bxvd(f133448f);
            }
            if (i2 == 5) {
                return f133448f;
            }
            bxxk bxxk = f133449g;
            if (bxxk == null) {
                synchronized (boks.class) {
                    bxxk = f133449g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133448f);
                        f133449g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
