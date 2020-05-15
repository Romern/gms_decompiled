package p000;

/* renamed from: aywt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywt extends bxvg implements bxvh {

    /* renamed from: d */
    public static final aywt f98644d;

    /* renamed from: f */
    private static volatile bxxk f98645f;

    /* renamed from: a */
    public int f98646a;

    /* renamed from: b */
    public int f98647b;

    /* renamed from: c */
    public bxvt f98648c = bxvm.f164965b;

    /* renamed from: e */
    private byte f98649e = 2;

    static {
        aywt aywt = new aywt();
        f98644d = aywt;
        GeneratedMessageLite.m124024a(aywt.class, aywt);
    }

    private aywt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f98649e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f98649e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f98644d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"a", "b", bqbo.m112518b(), "c"});
        } else if (i2 == 3) {
            return new aywt();
        } else {
            if (i2 == 4) {
                return new bxvf(f98644d);
            }
            if (i2 == 5) {
                return f98644d;
            }
            bxxk bxxk = f98645f;
            if (bxxk == null) {
                synchronized (aywt.class) {
                    bxxk = f98645f;
                    if (bxxk == null) {
                        bxxk = new bxve(f98644d);
                        f98645f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
