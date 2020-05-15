package p000;

/* renamed from: mpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mpn f34188e;

    /* renamed from: f */
    private static volatile bxxk f34189f;

    /* renamed from: a */
    public int f34190a;

    /* renamed from: b */
    public int f34191b;

    /* renamed from: c */
    public String f34192c = "";

    /* renamed from: d */
    public int f34193d;

    static {
        mpn mpn = new mpn();
        f34188e = mpn;
        GeneratedMessageLite.m124024a(mpn.class, mpn);
    }

    private mpn() {
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
            return GeneratedMessageLite.m124022a(f34188e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new mpn();
        } else {
            if (i2 == 4) {
                return new bxvd(f34188e);
            }
            if (i2 == 5) {
                return f34188e;
            }
            bxxk bxxk = f34189f;
            if (bxxk == null) {
                synchronized (mpn.class) {
                    bxxk = f34189f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34188e);
                        f34189f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
