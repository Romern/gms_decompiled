package p000;

/* renamed from: bozd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bozd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bozd f135369c;

    /* renamed from: d */
    private static volatile bxxk f135370d;

    /* renamed from: a */
    public int f135371a;

    /* renamed from: b */
    public int f135372b;

    static {
        bozd bozd = new bozd();
        f135369c = bozd;
        bxvk.m124024a(bozd.class, bozd);
    }

    private bozd() {
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
            return bxvk.m124022a(f135369c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bozc.f135368a});
        } else if (i2 == 3) {
            return new bozd();
        } else {
            if (i2 == 4) {
                return new bxvd(f135369c);
            }
            if (i2 == 5) {
                return f135369c;
            }
            bxxk bxxk = f135370d;
            if (bxxk == null) {
                synchronized (bozd.class) {
                    bxxk = f135370d;
                    if (bxxk == null) {
                        bxxk = new bxve(f135369c);
                        f135370d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
