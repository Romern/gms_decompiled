package p000;

/* renamed from: bzqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f171059b = new bzqq();

    /* renamed from: c */
    public static final bzqr f171060c;

    /* renamed from: d */
    private static volatile bxxk f171061d;

    /* renamed from: a */
    public bxvt f171062a = bxvm.f164965b;

    static {
        bzqr bzqr = new bzqr();
        f171060c = bzqr;
        GeneratedMessageLite.m124024a(bzqr.class, bzqr);
    }

    private bzqr() {
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
            return GeneratedMessageLite.m124022a(f171060c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bzps.m126021b()});
        } else if (i2 == 3) {
            return new bzqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f171060c);
            }
            if (i2 == 5) {
                return f171060c;
            }
            bxxk bxxk = f171061d;
            if (bxxk == null) {
                synchronized (bzqr.class) {
                    bxxk = f171061d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171060c);
                        f171061d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
