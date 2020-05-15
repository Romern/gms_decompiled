package p000;

/* renamed from: bveg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bveg extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bveg f155712h;

    /* renamed from: i */
    private static volatile bxxk f155713i;

    /* renamed from: a */
    public int f155714a;

    /* renamed from: b */
    public int f155715b;

    /* renamed from: c */
    public long f155716c;

    /* renamed from: d */
    public int f155717d;

    /* renamed from: e */
    public int f155718e;

    /* renamed from: f */
    public int f155719f;

    /* renamed from: g */
    public int f155720g;

    static {
        bveg bveg = new bveg();
        f155712h = bveg;
        bxvk.m124024a(bveg.class, bveg);
    }

    private bveg() {
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
            return bxvk.m124022a(f155712h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", bvhv.f156122a, "c", "d", bvif.m121137b(), "e", bvif.m121137b(), "f", bvhu.m121124b(), "g", bvhr.f156104a});
        } else if (i2 == 3) {
            return new bveg();
        } else {
            if (i2 == 4) {
                return new bxvd(f155712h);
            }
            if (i2 == 5) {
                return f155712h;
            }
            bxxk bxxk = f155713i;
            if (bxxk == null) {
                synchronized (bveg.class) {
                    bxxk = f155713i;
                    if (bxxk == null) {
                        bxxk = new bxve(f155712h);
                        f155713i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
