package p000;

/* renamed from: bzql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzql extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzql f171023f;

    /* renamed from: g */
    private static volatile bxxk f171024g;

    /* renamed from: a */
    public int f171025a;

    /* renamed from: b */
    public int f171026b;

    /* renamed from: c */
    public String f171027c = "";

    /* renamed from: d */
    public bxwc f171028d = bxxn.f165040b;

    /* renamed from: e */
    public boolean f171029e;

    static {
        bzql bzql = new bzql();
        f171023f = bzql;
        bxvk.m124024a(bzql.class, bzql);
    }

    private bzql() {
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
            return bxvk.m124022a(f171023f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဇ\u0002", new Object[]{"a", "b", bzps.m126021b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzql();
        } else {
            if (i2 == 4) {
                return new bxvd(f171023f);
            }
            if (i2 == 5) {
                return f171023f;
            }
            bxxk bxxk = f171024g;
            if (bxxk == null) {
                synchronized (bzql.class) {
                    bxxk = f171024g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171023f);
                        f171024g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
