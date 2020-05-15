package p000;

/* renamed from: aaii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaii extends bxvk implements bxxd {

    /* renamed from: f */
    public static final aaii f28175f;

    /* renamed from: g */
    private static volatile bxxk f28176g;

    /* renamed from: a */
    public int f28177a;

    /* renamed from: b */
    public bxtx f28178b = bxtx.f164797b;

    /* renamed from: c */
    public int f28179c;

    /* renamed from: d */
    public int f28180d;

    /* renamed from: e */
    public long f28181e;

    static {
        aaii aaii = new aaii();
        f28175f = aaii;
        bxvk.m124024a(aaii.class, aaii);
    }

    private aaii() {
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
            return bxvk.m124022a(f28175f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003င\u0002\u0004ဃ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aaii();
        } else {
            if (i2 == 4) {
                return new bxvd(f28175f);
            }
            if (i2 == 5) {
                return f28175f;
            }
            bxxk bxxk = f28176g;
            if (bxxk == null) {
                synchronized (aaii.class) {
                    bxxk = f28176g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28175f);
                        f28176g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
