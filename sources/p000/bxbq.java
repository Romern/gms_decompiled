package p000;

/* renamed from: bxbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxbq extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxbq f162727d;

    /* renamed from: e */
    private static volatile bxxk f162728e;

    /* renamed from: a */
    public int f162729a;

    /* renamed from: b */
    public String f162730b = "";

    /* renamed from: c */
    public String f162731c = "";

    static {
        bxbq bxbq = new bxbq();
        f162727d = bxbq;
        bxvk.m124024a(bxbq.class, bxbq);
    }

    private bxbq() {
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
            return bxvk.m124022a(f162727d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxbq();
        } else {
            if (i2 == 4) {
                return new bxvd(f162727d);
            }
            if (i2 == 5) {
                return f162727d;
            }
            bxxk bxxk = f162728e;
            if (bxxk == null) {
                synchronized (bxbq.class) {
                    bxxk = f162728e;
                    if (bxxk == null) {
                        bxxk = new bxve(f162727d);
                        f162728e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
