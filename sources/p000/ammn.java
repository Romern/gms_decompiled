package p000;

/* renamed from: ammn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final ammn f75312h;

    /* renamed from: i */
    private static volatile bxxk f75313i;

    /* renamed from: a */
    public int f75314a;

    /* renamed from: b */
    public int f75315b;

    /* renamed from: c */
    public boolean f75316c;

    /* renamed from: d */
    public int f75317d;

    /* renamed from: e */
    public ammm f75318e;

    /* renamed from: f */
    public int f75319f;

    /* renamed from: g */
    public amml f75320g;

    static {
        ammn ammn = new ammn();
        f75312h = ammn;
        GeneratedMessageLite.m124024a(ammn.class, ammn);
    }

    private ammn() {
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
            return GeneratedMessageLite.m124022a(f75312h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", amkj.f75068a, "c", "d", amkm.f75071a, "e", "f", amkl.f75070a, "g"});
        } else if (i2 == 3) {
            return new ammn();
        } else {
            if (i2 == 4) {
                return new bxvd(f75312h);
            }
            if (i2 == 5) {
                return f75312h;
            }
            bxxk bxxk = f75313i;
            if (bxxk == null) {
                synchronized (ammn.class) {
                    bxxk = f75313i;
                    if (bxxk == null) {
                        bxxk = new bxve(f75312h);
                        f75313i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
