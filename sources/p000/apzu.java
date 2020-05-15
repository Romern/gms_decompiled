package p000;

/* renamed from: apzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzu extends bxvk implements bxxd {

    /* renamed from: j */
    public static final apzu f85290j;

    /* renamed from: m */
    private static volatile bxxk f85291m;

    /* renamed from: a */
    public int f85292a;

    /* renamed from: b */
    public boolean f85293b;

    /* renamed from: c */
    public boolean f85294c;

    /* renamed from: d */
    public int f85295d;

    /* renamed from: e */
    public int f85296e;

    /* renamed from: f */
    public int f85297f;

    /* renamed from: g */
    public int f85298g;

    /* renamed from: h */
    public int f85299h;

    /* renamed from: i */
    public boolean f85300i;

    /* renamed from: k */
    private boolean f85301k;

    /* renamed from: l */
    private boolean f85302l;

    static {
        apzu apzu = new apzu();
        f85290j = apzu;
        bxvk.m124024a(apzu.class, apzu);
    }

    private apzu() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m71236a(apzu apzu) {
        apzu.f85292a |= 32;
        apzu.f85301k = false;
    }

    /* renamed from: b */
    public static /* synthetic */ void m71237b(apzu apzu) {
        apzu.f85292a |= 64;
        apzu.f85302l = false;
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
            return bxvk.m124022a(f85290j, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဌ\b\nဇ\t", new Object[]{"a", "b", "c", "d", apzt.f85289a, "e", "f", apzs.f85288a, "k", "l", "g", "h", apzr.f85287a, "i"});
        } else if (i2 == 3) {
            return new apzu();
        } else {
            if (i2 == 4) {
                return new bxvd(f85290j);
            }
            if (i2 == 5) {
                return f85290j;
            }
            bxxk bxxk = f85291m;
            if (bxxk == null) {
                synchronized (apzu.class) {
                    bxxk = f85291m;
                    if (bxxk == null) {
                        bxxk = new bxve(f85290j);
                        f85291m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
