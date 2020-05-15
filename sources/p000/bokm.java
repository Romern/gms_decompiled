package p000;

/* renamed from: bokm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bokm f133428d;

    /* renamed from: e */
    private static volatile bxxk f133429e;

    /* renamed from: a */
    public int f133430a;

    /* renamed from: b */
    public int f133431b;

    /* renamed from: c */
    public String f133432c = "";

    static {
        bokm bokm = new bokm();
        f133428d = bokm;
        bxvk.m124024a(bokm.class, bokm);
    }

    private bokm() {
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
            return bxvk.m124022a(f133428d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bokl.f133427a, "c"});
        } else if (i2 == 3) {
            return new bokm();
        } else {
            if (i2 == 4) {
                return new bxvd(f133428d);
            }
            if (i2 == 5) {
                return f133428d;
            }
            bxxk bxxk = f133429e;
            if (bxxk == null) {
                synchronized (bokm.class) {
                    bxxk = f133429e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133428d);
                        f133429e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
