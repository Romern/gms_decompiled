package p000;

/* renamed from: byft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byft extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byft f166062d;

    /* renamed from: e */
    private static volatile bxxk f166063e;

    /* renamed from: a */
    public int f166064a;

    /* renamed from: b */
    public bxwc f166065b = bxxn.f165040b;

    /* renamed from: c */
    public byfw f166066c;

    static {
        byft byft = new byft();
        f166062d = byft;
        bxvk.m124024a(byft.class, byft);
    }

    private byft() {
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
            return bxvk.m124022a(f166062d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", byfs.class, "c"});
        } else if (i2 == 3) {
            return new byft();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f166062d;
            }
            bxxk bxxk = f166063e;
            if (bxxk == null) {
                synchronized (byft.class) {
                    bxxk = f166063e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166062d);
                        f166063e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
