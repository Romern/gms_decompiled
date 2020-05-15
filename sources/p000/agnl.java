package p000;

/* renamed from: agnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnl extends bxvk implements bxxd {

    /* renamed from: b */
    public static final agnl f66085b;

    /* renamed from: c */
    private static volatile bxxk f66086c;

    /* renamed from: a */
    public bxwc f66087a = bxxn.f165040b;

    static {
        agnl agnl = new agnl();
        f66085b = agnl;
        bxvk.m124024a(agnl.class, agnl);
    }

    private agnl() {
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
            return bxvk.m124022a(f66085b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", agnm.class});
        } else if (i2 == 3) {
            return new agnl();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f66085b;
            }
            bxxk bxxk = f66086c;
            if (bxxk == null) {
                synchronized (agnl.class) {
                    bxxk = f66086c;
                    if (bxxk == null) {
                        bxxk = new bxve(f66085b);
                        f66086c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
