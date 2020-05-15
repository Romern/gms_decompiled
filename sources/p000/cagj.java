package p000;

/* renamed from: cagj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cagj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cagj f173117d;

    /* renamed from: e */
    private static volatile bxxk f173118e;

    /* renamed from: a */
    public int f173119a;

    /* renamed from: b */
    public String f173120b = "";

    /* renamed from: c */
    public String f173121c = "";

    static {
        cagj cagj = new cagj();
        f173117d = cagj;
        GeneratedMessageLite.m124024a(cagj.class, cagj);
    }

    private cagj() {
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
            return GeneratedMessageLite.m124022a(f173117d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cagj();
        } else {
            if (i2 == 4) {
                return new bxvd(f173117d);
            }
            if (i2 == 5) {
                return f173117d;
            }
            bxxk bxxk = f173118e;
            if (bxxk == null) {
                synchronized (cagj.class) {
                    bxxk = f173118e;
                    if (bxxk == null) {
                        bxxk = new bxve(f173117d);
                        f173118e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
