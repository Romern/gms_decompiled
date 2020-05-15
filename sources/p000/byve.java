package p000;

/* renamed from: byve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byve extends bxvk implements bxxd {

    /* renamed from: b */
    public static final byve f168420b;

    /* renamed from: d */
    private static volatile bxxk f168421d;

    /* renamed from: a */
    public bxwc f168422a = bxxn.f165040b;

    /* renamed from: c */
    private byte f168423c = 2;

    static {
        byve byve = new byve();
        f168420b = byve;
        bxvk.m124024a(byve.class, byve);
    }

    private byve() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168423c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168423c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f168420b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", byvf.class});
        } else if (i2 == 3) {
            return new byve();
        } else {
            if (i2 == 4) {
                return new bxvd(f168420b);
            }
            if (i2 == 5) {
                return f168420b;
            }
            bxxk bxxk = f168421d;
            if (bxxk == null) {
                synchronized (byve.class) {
                    bxxk = f168421d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168420b);
                        f168421d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
