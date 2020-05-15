package p000;

/* renamed from: bzeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzeg extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzeg f169639g;

    /* renamed from: h */
    private static volatile bxxk f169640h;

    /* renamed from: a */
    public int f169641a;

    /* renamed from: b */
    public int f169642b;

    /* renamed from: c */
    public int f169643c;

    /* renamed from: d */
    public int f169644d;

    /* renamed from: e */
    public int f169645e;

    /* renamed from: f */
    public int f169646f;

    static {
        bzeg bzeg = new bzeg();
        f169639g = bzeg;
        GeneratedMessageLite.m124024a(bzeg.class, bzeg);
    }

    private bzeg() {
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
            return GeneratedMessageLite.m124022a(f169639g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\f\u0005\f\u0006\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bzeg();
        } else {
            if (i2 == 4) {
                return new bxvd(f169639g);
            }
            if (i2 == 5) {
                return f169639g;
            }
            bxxk bxxk = f169640h;
            if (bxxk == null) {
                synchronized (bzeg.class) {
                    bxxk = f169640h;
                    if (bxxk == null) {
                        bxxk = new bxve(f169639g);
                        f169640h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
