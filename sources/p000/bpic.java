package p000;

/* renamed from: bpic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpic extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpic f137715f;

    /* renamed from: g */
    private static volatile bxxk f137716g;

    /* renamed from: a */
    public int f137717a;

    /* renamed from: b */
    public int f137718b;

    /* renamed from: c */
    public int f137719c = -1;

    /* renamed from: d */
    public boolean f137720d;

    /* renamed from: e */
    public boolean f137721e;

    static {
        bpic bpic = new bpic();
        f137715f = bpic;
        bxvk.m124024a(bpic.class, bpic);
    }

    private bpic() {
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
            return bxvk.m124022a(f137715f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", bpia.f137714a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpic();
        } else {
            if (i2 == 4) {
                return new bxvd(f137715f);
            }
            if (i2 == 5) {
                return f137715f;
            }
            bxxk bxxk = f137716g;
            if (bxxk == null) {
                synchronized (bpic.class) {
                    bxxk = f137716g;
                    if (bxxk == null) {
                        bxxk = new bxve(f137715f);
                        f137716g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
