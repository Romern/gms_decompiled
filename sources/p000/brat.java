package p000;

/* renamed from: brat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brat extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxvu f142181c = new bras();

    /* renamed from: e */
    public static final brat f142182e;

    /* renamed from: g */
    private static volatile bxxk f142183g;

    /* renamed from: a */
    public boolean f142184a;

    /* renamed from: b */
    public bxvt f142185b = bxvm.f164965b;

    /* renamed from: d */
    public ByteString f142186d = ByteString.f164797b;

    /* renamed from: f */
    private int f142187f;

    static {
        brat brat = new brat();
        f142182e = brat;
        GeneratedMessageLite.m124024a(brat.class, brat);
    }

    private brat() {
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
            return GeneratedMessageLite.m124022a(f142182e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဇ\u0001\u0003\u001e\u0004ည\u0002", new Object[]{"f", "a", "b", brej.m113931b(), "d"});
        } else if (i2 == 3) {
            return new brat();
        } else {
            if (i2 == 4) {
                return new bxvd(f142182e);
            }
            if (i2 == 5) {
                return f142182e;
            }
            bxxk bxxk = f142183g;
            if (bxxk == null) {
                synchronized (brat.class) {
                    bxxk = f142183g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142182e);
                        f142183g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
