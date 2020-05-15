package p000;

/* renamed from: bzpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzpj f170911d;

    /* renamed from: e */
    private static volatile bxxk f170912e;

    /* renamed from: a */
    public int f170913a;

    /* renamed from: b */
    public String f170914b = "";

    /* renamed from: c */
    public String f170915c = "";

    static {
        bzpj bzpj = new bzpj();
        f170911d = bzpj;
        GeneratedMessageLite.m124024a(bzpj.class, bzpj);
    }

    private bzpj() {
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
            return GeneratedMessageLite.m124022a(f170911d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzpj();
        } else {
            if (i2 == 4) {
                return new bxvd(f170911d);
            }
            if (i2 == 5) {
                return f170911d;
            }
            bxxk bxxk = f170912e;
            if (bxxk == null) {
                synchronized (bzpj.class) {
                    bxxk = f170912e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170911d);
                        f170912e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
