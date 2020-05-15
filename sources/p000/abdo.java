package p000;

/* renamed from: abdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abdo f57109b;

    /* renamed from: c */
    private static volatile bxxk f57110c;

    /* renamed from: a */
    public bxwc f57111a = bxxn.f165040b;

    static {
        abdo abdo = new abdo();
        f57109b = abdo;
        bxvk.m124024a(abdo.class, abdo);
    }

    private abdo() {
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
            return bxvk.m124022a(f57109b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", abdf.class});
        } else if (i2 == 3) {
            return new abdo();
        } else {
            if (i2 == 4) {
                return new bxvd(f57109b);
            }
            if (i2 == 5) {
                return f57109b;
            }
            bxxk bxxk = f57110c;
            if (bxxk == null) {
                synchronized (abdo.class) {
                    bxxk = f57110c;
                    if (bxxk == null) {
                        bxxk = new bxve(f57109b);
                        f57110c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
