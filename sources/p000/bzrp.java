package p000;

/* renamed from: bzrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzrp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzrp f171179f;

    /* renamed from: g */
    private static volatile bxxk f171180g;

    /* renamed from: a */
    public String f171181a = "";

    /* renamed from: b */
    public int f171182b;

    /* renamed from: c */
    public int f171183c;

    /* renamed from: d */
    public int f171184d;

    /* renamed from: e */
    public bzro f171185e;

    static {
        bzrp bzrp = new bzrp();
        f171179f = bzrp;
        bxvk.m124024a(bzrp.class, bzrp);
    }

    private bzrp() {
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
            return bxvk.m124022a(f171179f, "\u0000\u0005\u0000\u0000\u0001\t\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004\f\u0005\f\t\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzrp();
        } else {
            if (i2 == 4) {
                return new bxvd(f171179f);
            }
            if (i2 == 5) {
                return f171179f;
            }
            bxxk bxxk = f171180g;
            if (bxxk == null) {
                synchronized (bzrp.class) {
                    bxxk = f171180g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171179f);
                        f171180g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
