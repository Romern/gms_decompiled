package p000;

/* renamed from: cimy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimy extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cimy f190871f;

    /* renamed from: g */
    private static volatile bxxk f190872g;

    /* renamed from: a */
    public int f190873a;

    /* renamed from: b */
    public boolean f190874b;

    /* renamed from: c */
    public boolean f190875c;

    /* renamed from: d */
    public boolean f190876d;

    /* renamed from: e */
    public boolean f190877e;

    static {
        cimy cimy = new cimy();
        f190871f = cimy;
        GeneratedMessageLite.m124024a(cimy.class, cimy);
    }

    private cimy() {
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
            return GeneratedMessageLite.m124022a(f190871f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cimy();
        } else {
            if (i2 == 4) {
                return new bxvd(f190871f);
            }
            if (i2 == 5) {
                return f190871f;
            }
            bxxk bxxk = f190872g;
            if (bxxk == null) {
                synchronized (cimy.class) {
                    bxxk = f190872g;
                    if (bxxk == null) {
                        bxxk = new bxve(f190871f);
                        f190872g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
