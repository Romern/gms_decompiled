package p000;

/* renamed from: bzfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfa extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzfa f169757e;

    /* renamed from: f */
    public static final bxvj f169758f;

    /* renamed from: g */
    private static volatile bxxk f169759g;

    /* renamed from: a */
    public int f169760a;

    /* renamed from: b */
    public bzex f169761b;

    /* renamed from: c */
    public bzfx f169762c;

    /* renamed from: d */
    public bzgm f169763d;

    static {
        bzfa bzfa = new bzfa();
        f169757e = bzfa;
        bxvk.m124024a(bzfa.class, bzfa);
        blcc blcc = blcc.f125904a;
        bzfa bzfa2 = f169757e;
        f169758f = bxvk.m124006a(blcc, bzfa2, bzfa2, 90751297, bxzf.MESSAGE);
    }

    private bzfa() {
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
            return bxvk.m124022a(f169757e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzfa();
        } else {
            if (i2 == 4) {
                return new bxvd(f169757e);
            }
            if (i2 == 5) {
                return f169757e;
            }
            bxxk bxxk = f169759g;
            if (bxxk == null) {
                synchronized (bzfa.class) {
                    bxxk = f169759g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169757e);
                        f169759g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
