package p000;

/* renamed from: bvkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvkd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvkd f156387e;

    /* renamed from: f */
    private static volatile bxxk f156388f;

    /* renamed from: a */
    public String f156389a = "";

    /* renamed from: b */
    public String f156390b = "";

    /* renamed from: c */
    public bxwc f156391c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f156392d = bxxn.f165040b;

    static {
        bvkd bvkd = new bvkd();
        f156387e = bvkd;
        bxvk.m124024a(bvkd.class, bvkd);
    }

    private bvkd() {
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
            return bxvk.m124022a(f156387e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", bvkc.class, "d", bvke.class});
        } else if (i2 == 3) {
            return new bvkd();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f156387e;
            }
            bxxk bxxk = f156388f;
            if (bxxk == null) {
                synchronized (bvkd.class) {
                    bxxk = f156388f;
                    if (bxxk == null) {
                        bxxk = new bxve(f156387e);
                        f156388f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73378a() {
        if (!this.f156391c.mo73666a()) {
            this.f156391c = bxvk.m124021a(this.f156391c);
        }
    }
}
