package p000;

/* renamed from: buof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buof extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final buof f154514f;

    /* renamed from: g */
    private static volatile bxxk f154515g;

    /* renamed from: a */
    public int f154516a;

    /* renamed from: b */
    public double f154517b;

    /* renamed from: c */
    public bxvt f154518c = bxvm.f164965b;

    /* renamed from: d */
    public bxvt f154519d = bxvm.f164965b;

    /* renamed from: e */
    public bxvt f154520e = bxvm.f164965b;

    static {
        buof buof = new buof();
        f154514f = buof;
        GeneratedMessageLite.m124024a(buof.class, buof);
    }

    private buof() {
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
            return GeneratedMessageLite.m124022a(f154514f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0004\u0002\u0000\u0003/\u0004/\u0005/", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new buof();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f154514f;
            }
            bxxk bxxk = f154515g;
            if (bxxk == null) {
                synchronized (buof.class) {
                    bxxk = f154515g;
                    if (bxxk == null) {
                        bxxk = new bxve(f154514f);
                        f154515g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
