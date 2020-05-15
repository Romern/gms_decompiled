package p000;

/* renamed from: bzmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmt extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzmt f170651e;

    /* renamed from: f */
    private static volatile bxxk f170652f;

    /* renamed from: a */
    public int f170653a;

    /* renamed from: b */
    public boolean f170654b;

    /* renamed from: c */
    public int f170655c;

    /* renamed from: d */
    public String f170656d = "";

    static {
        bzmt bzmt = new bzmt();
        f170651e = bzmt;
        bxvk.m124024a(bzmt.class, bzmt);
    }

    private bzmt() {
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
            return bxvk.m124022a(f170651e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", bzma.f170599a, "d"});
        } else if (i2 == 3) {
            return new bzmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f170651e);
            }
            if (i2 == 5) {
                return f170651e;
            }
            bxxk bxxk = f170652f;
            if (bxxk == null) {
                synchronized (bzmt.class) {
                    bxxk = f170652f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170651e);
                        f170652f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
