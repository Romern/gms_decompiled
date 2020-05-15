package p000;

/* renamed from: bxjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxjl extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxjl f163652b;

    /* renamed from: d */
    private static volatile bxxk f163653d;

    /* renamed from: a */
    public int f163654a = -1;

    /* renamed from: c */
    private int f163655c;

    static {
        bxjl bxjl = new bxjl();
        f163652b = bxjl;
        GeneratedMessageLite.m124024a(bxjl.class, bxjl);
    }

    private bxjl() {
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
            return GeneratedMessageLite.m124022a(f163652b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bxjm.f163656a});
        } else if (i2 == 3) {
            return new bxjl();
        } else {
            if (i2 == 4) {
                return new bxvd(f163652b);
            }
            if (i2 == 5) {
                return f163652b;
            }
            bxxk bxxk = f163653d;
            if (bxxk == null) {
                synchronized (bxjl.class) {
                    bxxk = f163653d;
                    if (bxxk == null) {
                        bxxk = new bxve(f163652b);
                        f163653d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
