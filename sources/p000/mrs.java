package p000;

/* renamed from: mrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mrs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final mrs f34482d;

    /* renamed from: e */
    private static volatile bxxk f34483e;

    /* renamed from: a */
    public int f34484a;

    /* renamed from: b */
    public int f34485b;

    /* renamed from: c */
    public String f34486c = "";

    static {
        mrs mrs = new mrs();
        f34482d = mrs;
        bxvk.m124024a(mrs.class, mrs);
    }

    private mrs() {
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
            return bxvk.m124022a(f34482d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", mrr.f34481a, "c"});
        } else if (i2 == 3) {
            return new mrs();
        } else {
            if (i2 == 4) {
                return new bxvd(f34482d);
            }
            if (i2 == 5) {
                return f34482d;
            }
            bxxk bxxk = f34483e;
            if (bxxk == null) {
                synchronized (mrs.class) {
                    bxxk = f34483e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34482d);
                        f34483e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
