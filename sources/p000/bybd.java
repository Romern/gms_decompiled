package p000;

/* renamed from: bybd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bybd f165467g;

    /* renamed from: h */
    private static volatile bxxk f165468h;

    /* renamed from: a */
    public int f165469a;

    /* renamed from: b */
    public double f165470b;

    /* renamed from: c */
    public double f165471c;

    /* renamed from: d */
    public double f165472d;

    /* renamed from: e */
    public double f165473e;

    /* renamed from: f */
    public long f165474f;

    static {
        bybd bybd = new bybd();
        f165467g = bybd;
        bxvk.m124024a(bybd.class, bybd);
    }

    private bybd() {
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
            return bxvk.m124022a(f165467g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bybd();
        } else {
            if (i2 == 4) {
                return new bxvd(f165467g);
            }
            if (i2 == 5) {
                return f165467g;
            }
            bxxk bxxk = f165468h;
            if (bxxk == null) {
                synchronized (bybd.class) {
                    bxxk = f165468h;
                    if (bxxk == null) {
                        bxxk = new bxve(f165467g);
                        f165468h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
