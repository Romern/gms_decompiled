package p000;

/* renamed from: bxdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdv extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxdv f163066b;

    /* renamed from: d */
    private static volatile bxxk f163067d;

    /* renamed from: a */
    public int f163068a;

    /* renamed from: c */
    private int f163069c;

    static {
        bxdv bxdv = new bxdv();
        f163066b = bxdv;
        GeneratedMessageLite.m124024a(bxdv.class, bxdv);
    }

    private bxdv() {
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
            return GeneratedMessageLite.m124022a(f163066b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bxdt.f163065a});
        } else if (i2 == 3) {
            return new bxdv();
        } else {
            if (i2 == 4) {
                return new bxvd(f163066b);
            }
            if (i2 == 5) {
                return f163066b;
            }
            bxxk bxxk = f163067d;
            if (bxxk == null) {
                synchronized (bxdv.class) {
                    bxxk = f163067d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163066b);
                        f163067d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
