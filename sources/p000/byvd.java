package p000;

/* renamed from: byvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f168413b = new byvc();

    /* renamed from: e */
    public static final byvd f168414e;

    /* renamed from: g */
    private static volatile bxxk f168415g;

    /* renamed from: a */
    public bxvt f168416a = bxvm.f164965b;

    /* renamed from: c */
    public byuv f168417c;

    /* renamed from: d */
    public String f168418d = "";

    /* renamed from: f */
    private int f168419f;

    static {
        byvd byvd = new byvd();
        f168414e = byvd;
        GeneratedMessageLite.m124024a(byvd.class, byvd);
    }

    private byvd() {
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
            return GeneratedMessageLite.m124022a(f168414e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002ဉ\u0000\u0003ဈ\u0001", new Object[]{"f", "a", bzbu.m125628b(), "c", "d"});
        } else if (i2 == 3) {
            return new byvd();
        } else {
            if (i2 == 4) {
                return new bxvd(f168414e);
            }
            if (i2 == 5) {
                return f168414e;
            }
            bxxk bxxk = f168415g;
            if (bxxk == null) {
                synchronized (byvd.class) {
                    bxxk = f168415g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168414e);
                        f168415g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
