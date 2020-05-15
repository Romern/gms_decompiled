package p000;

/* renamed from: blxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxw extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blxw f128152f;

    /* renamed from: g */
    private static volatile bxxk f128153g;

    /* renamed from: a */
    public int f128154a;

    /* renamed from: b */
    public bmaj f128155b;

    /* renamed from: c */
    public bxtx f128156c = bxtx.f164797b;

    /* renamed from: d */
    public blzf f128157d;

    /* renamed from: e */
    public bwhf f128158e;

    static {
        blxw blxw = new blxw();
        f128152f = blxw;
        bxvk.m124024a(blxw.class, blxw);
    }

    private blxw() {
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
            return bxvk.m124022a(f128152f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ည\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blxw();
        } else {
            if (i2 == 4) {
                return new bxvd(f128152f);
            }
            if (i2 == 5) {
                return f128152f;
            }
            bxxk bxxk = f128153g;
            if (bxxk == null) {
                synchronized (blxw.class) {
                    bxxk = f128153g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128152f);
                        f128153g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
