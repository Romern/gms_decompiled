package p000;

/* renamed from: bipn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bipn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bipn f121186c;

    /* renamed from: f */
    private static volatile bxxk f121187f;

    /* renamed from: a */
    public int f121188a = 1;

    /* renamed from: b */
    public int f121189b;

    /* renamed from: d */
    private int f121190d;

    /* renamed from: e */
    private byte f121191e = 2;

    static {
        bipn bipn = new bipn();
        f121186c = bipn;
        GeneratedMessageLite.m124024a(bipn.class, bipn);
    }

    private bipn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121191e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121191e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f121186c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", bisf.m102782b(), "b"});
        } else if (i2 == 3) {
            return new bipn();
        } else {
            if (i2 == 4) {
                return new bxvd(f121186c);
            }
            if (i2 == 5) {
                return f121186c;
            }
            bxxk bxxk = f121187f;
            if (bxxk == null) {
                synchronized (bipn.class) {
                    bxxk = f121187f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121186c);
                        f121187f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
