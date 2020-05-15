package p000;

/* renamed from: bose */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bose extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bose f134569j;

    /* renamed from: k */
    private static volatile bxxk f134570k;

    /* renamed from: a */
    public int f134571a;

    /* renamed from: b */
    public int f134572b = -1;

    /* renamed from: c */
    public int f134573c = -1;

    /* renamed from: d */
    public int f134574d = -1;

    /* renamed from: e */
    public int f134575e = -1;

    /* renamed from: f */
    public boolean f134576f;

    /* renamed from: g */
    public int f134577g = -1;

    /* renamed from: h */
    public int f134578h = -1;

    /* renamed from: i */
    public int f134579i = -1;

    static {
        bose bose = new bose();
        f134569j = bose;
        GeneratedMessageLite.m124024a(bose.class, bose);
    }

    private bose() {
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
            return GeneratedMessageLite.m124022a(f134569j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bose();
        } else {
            if (i2 == 4) {
                return new bxvd(f134569j);
            }
            if (i2 == 5) {
                return f134569j;
            }
            bxxk bxxk = f134570k;
            if (bxxk == null) {
                synchronized (bose.class) {
                    bxxk = f134570k;
                    if (bxxk == null) {
                        bxxk = new bxve(f134569j);
                        f134570k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
