package p000;

/* renamed from: bxhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhq extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxhq f163452b;

    /* renamed from: d */
    private static volatile bxxk f163453d;

    /* renamed from: a */
    public int f163454a;

    /* renamed from: c */
    private int f163455c;

    static {
        bxhq bxhq = new bxhq();
        f163452b = bxhq;
        GeneratedMessageLite.m124024a(bxhq.class, bxhq);
    }

    private bxhq() {
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
            return GeneratedMessageLite.m124022a(f163452b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bxco.m122578b()});
        } else if (i2 == 3) {
            return new bxhq();
        } else {
            if (i2 == 4) {
                return new bxvd(f163452b);
            }
            if (i2 == 5) {
                return f163452b;
            }
            bxxk bxxk = f163453d;
            if (bxxk == null) {
                synchronized (bxhq.class) {
                    bxxk = f163453d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163452b);
                        f163453d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
