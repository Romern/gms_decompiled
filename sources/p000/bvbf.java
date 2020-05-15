package p000;

/* renamed from: bvbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbf extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvbf f155533d;

    /* renamed from: e */
    private static volatile bxxk f155534e;

    /* renamed from: a */
    public int f155535a;

    /* renamed from: b */
    public int f155536b;

    /* renamed from: c */
    public String f155537c = "";

    static {
        bvbf bvbf = new bvbf();
        f155533d = bvbf;
        bxvk.m124024a(bvbf.class, bvbf);
    }

    private bvbf() {
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
            return bxvk.m124022a(f155533d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bvar.f155509a, "c"});
        } else if (i2 == 3) {
            return new bvbf();
        } else {
            if (i2 == 4) {
                return new bxvd(f155533d);
            }
            if (i2 == 5) {
                return f155533d;
            }
            bxxk bxxk = f155534e;
            if (bxxk == null) {
                synchronized (bvbf.class) {
                    bxxk = f155534e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155533d);
                        f155534e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
