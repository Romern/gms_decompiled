package p000;

/* renamed from: bzkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzkd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzkd f170374e;

    /* renamed from: f */
    private static volatile bxxk f170375f;

    /* renamed from: a */
    public int f170376a;

    /* renamed from: b */
    public int f170377b = 0;

    /* renamed from: c */
    public Object f170378c;

    /* renamed from: d */
    public int f170379d;

    static {
        bzkd bzkd = new bzkd();
        f170374e = bzkd;
        GeneratedMessageLite.m124024a(bzkd.class, bzkd);
    }

    private bzkd() {
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
            return GeneratedMessageLite.m124022a(f170374e, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", bzkc.f170373a, bzjy.class, bzke.class});
        } else if (i2 == 3) {
            return new bzkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f170374e);
            }
            if (i2 == 5) {
                return f170374e;
            }
            bxxk bxxk = f170375f;
            if (bxxk == null) {
                synchronized (bzkd.class) {
                    bxxk = f170375f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170374e);
                        f170375f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
