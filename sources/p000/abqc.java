package p000;

/* renamed from: abqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abqc f57940b;

    /* renamed from: c */
    private static volatile bxxk f57941c;

    /* renamed from: a */
    public bxwc f57942a = bxxn.f165040b;

    static {
        abqc abqc = new abqc();
        f57940b = abqc;
        bxvk.m124024a(abqc.class, abqc);
    }

    private abqc() {
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
            return bxvk.m124022a(f57940b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abqa.class});
        } else if (i2 == 3) {
            return new abqc();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f57940b;
            }
            bxxk bxxk = f57941c;
            if (bxxk == null) {
                synchronized (abqc.class) {
                    bxxk = f57941c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57940b);
                        f57941c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
