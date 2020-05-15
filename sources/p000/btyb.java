package p000;

/* renamed from: btyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyb extends bxvk implements bxxd {

    /* renamed from: g */
    public static final btyb f152871g;

    /* renamed from: h */
    private static volatile bxxk f152872h;

    /* renamed from: a */
    public int f152873a;

    /* renamed from: b */
    public int f152874b;

    /* renamed from: c */
    public long f152875c;

    /* renamed from: d */
    public long f152876d;

    /* renamed from: e */
    public int f152877e;

    /* renamed from: f */
    public btyd f152878f;

    static {
        btyb btyb = new btyb();
        f152871g = btyb;
        bxvk.m124024a(btyb.class, btyb);
    }

    private btyb() {
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
            return bxvk.m124022a(f152871g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", btxz.f152870a, "c", "d", "e", btxx.f152869a, "f"});
        } else if (i2 == 3) {
            return new btyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f152871g);
            }
            if (i2 == 5) {
                return f152871g;
            }
            bxxk bxxk = f152872h;
            if (bxxk == null) {
                synchronized (btyb.class) {
                    bxxk = f152872h;
                    if (bxxk == null) {
                        bxxk = new bxve(f152871g);
                        f152872h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
