package p000;

/* renamed from: bxop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxop extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxop f164187e;

    /* renamed from: f */
    private static volatile bxxk f164188f;

    /* renamed from: a */
    public int f164189a;

    /* renamed from: b */
    public int f164190b;

    /* renamed from: c */
    public boolean f164191c;

    /* renamed from: d */
    public boolean f164192d;

    static {
        bxop bxop = new bxop();
        f164187e = bxop;
        GeneratedMessageLite.m124024a(bxop.class, bxop);
    }

    private bxop() {
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
            return GeneratedMessageLite.m124022a(f164187e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxop();
        } else {
            if (i2 == 4) {
                return new bxvd(f164187e);
            }
            if (i2 == 5) {
                return f164187e;
            }
            bxxk bxxk = f164188f;
            if (bxxk == null) {
                synchronized (bxop.class) {
                    bxxk = f164188f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164187e);
                        f164188f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
