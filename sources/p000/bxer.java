package p000;

/* renamed from: bxer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxer extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxer f163118d;

    /* renamed from: f */
    private static volatile bxxk f163119f;

    /* renamed from: a */
    public int f163120a;

    /* renamed from: b */
    public long f163121b;

    /* renamed from: c */
    public long f163122c;

    /* renamed from: e */
    private int f163123e;

    static {
        bxer bxer = new bxer();
        f163118d = bxer;
        bxvk.m124024a(bxer.class, bxer);
    }

    private bxer() {
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
            return bxvk.m124022a(f163118d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဂ\u0001\u0004ဂ\u0002", new Object[]{"e", "a", bxep.f163117a, "b", "c"});
        } else if (i2 == 3) {
            return new bxer();
        } else {
            if (i2 == 4) {
                return new bxvd(f163118d);
            }
            if (i2 == 5) {
                return f163118d;
            }
            bxxk bxxk = f163119f;
            if (bxxk == null) {
                synchronized (bxer.class) {
                    bxxk = f163119f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163118d);
                        f163119f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
