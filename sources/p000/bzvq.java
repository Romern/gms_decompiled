package p000;

/* renamed from: bzvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzvq f171540c;

    /* renamed from: d */
    private static volatile bxxk f171541d;

    /* renamed from: a */
    public int f171542a;

    /* renamed from: b */
    public int f171543b = 1;

    static {
        bzvq bzvq = new bzvq();
        f171540c = bzvq;
        bxvk.m124024a(bzvq.class, bzvq);
    }

    private bzvq() {
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
            return bxvk.m124022a(f171540c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzvp.f171539a});
        } else if (i2 == 3) {
            return new bzvq();
        } else {
            if (i2 == 4) {
                return new bxvd(f171540c);
            }
            if (i2 == 5) {
                return f171540c;
            }
            bxxk bxxk = f171541d;
            if (bxxk == null) {
                synchronized (bzvq.class) {
                    bxxk = f171541d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171540c);
                        f171541d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
