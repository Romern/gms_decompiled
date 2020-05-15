package p000;

/* renamed from: ciwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwe extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ciwe f191569f;

    /* renamed from: g */
    private static volatile bxxk f191570g;

    /* renamed from: a */
    public int f191571a;

    /* renamed from: b */
    public bxtx f191572b = bxtx.f164797b;

    /* renamed from: c */
    public int f191573c;

    /* renamed from: d */
    public int f191574d;

    /* renamed from: e */
    public bxtx f191575e = bxtx.f164797b;

    static {
        ciwe ciwe = new ciwe();
        f191569f = ciwe;
        bxvk.m124024a(ciwe.class, ciwe);
    }

    private ciwe() {
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
            return bxvk.m124022a(f191569f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ciwe();
        } else {
            if (i2 == 4) {
                return new bxvd(f191569f);
            }
            if (i2 == 5) {
                return f191569f;
            }
            bxxk bxxk = f191570g;
            if (bxxk == null) {
                synchronized (ciwe.class) {
                    bxxk = f191570g;
                    if (bxxk == null) {
                        bxxk = new bxve(f191569f);
                        f191570g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
