package p000;

/* renamed from: bznt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxvu f170756d = new bzns();

    /* renamed from: f */
    public static final bznt f170757f;

    /* renamed from: g */
    private static volatile bxxk f170758g;

    /* renamed from: a */
    public bxvs f170759a = bxuz.f164939b;

    /* renamed from: b */
    public bxvs f170760b = bxuz.f164939b;

    /* renamed from: c */
    public bxvt f170761c = bxvm.f164965b;

    /* renamed from: e */
    public bxvs f170762e = bxuz.f164939b;

    static {
        bznt bznt = new bznt();
        f170757f = bznt;
        bxvk.m124024a(bznt.class, bznt);
    }

    private bznt() {
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
            return bxvk.m124022a(f170757f, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001$\u0002$\u0003,\u0004$", new Object[]{"a", "b", "c", bznr.m125966b(), "e"});
        } else if (i2 == 3) {
            return new bznt();
        } else {
            if (i2 == 4) {
                return new bxvd(f170757f);
            }
            if (i2 == 5) {
                return f170757f;
            }
            bxxk bxxk = f170758g;
            if (bxxk == null) {
                synchronized (bznt.class) {
                    bxxk = f170758g;
                    if (bxxk == null) {
                        bxxk = new bxve(f170757f);
                        f170758g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
