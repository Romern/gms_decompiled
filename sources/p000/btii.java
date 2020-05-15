package p000;

/* renamed from: btii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btii extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btii f148978e;

    /* renamed from: f */
    private static volatile bxxk f148979f;

    /* renamed from: a */
    public btio f148980a;

    /* renamed from: b */
    public boolean f148981b;

    /* renamed from: c */
    public bxvt f148982c = bxvm.f164965b;

    /* renamed from: d */
    public boolean f148983d;

    static {
        btii btii = new btii();
        f148978e = btii;
        GeneratedMessageLite.m124024a(btii.class, btii);
    }

    private btii() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f148978e, "\u0000\u0004\u0000\u0000\u0003\u0007\u0004\u0000\u0001\u0000\u0003\t\u0004\u0007\u0005'\u0007\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btii();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f148978e;
            }
            bxxk bxxk = f148979f;
            if (bxxk == null) {
                synchronized (btii.class) {
                    bxxk = f148979f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148978e);
                        f148979f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
