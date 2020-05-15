package p000;

/* renamed from: bipw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bipw f121226d;

    /* renamed from: g */
    private static volatile bxxk f121227g;

    /* renamed from: a */
    public int f121228a = 1;

    /* renamed from: b */
    public int f121229b;

    /* renamed from: c */
    public int f121230c;

    /* renamed from: e */
    private int f121231e;

    /* renamed from: f */
    private byte f121232f = 2;

    static {
        bipw bipw = new bipw();
        f121226d = bipw;
        GeneratedMessageLite.m124024a(bipw.class, bipw);
    }

    private bipw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121232f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121232f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121226d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔌ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"e", "a", bisf.m102782b(), "b", "c"});
        } else if (i2 == 3) {
            return new bipw();
        } else {
            if (i2 == 4) {
                return new bxvd(f121226d);
            }
            if (i2 == 5) {
                return f121226d;
            }
            bxxk bxxk = f121227g;
            if (bxxk == null) {
                synchronized (bipw.class) {
                    bxxk = f121227g;
                    if (bxxk == null) {
                        bxxk = new bxve(f121226d);
                        f121227g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
