package p000;

/* renamed from: bxjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjb extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxjb f163601b;

    /* renamed from: d */
    private static volatile bxxk f163602d;

    /* renamed from: a */
    public bxjd f163603a;

    /* renamed from: c */
    private int f163604c;

    static {
        bxjb bxjb = new bxjb();
        f163601b = bxjb;
        GeneratedMessageLite.m124024a(bxjb.class, bxjb);
    }

    private bxjb() {
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
            return GeneratedMessageLite.m124022a(f163601b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxjb();
        } else {
            if (i2 == 4) {
                return new bxvd(f163601b);
            }
            if (i2 == 5) {
                return f163601b;
            }
            bxxk bxxk = f163602d;
            if (bxxk == null) {
                synchronized (bxjb.class) {
                    bxxk = f163602d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163601b);
                        f163602d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
