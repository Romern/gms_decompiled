package p000;

/* renamed from: boci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boci extends bxvk implements bxxd {

    /* renamed from: i */
    public static final boci f132549i;

    /* renamed from: j */
    private static volatile bxxk f132550j;

    /* renamed from: a */
    public int f132551a;

    /* renamed from: b */
    public int f132552b;

    /* renamed from: c */
    public int f132553c;

    /* renamed from: d */
    public int f132554d;

    /* renamed from: e */
    public int f132555e;

    /* renamed from: f */
    public int f132556f;

    /* renamed from: g */
    public int f132557g;

    /* renamed from: h */
    public int f132558h;

    static {
        boci boci = new boci();
        f132549i = boci;
        bxvk.m124024a(boci.class, boci);
    }

    private boci() {
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
            return bxvk.m124022a(f132549i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", boch.f132548a, "c", boch.f132548a, "d", boch.f132548a, "e", boch.f132548a, "f", boch.f132548a, "g", boch.f132548a, "h", boch.f132548a});
        } else if (i2 == 3) {
            return new boci();
        } else {
            if (i2 == 4) {
                return new bxvd(f132549i);
            }
            if (i2 == 5) {
                return f132549i;
            }
            bxxk bxxk = f132550j;
            if (bxxk == null) {
                synchronized (boci.class) {
                    bxxk = f132550j;
                    if (bxxk == null) {
                        bxxk = new bxve(f132549i);
                        f132550j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
