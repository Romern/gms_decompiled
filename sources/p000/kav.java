package p000;

/* renamed from: kav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kav extends bxvk implements bxxd {

    /* renamed from: b */
    public static final kav f23663b;

    /* renamed from: c */
    private static volatile bxxk f23664c;

    /* renamed from: a */
    public bxwc f23665a = bxxn.f165040b;

    static {
        kav kav = new kav();
        f23663b = kav;
        bxvk.m124024a(kav.class, kav);
    }

    private kav() {
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
            return bxvk.m124022a(f23663b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", kaw.class});
        } else if (i2 == 3) {
            return new kav();
        } else {
            if (i2 == 4) {
                return new bxvd(f23663b);
            }
            if (i2 == 5) {
                return f23663b;
            }
            bxxk bxxk = f23664c;
            if (bxxk == null) {
                synchronized (kav.class) {
                    bxxk = f23664c;
                    if (bxxk == null) {
                        bxxk = new bxve(f23663b);
                        f23664c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
