package p000;

/* renamed from: bzyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyk extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzyk f171885d;

    /* renamed from: e */
    private static volatile bxxk f171886e;

    /* renamed from: a */
    public long f171887a;

    /* renamed from: b */
    public bxwc f171888b = bxxn.f165040b;

    /* renamed from: c */
    public bzyr f171889c;

    static {
        bzyk bzyk = new bzyk();
        f171885d = bzyk;
        bxvk.m124024a(bzyk.class, bzyk);
    }

    private bzyk() {
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
            return bxvk.m124022a(f171885d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u001b\u0003\t", new Object[]{"a", "b", bzyq.class, "c"});
        } else if (i2 == 3) {
            return new bzyk();
        } else {
            if (i2 == 4) {
                return new bxvd(f171885d);
            }
            if (i2 == 5) {
                return f171885d;
            }
            bxxk bxxk = f171886e;
            if (bxxk == null) {
                synchronized (bzyk.class) {
                    bxxk = f171886e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171885d);
                        f171886e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
