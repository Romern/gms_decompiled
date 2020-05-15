package p000;

/* renamed from: bxhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxhb f163334c;

    /* renamed from: d */
    private static volatile bxxk f163335d;

    /* renamed from: a */
    public int f163336a;

    /* renamed from: b */
    public bxge f163337b;

    static {
        bxhb bxhb = new bxhb();
        f163334c = bxhb;
        GeneratedMessageLite.m124024a(bxhb.class, bxhb);
    }

    private bxhb() {
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
            return GeneratedMessageLite.m124022a(f163334c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxhb();
        } else {
            if (i2 == 4) {
                return new bxvd(f163334c);
            }
            if (i2 == 5) {
                return f163334c;
            }
            bxxk bxxk = f163335d;
            if (bxxk == null) {
                synchronized (bxhb.class) {
                    bxxk = f163335d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163334c);
                        f163335d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
