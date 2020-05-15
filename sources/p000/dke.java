package p000;

/* renamed from: dke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dke extends bxvk implements bxxd {

    /* renamed from: f */
    public static final dke f13390f;

    /* renamed from: g */
    private static volatile bxxk f13391g;

    /* renamed from: a */
    public int f13392a;

    /* renamed from: b */
    public int f13393b;

    /* renamed from: c */
    public bxwc f13394c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f13395d = bxxn.f165040b;

    /* renamed from: e */
    public int f13396e;

    static {
        dke dke = new dke();
        f13390f = dke;
        bxvk.m124024a(dke.class, dke);
    }

    private dke() {
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
            return bxvk.m124022a(f13390f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"a", "b", "c", dkd.class, "d", dkf.class, "e"});
        } else if (i2 == 3) {
            return new dke();
        } else {
            if (i2 == 4) {
                return new bxvd(f13390f);
            }
            if (i2 == 5) {
                return f13390f;
            }
            bxxk bxxk = f13391g;
            if (bxxk == null) {
                synchronized (dke.class) {
                    bxxk = f13391g;
                    if (bxxk == null) {
                        bxxk = new bxve(f13390f);
                        f13391g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo9190b() {
        if (!this.f13395d.mo73666a()) {
            this.f13395d = bxvk.m124021a(this.f13395d);
        }
    }

    /* renamed from: a */
    public final void mo9189a() {
        if (!this.f13394c.mo73666a()) {
            this.f13394c = bxvk.m124021a(this.f13394c);
        }
    }
}
