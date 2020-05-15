package p000;

/* renamed from: bmne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmne extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmne f130089f;

    /* renamed from: h */
    private static volatile bxxk f130090h;

    /* renamed from: a */
    public int f130091a = 0;

    /* renamed from: b */
    public Object f130092b;

    /* renamed from: c */
    public long f130093c;

    /* renamed from: d */
    public int f130094d;

    /* renamed from: e */
    public boolean f130095e;

    /* renamed from: g */
    private int f130096g;

    static {
        bmne bmne = new bmne();
        f130089f = bmne;
        bxvk.m124024a(bmne.class, bmne);
    }

    private bmne() {
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
            return bxvk.m124022a(f130089f, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ြ\u0000\u0003ဌ\u0001\u0004ဇ\u0007\u0005ြ\u0000\u0006ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"b", "a", "g", "c", bmnc.class, "d", bmmz.f130074a, "e", bmnd.class, bmnb.class, bmmx.class, bmmy.class});
        } else if (i2 == 3) {
            return new bmne();
        } else {
            if (i2 == 4) {
                return new bxvd(f130089f);
            }
            if (i2 == 5) {
                return f130089f;
            }
            bxxk bxxk = f130090h;
            if (bxxk == null) {
                synchronized (bmne.class) {
                    bxxk = f130090h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130089f);
                        f130090h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
