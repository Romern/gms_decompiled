package p000;

/* renamed from: cblg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cblg f177496f;

    /* renamed from: g */
    private static volatile bxxk f177497g;

    /* renamed from: a */
    public cblx f177498a;

    /* renamed from: b */
    public boolean f177499b;

    /* renamed from: c */
    public long f177500c;

    /* renamed from: d */
    public bxtx f177501d = bxtx.f164797b;

    /* renamed from: e */
    public cbji f177502e;

    static {
        cblg cblg = new cblg();
        f177496f = cblg;
        bxvk.m124024a(cblg.class, cblg);
    }

    private cblg() {
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
            return bxvk.m124022a(f177496f, "\u0000\u0005\u0000\u0000\u0002\t\u0005\u0000\u0000\u0000\u0002\t\u0003\u0007\u0004\u0002\b\n\t\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cblg();
        } else {
            if (i2 == 4) {
                return new bxvd(f177496f);
            }
            if (i2 == 5) {
                return f177496f;
            }
            bxxk bxxk = f177497g;
            if (bxxk == null) {
                synchronized (cblg.class) {
                    bxxk = f177497g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177496f);
                        f177497g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
