package p000;

/* renamed from: zxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxf extends bxvk implements bxxd {

    /* renamed from: e */
    public static final zxf f56084e;

    /* renamed from: f */
    private static volatile bxxk f56085f;

    /* renamed from: a */
    public int f56086a;

    /* renamed from: b */
    public String f56087b = "";

    /* renamed from: c */
    public long f56088c;

    /* renamed from: d */
    public bxtx f56089d = bxtx.f164797b;

    static {
        zxf zxf = new zxf();
        f56084e = zxf;
        bxvk.m124024a(zxf.class, zxf);
    }

    private zxf() {
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
            return bxvk.m124022a(f56084e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new zxf();
        } else {
            if (i2 == 4) {
                return new bxvd(f56084e);
            }
            if (i2 == 5) {
                return f56084e;
            }
            bxxk bxxk = f56085f;
            if (bxxk == null) {
                synchronized (zxf.class) {
                    bxxk = f56085f;
                    if (bxxk == null) {
                        bxxk = new bxve(f56084e);
                        f56085f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
