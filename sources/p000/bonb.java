package p000;

/* renamed from: bonb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bonb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bonb f133754f;

    /* renamed from: g */
    private static volatile bxxk f133755g;

    /* renamed from: a */
    public int f133756a;

    /* renamed from: b */
    public int f133757b;

    /* renamed from: c */
    public int f133758c;

    /* renamed from: d */
    public int f133759d;

    /* renamed from: e */
    public String f133760e = "";

    static {
        bonb bonb = new bonb();
        f133754f = bonb;
        bxvk.m124024a(bonb.class, bonb);
    }

    private bonb() {
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
            return bxvk.m124022a(f133754f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", adbg.f61239a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bonb();
        } else {
            if (i2 == 4) {
                return new bxvd(f133754f);
            }
            if (i2 == 5) {
                return f133754f;
            }
            bxxk bxxk = f133755g;
            if (bxxk == null) {
                synchronized (bonb.class) {
                    bxxk = f133755g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133754f);
                        f133755g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
