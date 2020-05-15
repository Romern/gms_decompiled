package p000;

/* renamed from: bkze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkze extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bkze f125563g;

    /* renamed from: h */
    private static volatile bxxk f125564h;

    /* renamed from: a */
    public int f125565a;

    /* renamed from: b */
    public bxvt f125566b = bxvm.f164965b;

    /* renamed from: c */
    public boolean f125567c;

    /* renamed from: d */
    public int f125568d;

    /* renamed from: e */
    public boolean f125569e;

    /* renamed from: f */
    public int f125570f;

    static {
        bkze bkze = new bkze();
        f125563g = bkze;
        GeneratedMessageLite.m124024a(bkze.class, bkze);
    }

    private bkze() {
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
            return GeneratedMessageLite.m124022a(f125563g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001e\u0003ဇ\u0001\u0004ဋ\u0002\u0005ဇ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", bkzt.m106933b(), "c", "d", "e", "f", blbe.f125821a});
        } else if (i2 == 3) {
            return new bkze();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return f125563g;
            }
            bxxk bxxk = f125564h;
            if (bxxk == null) {
                synchronized (bkze.class) {
                    bxxk = f125564h;
                    if (bxxk == null) {
                        bxxk = new bxve(f125563g);
                        f125564h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
