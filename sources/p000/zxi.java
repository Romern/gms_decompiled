package p000;

/* renamed from: zxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final zxi f56102e;

    /* renamed from: f */
    private static volatile bxxk f56103f;

    /* renamed from: a */
    public int f56104a;

    /* renamed from: b */
    public String f56105b = "";

    /* renamed from: c */
    public int f56106c;

    /* renamed from: d */
    public bxwc f56107d = bxxn.f165040b;

    static {
        zxi zxi = new zxi();
        f56102e = zxi;
        bxvk.m124024a(zxi.class, zxi);
    }

    private zxi() {
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
            return bxvk.m124022a(f56102e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", zxh.class});
        } else if (i2 == 3) {
            return new zxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f56102e);
            }
            if (i2 == 5) {
                return f56102e;
            }
            bxxk bxxk = f56103f;
            if (bxxk == null) {
                synchronized (zxi.class) {
                    bxxk = f56103f;
                    if (bxxk == null) {
                        bxxk = new bxve(f56102e);
                        f56103f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
