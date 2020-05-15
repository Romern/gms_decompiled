package p000;

/* renamed from: bpbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpbr extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpbr f135616f;

    /* renamed from: g */
    private static volatile bxxk f135617g;

    /* renamed from: a */
    public int f135618a;

    /* renamed from: b */
    public String f135619b = "";

    /* renamed from: c */
    public int f135620c;

    /* renamed from: d */
    public boolean f135621d;

    /* renamed from: e */
    public String f135622e = "";

    static {
        bpbr bpbr = new bpbr();
        f135616f = bpbr;
        bxvk.m124024a(bpbr.class, bpbr);
    }

    private bpbr() {
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
            return bxvk.m124022a(f135616f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", "c", bpbs.f135623a, "d", "e"});
        } else if (i2 == 3) {
            return new bpbr();
        } else {
            if (i2 == 4) {
                return new bxvd(f135616f);
            }
            if (i2 == 5) {
                return f135616f;
            }
            bxxk bxxk = f135617g;
            if (bxxk == null) {
                synchronized (bpbr.class) {
                    bxxk = f135617g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135616f);
                        f135617g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
