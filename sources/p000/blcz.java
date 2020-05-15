package p000;

/* renamed from: blcz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blcz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blcz f126007g;

    /* renamed from: h */
    private static volatile bxxk f126008h;

    /* renamed from: a */
    public int f126009a;

    /* renamed from: b */
    public String f126010b = "";

    /* renamed from: c */
    public bldb f126011c;

    /* renamed from: d */
    public String f126012d = "";

    /* renamed from: e */
    public boolean f126013e;

    /* renamed from: f */
    public int f126014f;

    static {
        blcz blcz = new blcz();
        f126007g = blcz;
        bxvk.m124024a(blcz.class, blcz);
    }

    private blcz() {
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
            return bxvk.m124022a(f126007g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", blcg.f125922a});
        } else if (i2 == 3) {
            return new blcz();
        } else {
            if (i2 == 4) {
                return new bxvd(f126007g);
            }
            if (i2 == 5) {
                return f126007g;
            }
            bxxk bxxk = f126008h;
            if (bxxk == null) {
                synchronized (blcz.class) {
                    bxxk = f126008h;
                    if (bxxk == null) {
                        bxxk = new bxve(f126007g);
                        f126008h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
