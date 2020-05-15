package p000;

/* renamed from: bvnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvnp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvnp f156956d;

    /* renamed from: e */
    private static volatile bxxk f156957e;

    /* renamed from: a */
    public int f156958a;

    /* renamed from: b */
    public long f156959b;

    /* renamed from: c */
    public bxvw f156960c = bxwq.f165002b;

    static {
        bvnp bvnp = new bvnp();
        f156956d = bvnp;
        bxvk.m124024a(bvnp.class, bvnp);
    }

    private bvnp() {
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
            return bxvk.m124022a(f156956d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001စ\u0000\u0002\u0017", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvnp();
        } else {
            if (i2 == 4) {
                return new bxvd(f156956d);
            }
            if (i2 == 5) {
                return f156956d;
            }
            bxxk bxxk = f156957e;
            if (bxxk == null) {
                synchronized (bvnp.class) {
                    bxxk = f156957e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156956d);
                        f156957e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
