package p000;

/* renamed from: msl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msl extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final msl f34558g;

    /* renamed from: h */
    private static volatile bxxk f34559h;

    /* renamed from: a */
    public int f34560a;

    /* renamed from: b */
    public int f34561b;

    /* renamed from: c */
    public int f34562c;

    /* renamed from: d */
    public int f34563d;

    /* renamed from: e */
    public int f34564e;

    /* renamed from: f */
    public int f34565f;

    static {
        msl msl = new msl();
        f34558g = msl;
        GeneratedMessageLite.m124024a(msl.class, msl);
    }

    private msl() {
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
            return GeneratedMessageLite.m124022a(f34558g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", msk.m25579b(), "c", msi.f34543a, "d", mqi.f34230a, "e", "f"});
        } else if (i2 == 3) {
            return new msl();
        } else {
            if (i2 == 4) {
                return new bxvd(f34558g);
            }
            if (i2 == 5) {
                return f34558g;
            }
            bxxk bxxk = f34559h;
            if (bxxk == null) {
                synchronized (msl.class) {
                    bxxk = f34559h;
                    if (bxxk == null) {
                        bxxk = new bxve(f34558g);
                        f34559h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
