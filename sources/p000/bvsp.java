package p000;

/* renamed from: bvsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvsp f157515e;

    /* renamed from: f */
    private static volatile bxxk f157516f;

    /* renamed from: a */
    public int f157517a;

    /* renamed from: b */
    public int f157518b;

    /* renamed from: c */
    public int f157519c;

    /* renamed from: d */
    public int f157520d;

    static {
        bvsp bvsp = new bvsp();
        f157515e = bvsp;
        bxvk.m124024a(bvsp.class, bvsp);
    }

    private bvsp() {
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
            return bxvk.m124022a(f157515e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", bvzi.f158292a, "c", bvzj.f158293a, "d", bvzh.f158291a});
        } else if (i2 == 3) {
            return new bvsp();
        } else {
            if (i2 == 4) {
                return new bxvd(f157515e);
            }
            if (i2 == 5) {
                return f157515e;
            }
            bxxk bxxk = f157516f;
            if (bxxk == null) {
                synchronized (bvsp.class) {
                    bxxk = f157516f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157515e);
                        f157516f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
