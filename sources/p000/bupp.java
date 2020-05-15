package p000;

/* renamed from: bupp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bupp f154663c;

    /* renamed from: d */
    private static volatile bxxk f154664d;

    /* renamed from: a */
    public bupn f154665a;

    /* renamed from: b */
    public bxwc f154666b = bxxn.f165040b;

    static {
        bupp bupp = new bupp();
        f154663c = bupp;
        bxvk.m124024a(bupp.class, bupp);
    }

    private bupp() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f154663c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\t\u0003\u001b", new Object[]{"a", "b", bupw.class});
        } else if (i2 == 3) {
            return new bupp();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f154663c;
            }
            bxxk bxxk = f154664d;
            if (bxxk == null) {
                synchronized (bupp.class) {
                    bxxk = f154664d;
                    if (bxxk == null) {
                        bxxk = new bxve(f154663c);
                        f154664d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
