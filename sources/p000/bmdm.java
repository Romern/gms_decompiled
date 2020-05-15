package p000;

/* renamed from: bmdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmdm f128825e;

    /* renamed from: f */
    private static volatile bxxk f128826f;

    /* renamed from: a */
    public int f128827a;

    /* renamed from: b */
    public int f128828b = 0;

    /* renamed from: c */
    public Object f128829c;

    /* renamed from: d */
    public int f128830d;

    static {
        bmdm bmdm = new bmdm();
        f128825e = bmdm;
        bxvk.m124024a(bmdm.class, bmdm);
    }

    private bmdm() {
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
            return bxvk.m124022a(f128825e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"c", "b", "a", "d", bmdl.f128824a});
        } else if (i2 == 3) {
            return new bmdm();
        } else {
            if (i2 == 4) {
                return new bxvd(f128825e);
            }
            if (i2 == 5) {
                return f128825e;
            }
            bxxk bxxk = f128826f;
            if (bxxk == null) {
                synchronized (bmdm.class) {
                    bxxk = f128826f;
                    if (bxxk == null) {
                        bxxk = new bxve(f128825e);
                        f128826f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
