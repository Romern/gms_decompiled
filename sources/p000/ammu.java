package p000;

/* renamed from: ammu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ammu f75391d;

    /* renamed from: e */
    private static volatile bxxk f75392e;

    /* renamed from: a */
    public int f75393a;

    /* renamed from: b */
    public int f75394b;

    /* renamed from: c */
    public int f75395c;

    static {
        ammu ammu = new ammu();
        f75391d = ammu;
        GeneratedMessageLite.m124024a(ammu.class, ammu);
    }

    private ammu() {
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
            return GeneratedMessageLite.m124022a(f75391d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ammu();
        } else {
            if (i2 == 4) {
                return new bxvd(f75391d);
            }
            if (i2 == 5) {
                return f75391d;
            }
            bxxk bxxk = f75392e;
            if (bxxk == null) {
                synchronized (ammu.class) {
                    bxxk = f75392e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75391d);
                        f75392e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
