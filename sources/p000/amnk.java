package p000;

/* renamed from: amnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnk extends bxvk implements bxxd {

    /* renamed from: o */
    public static final amnk f75488o;

    /* renamed from: p */
    private static volatile bxxk f75489p;

    /* renamed from: a */
    public int f75490a;

    /* renamed from: b */
    public bxwc f75491b = bxxn.f165040b;

    /* renamed from: c */
    public boolean f75492c;

    /* renamed from: d */
    public boolean f75493d;

    /* renamed from: e */
    public int f75494e;

    /* renamed from: f */
    public bxwc f75495f = bxxn.f165040b;

    /* renamed from: g */
    public bxwc f75496g = bxxn.f165040b;

    /* renamed from: h */
    public int f75497h;

    /* renamed from: i */
    public boolean f75498i;

    /* renamed from: j */
    public amnd f75499j;

    /* renamed from: k */
    public ammw f75500k;

    /* renamed from: l */
    public ammv f75501l;

    /* renamed from: m */
    public bxwc f75502m = bxxn.f165040b;

    /* renamed from: n */
    public int f75503n;

    static {
        amnk amnk = new amnk();
        f75488o = amnk;
        bxvk.m124024a(amnk.class, amnk);
    }

    private amnk() {
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
            return bxvk.m124022a(f75488o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0004\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0005င\u0002\u0006\u001b\u0007ဌ\u0003\bဇ\u0004\tဉ\u0005\nဉ\u0006\u000bဉ\u0007\f\u001b\rဌ\b\u000e\u001b", new Object[]{"a", "b", amnc.class, "c", "d", "e", "f", amni.class, "h", amkn.f75072a, "i", "j", "k", "l", "m", amnf.class, "n", amjt.m62983b(), "g", amnj.class});
        } else if (i2 == 3) {
            return new amnk();
        } else {
            if (i2 == 4) {
                return new ammx();
            }
            if (i2 == 5) {
                return f75488o;
            }
            bxxk bxxk = f75489p;
            if (bxxk == null) {
                synchronized (amnk.class) {
                    bxxk = f75489p;
                    if (bxxk == null) {
                        bxxk = new bxve(f75488o);
                        f75489p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo41222a() {
        if (!this.f75502m.mo73666a()) {
            this.f75502m = bxvk.m124021a(this.f75502m);
        }
    }
}
