package p000;

/* renamed from: budl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final budl f153483d;

    /* renamed from: e */
    private static volatile bxxk f153484e;

    /* renamed from: a */
    public int f153485a;

    /* renamed from: b */
    public int f153486b;

    /* renamed from: c */
    public boolean f153487c;

    static {
        budl budl = new budl();
        f153483d = budl;
        bxvk.m124024a(budl.class, budl);
    }

    private budl() {
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
            return bxvk.m124022a(f153483d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", budj.f153482a, "c"});
        } else if (i2 == 3) {
            return new budl();
        } else {
            if (i2 == 4) {
                return new bxvd(f153483d);
            }
            if (i2 == 5) {
                return f153483d;
            }
            bxxk bxxk = f153484e;
            if (bxxk == null) {
                synchronized (budl.class) {
                    bxxk = f153484e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153483d);
                        f153484e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
