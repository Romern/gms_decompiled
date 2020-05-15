package p000;

/* renamed from: amsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amsc extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final amsc f75836c;

    /* renamed from: d */
    private static volatile bxxk f75837d;

    /* renamed from: a */
    public int f75838a;

    /* renamed from: b */
    public long f75839b;

    static {
        amsc amsc = new amsc();
        f75836c = amsc;
        GeneratedMessageLite.m124024a(amsc.class, amsc);
    }

    private amsc() {
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
            return GeneratedMessageLite.m124022a(f75836c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new amsc();
        } else {
            if (i2 == 4) {
                return new bxvd(f75836c);
            }
            if (i2 == 5) {
                return f75836c;
            }
            bxxk bxxk = f75837d;
            if (bxxk == null) {
                synchronized (amsc.class) {
                    bxxk = f75837d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75836c);
                        f75837d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
