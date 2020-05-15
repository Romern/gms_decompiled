package p000;

/* renamed from: caet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caet extends bxvk implements bxxd {

    /* renamed from: g */
    public static final caet f172852g;

    /* renamed from: h */
    private static volatile bxxk f172853h;

    /* renamed from: a */
    public int f172854a;

    /* renamed from: b */
    public cafh f172855b;

    /* renamed from: c */
    public cafe f172856c;

    /* renamed from: d */
    public cafg f172857d;

    /* renamed from: e */
    public int f172858e;

    /* renamed from: f */
    public int f172859f;

    static {
        caet caet = new caet();
        f172852g = caet;
        bxvk.m124024a(caet.class, caet);
    }

    private caet() {
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
            return bxvk.m124022a(f172852g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", cafd.f172888a, "f", caez.f172877a});
        } else if (i2 == 3) {
            return new caet();
        } else {
            if (i2 == 4) {
                return new bxvd(f172852g);
            }
            if (i2 == 5) {
                return f172852g;
            }
            bxxk bxxk = f172853h;
            if (bxxk == null) {
                synchronized (caet.class) {
                    bxxk = f172853h;
                    if (bxxk == null) {
                        bxxk = new bxve(f172852g);
                        f172853h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
