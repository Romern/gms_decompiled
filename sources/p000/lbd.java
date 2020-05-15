package p000;

/* renamed from: lbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbd extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final lbd f25694g;

    /* renamed from: h */
    private static volatile bxxk f25695h;

    /* renamed from: a */
    public int f25696a;

    /* renamed from: b */
    public bxvt f25697b = bxvm.f164965b;

    /* renamed from: c */
    public int f25698c;

    /* renamed from: d */
    public int f25699d;

    /* renamed from: e */
    public int f25700e;

    /* renamed from: f */
    public int f25701f;

    static {
        lbd lbd = new lbd();
        f25694g = lbd;
        GeneratedMessageLite.m124024a(lbd.class, lbd);
    }

    private lbd() {
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
            return GeneratedMessageLite.m124022a(f25694g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002'\u0003\u0006\u0004\u0004\u0005\u0004\u0006\f", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new lbd();
        } else {
            if (i2 == 4) {
                return new bxvd(f25694g);
            }
            if (i2 == 5) {
                return f25694g;
            }
            bxxk bxxk = f25695h;
            if (bxxk == null) {
                synchronized (lbd.class) {
                    bxxk = f25695h;
                    if (bxxk == null) {
                        bxxk = new bxve(f25694g);
                        f25695h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
