package p000;

/* renamed from: dkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dkd extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final dkd f13379j;

    /* renamed from: k */
    private static volatile bxxk f13380k;

    /* renamed from: a */
    public int f13381a;

    /* renamed from: b */
    public String f13382b = "";

    /* renamed from: c */
    public long f13383c;

    /* renamed from: d */
    public boolean f13384d;

    /* renamed from: e */
    public bxwc f13385e = bxxn.f165040b;

    /* renamed from: f */
    public int f13386f;

    /* renamed from: g */
    public int f13387g;

    /* renamed from: h */
    public String f13388h = "";

    /* renamed from: i */
    public boolean f13389i;

    static {
        dkd dkd = new dkd();
        f13379j = dkd;
        GeneratedMessageLite.m124024a(dkd.class, dkd);
    }

    private dkd() {
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
            return GeneratedMessageLite.m124022a(f13379j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004\u001b\u0005င\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bဇ\u0006", new Object[]{"a", "b", "c", "d", "e", dkf.class, "f", "g", dkb.f13378a, "h", "i"});
        } else if (i2 == 3) {
            return new dkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f13379j);
            }
            if (i2 == 5) {
                return f13379j;
            }
            bxxk bxxk = f13380k;
            if (bxxk == null) {
                synchronized (dkd.class) {
                    bxxk = f13380k;
                    if (bxxk == null) {
                        bxxk = new bxve(f13379j);
                        f13380k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo9188a() {
        if (!this.f13385e.mo73666a()) {
            this.f13385e = GeneratedMessageLite.m124021a(this.f13385e);
        }
    }
}
