package p000;

/* renamed from: bpby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpby extends bxvg implements bxvh {

    /* renamed from: j */
    public static final bpby f135681j;

    /* renamed from: n */
    private static volatile bxxk f135682n;

    /* renamed from: a */
    public int f135683a;

    /* renamed from: b */
    public int f135684b = -1;

    /* renamed from: c */
    public int f135685c = -1;

    /* renamed from: d */
    public int f135686d;

    /* renamed from: e */
    public int f135687e;

    /* renamed from: f */
    public int f135688f;

    /* renamed from: g */
    public int f135689g = -1;

    /* renamed from: h */
    public bxwc f135690h = bxxn.f165040b;

    /* renamed from: i */
    public bokh f135691i;

    /* renamed from: k */
    private bptu f135692k;

    /* renamed from: l */
    private byte f135693l = 2;

    static {
        bpby bpby = new bpby();
        f135681j = bpby;
        bxvk.m124024a(bpby.class, bpby);
    }

    private bpby() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f135693l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f135693l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f135681j, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\u0003\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bpcb.class, "i", "k"});
        } else if (i2 == 3) {
            return new bpby();
        } else {
            if (i2 == 4) {
                return new bxvf(f135681j);
            }
            if (i2 == 5) {
                return f135681j;
            }
            bxxk bxxk = f135682n;
            if (bxxk == null) {
                synchronized (bpby.class) {
                    bxxk = f135682n;
                    if (bxxk == null) {
                        bxxk = new bxve(f135681j);
                        f135682n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
