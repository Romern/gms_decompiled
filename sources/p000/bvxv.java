package p000;

/* renamed from: bvxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvxv f158104d;

    /* renamed from: e */
    private static volatile bxxk f158105e;

    /* renamed from: a */
    public int f158106a;

    /* renamed from: b */
    public int f158107b;

    /* renamed from: c */
    public long f158108c;

    static {
        bvxv bvxv = new bvxv();
        f158104d = bvxv;
        bxvk.m124024a(bvxv.class, bvxv);
    }

    private bvxv() {
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
            return bxvk.m124022a(f158104d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", bvxu.m121576b(), "c"});
        } else if (i2 == 3) {
            return new bvxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f158104d);
            }
            if (i2 == 5) {
                return f158104d;
            }
            bxxk bxxk = f158105e;
            if (bxxk == null) {
                synchronized (bvxv.class) {
                    bxxk = f158105e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158104d);
                        f158105e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
