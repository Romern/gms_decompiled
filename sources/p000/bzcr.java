package p000;

/* renamed from: bzcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzcr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzcr f169402d;

    /* renamed from: e */
    private static volatile bxxk f169403e;

    /* renamed from: a */
    public int f169404a;

    /* renamed from: b */
    public int f169405b;

    /* renamed from: c */
    public bxwc f169406c = bxxn.f165040b;

    static {
        bzcr bzcr = new bzcr();
        f169402d = bzcr;
        bxvk.m124024a(bzcr.class, bzcr);
    }

    private bzcr() {
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
            return bxvk.m124022a(f169402d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", bzcq.m125653b(), "c", bzda.class});
        } else if (i2 == 3) {
            return new bzcr();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f169402d;
            }
            bxxk bxxk = f169403e;
            if (bxxk == null) {
                synchronized (bzcr.class) {
                    bxxk = f169403e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169402d);
                        f169403e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
