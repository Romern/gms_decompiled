package p000;

/* renamed from: bzgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzgq f169968e;

    /* renamed from: g */
    private static volatile bxxk f169969g;

    /* renamed from: a */
    public bzgh f169970a;

    /* renamed from: b */
    public String f169971b = "";

    /* renamed from: c */
    public String f169972c = "";

    /* renamed from: d */
    public bxwc f169973d = bxxn.f165040b;

    /* renamed from: f */
    private int f169974f;

    static {
        bzgq bzgq = new bzgq();
        f169968e = bzgq;
        bxvk.m124024a(bzgq.class, bzgq);
    }

    private bzgq() {
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
            return bxvk.m124022a(f169968e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"f", "a", "b", "c", "d", bzfg.class});
        } else if (i2 == 3) {
            return new bzgq();
        } else {
            if (i2 == 4) {
                return new bxvd(f169968e);
            }
            if (i2 == 5) {
                return f169968e;
            }
            bxxk bxxk = f169969g;
            if (bxxk == null) {
                synchronized (bzgq.class) {
                    bxxk = f169969g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169968e);
                        f169969g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
