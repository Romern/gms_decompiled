package p000;

/* renamed from: ayei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayei extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final ayei f97299j;

    /* renamed from: k */
    private static volatile bxxk f97300k;

    /* renamed from: a */
    public int f97301a;

    /* renamed from: b */
    public int f97302b = 1;

    /* renamed from: c */
    public long f97303c;

    /* renamed from: d */
    public boolean f97304d;

    /* renamed from: e */
    public String f97305e = "";

    /* renamed from: f */
    public String f97306f = "";

    /* renamed from: g */
    public String f97307g = "";

    /* renamed from: h */
    public int f97308h;

    /* renamed from: i */
    public boolean f97309i;

    static {
        ayei ayei = new ayei();
        f97299j = ayei;
        GeneratedMessageLite.m124024a(ayei.class, ayei);
    }

    private ayei() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f97299j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002စ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bဇ\u0007", new Object[]{"a", "b", ayeg.f97298a, "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new ayei();
        } else {
            if (i2 == 4) {
                return new bxvd(f97299j);
            }
            if (i2 == 5) {
                return f97299j;
            }
            bxxk bxxk = f97300k;
            if (bxxk == null) {
                synchronized (ayei.class) {
                    bxxk = f97300k;
                    if (bxxk == null) {
                        bxxk = new bxve(f97299j);
                        f97300k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
