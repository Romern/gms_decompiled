package p000;

/* renamed from: ccwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccwy extends bxvk implements bxxd {

    /* renamed from: e */
    public static final ccwy f180132e;

    /* renamed from: g */
    private static volatile bxxk f180133g;

    /* renamed from: a */
    public int f180134a;

    /* renamed from: b */
    public int f180135b;

    /* renamed from: c */
    public String f180136c = "";

    /* renamed from: d */
    public long f180137d;

    /* renamed from: f */
    private int f180138f;

    static {
        ccwy ccwy = new ccwy();
        f180132e = ccwy;
        bxvk.m124024a(ccwy.class, ccwy);
    }

    private ccwy() {
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
            return bxvk.m124022a(f180132e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new ccwy();
        } else {
            if (i2 == 4) {
                return new bxvd(f180132e);
            }
            if (i2 == 5) {
                return f180132e;
            }
            bxxk bxxk = f180133g;
            if (bxxk == null) {
                synchronized (ccwy.class) {
                    bxxk = f180133g;
                    if (bxxk == null) {
                        bxxk = new bxve(f180132e);
                        f180133g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
