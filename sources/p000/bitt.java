package p000;

/* renamed from: bitt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitt extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bitt f121703o;

    /* renamed from: r */
    private static volatile bxxk f121704r;

    /* renamed from: a */
    public int f121705a;

    /* renamed from: b */
    public int f121706b;

    /* renamed from: c */
    public bxwc f121707c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f121708d = bxvm.f164965b;

    /* renamed from: e */
    public int f121709e;

    /* renamed from: f */
    public boolean f121710f;

    /* renamed from: g */
    public int f121711g;

    /* renamed from: h */
    public int f121712h;

    /* renamed from: i */
    public boolean f121713i;

    /* renamed from: j */
    public boolean f121714j;

    /* renamed from: k */
    public int f121715k;

    /* renamed from: l */
    public boolean f121716l;

    /* renamed from: m */
    public boolean f121717m;

    /* renamed from: n */
    public int f121718n;

    /* renamed from: p */
    private int f121719p;

    /* renamed from: q */
    private byte f121720q = 2;

    static {
        bitt bitt = new bitt();
        f121703o = bitt;
        bxvk.m124024a(bitt.class, bitt);
    }

    private bitt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121720q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121720q = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121703o, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0004\u0001ᔄ\u0000\u0002ᔌ\u0001\u0003Л\u0004\u0016\u0005ᔄ\u0002\u0006ဇ\u0003\u0007ဌ\u0004\bဌ\u0005\tဇ\u0006\nဇ\u0007\u000bဌ\b\fဇ\t\rဇ\n\u000eင\u000b", new Object[]{"p", "a", "b", biub.f121765a, "c", biud.class, "d", "e", "f", "g", birk.f121424a, "h", biuf.f121784a, "i", "j", "k", bivv.f122051a, "l", "m", "n"});
        } else if (i2 == 3) {
            return new bitt();
        } else {
            if (i2 == 4) {
                return new bxvd(f121703o);
            }
            if (i2 == 5) {
                return f121703o;
            }
            bxxk bxxk = f121704r;
            if (bxxk == null) {
                synchronized (bitt.class) {
                    bxxk = f121704r;
                    if (bxxk == null) {
                        bxxk = new bxve(f121703o);
                        f121704r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
