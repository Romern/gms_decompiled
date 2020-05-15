package p000;

/* renamed from: bvem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvem extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bvem f155753g;

    /* renamed from: h */
    private static volatile bxxk f155754h;

    /* renamed from: a */
    public int f155755a;

    /* renamed from: b */
    public long f155756b;

    /* renamed from: c */
    public int f155757c;

    /* renamed from: d */
    public bxwc f155758d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f155759e = bxxn.f165040b;

    /* renamed from: f */
    public int f155760f;

    static {
        bvem bvem = new bvem();
        f155753g = bvem;
        bxvk.m124024a(bvem.class, bvem);
    }

    private bvem() {
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
            return bxvk.m124022a(f155753g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002", new Object[]{"a", "b", "c", bvif.m121137b(), "d", bven.class, "e", bven.class, "f", bvib.f156127a});
        } else if (i2 == 3) {
            return new bvem();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f155753g;
            }
            bxxk bxxk = f155754h;
            if (bxxk == null) {
                synchronized (bvem.class) {
                    bxxk = f155754h;
                    if (bxxk == null) {
                        bxxk = new bxve(f155753g);
                        f155754h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo73361b() {
        if (!this.f155759e.mo73666a()) {
            this.f155759e = bxvk.m124021a(this.f155759e);
        }
    }

    /* renamed from: a */
    public final void mo73360a() {
        if (!this.f155758d.mo73666a()) {
            this.f155758d = bxvk.m124021a(this.f155758d);
        }
    }
}
