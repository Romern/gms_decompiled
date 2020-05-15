package p000;

/* renamed from: bmbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmbd extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bxvu f128524i = new bmax();

    /* renamed from: j */
    public static final bmbd f128525j;

    /* renamed from: k */
    private static volatile bxxk f128526k;

    /* renamed from: a */
    public int f128527a;

    /* renamed from: b */
    public bmdn f128528b;

    /* renamed from: c */
    public bmno f128529c;

    /* renamed from: d */
    public bmno f128530d;

    /* renamed from: e */
    public bxwc f128531e = bxxn.f165040b;

    /* renamed from: f */
    public boolean f128532f;

    /* renamed from: g */
    public int f128533g;

    /* renamed from: h */
    public bxvt f128534h = bxvm.f164965b;

    static {
        bmbd bmbd = new bmbd();
        f128525j = bmbd;
        GeneratedMessageLite.m124024a(bmbd.class, bmbd);
    }

    private bmbd() {
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
            return GeneratedMessageLite.m124022a(f128525j, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဇ\u0003\u0006ဉ\u0002\u0007,\bဌ\u0005", new Object[]{"a", "b", "c", "e", bmaw.class, "f", "d", "h", bmbc.m107856b(), "g", bmay.f128516a});
        } else if (i2 == 3) {
            return new bmbd();
        } else {
            if (i2 == 4) {
                return new bmba();
            }
            if (i2 == 5) {
                return f128525j;
            }
            bxxk bxxk = f128526k;
            if (bxxk == null) {
                synchronized (bmbd.class) {
                    bxxk = f128526k;
                    if (bxxk == null) {
                        bxxk = new bxve(f128525j);
                        f128526k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
