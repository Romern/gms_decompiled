package p000;

/* renamed from: amnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnc extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final amnc f75422l;

    /* renamed from: m */
    private static volatile bxxk f75423m;

    /* renamed from: a */
    public int f75424a;

    /* renamed from: b */
    public int f75425b;

    /* renamed from: c */
    public int f75426c;

    /* renamed from: d */
    public boolean f75427d;

    /* renamed from: e */
    public int f75428e;

    /* renamed from: f */
    public int f75429f;

    /* renamed from: g */
    public int f75430g;

    /* renamed from: h */
    public int f75431h;

    /* renamed from: i */
    public bxwc f75432i = bxxn.f165040b;

    /* renamed from: j */
    public int f75433j;

    /* renamed from: k */
    public int f75434k;

    static {
        amnc amnc = new amnc();
        f75422l = amnc;
        GeneratedMessageLite.m124024a(amnc.class, amnc);
    }

    private amnc() {
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
            return GeneratedMessageLite.m124022a(f75422l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\n\u001b\u000bင\t\fင\n", new Object[]{"a", "b", ammz.m63080b(), "c", amjf.m62966b(), "d", "e", "f", "g", "h", "i", amnb.class, "j", "k"});
        } else if (i2 == 3) {
            return new amnc();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f75422l;
            }
            bxxk bxxk = f75423m;
            if (bxxk == null) {
                synchronized (amnc.class) {
                    bxxk = f75423m;
                    if (bxxk == null) {
                        bxxk = new bxve(f75422l);
                        f75423m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
