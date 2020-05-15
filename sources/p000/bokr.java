package p000;

/* renamed from: bokr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bokr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bokr f133444c;

    /* renamed from: d */
    private static volatile bxxk f133445d;

    /* renamed from: a */
    public int f133446a;

    /* renamed from: b */
    public int f133447b;

    static {
        bokr bokr = new bokr();
        f133444c = bokr;
        bxvk.m124024a(bokr.class, bokr);
    }

    private bokr() {
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
            return bxvk.m124022a(f133444c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bokq.f133443a});
        } else if (i2 == 3) {
            return new bokr();
        } else {
            if (i2 == 4) {
                return new bxvd(f133444c);
            }
            if (i2 == 5) {
                return f133444c;
            }
            bxxk bxxk = f133445d;
            if (bxxk == null) {
                synchronized (bokr.class) {
                    bxxk = f133445d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133444c);
                        f133445d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
