package p000;

/* renamed from: abpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpe extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abpe f57836b;

    /* renamed from: c */
    private static volatile bxxk f57837c;

    /* renamed from: a */
    public bxwc f57838a = bxxn.f165040b;

    static {
        abpe abpe = new abpe();
        f57836b = abpe;
        bxvk.m124024a(abpe.class, abpe);
    }

    private abpe() {
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
            return bxvk.m124022a(f57836b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abpd.class});
        } else if (i2 == 3) {
            return new abpe();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f57836b;
            }
            bxxk bxxk = f57837c;
            if (bxxk == null) {
                synchronized (abpe.class) {
                    bxxk = f57837c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57836b);
                        f57837c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
