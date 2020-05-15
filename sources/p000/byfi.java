package p000;

/* renamed from: byfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfi extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final byfi f166018g;

    /* renamed from: h */
    private static volatile bxxk f166019h;

    /* renamed from: a */
    public int f166020a;

    /* renamed from: b */
    public byel f166021b;

    /* renamed from: c */
    public bxwc f166022c = bxxn.f165040b;

    /* renamed from: d */
    public float f166023d;

    /* renamed from: e */
    public int f166024e;

    /* renamed from: f */
    public int f166025f;

    static {
        byfi byfi = new byfi();
        f166018g = byfi;
        GeneratedMessageLite.m124024a(byfi.class, byfi);
    }

    private byfi() {
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
            return GeneratedMessageLite.m124022a(f166018g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", "c", byff.class, "d", "e", byfg.f166016a, "f", byfh.f166017a});
        } else if (i2 == 3) {
            return new byfi();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f166018g;
            }
            bxxk bxxk = f166019h;
            if (bxxk == null) {
                synchronized (byfi.class) {
                    bxxk = f166019h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166018g);
                        f166019h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
