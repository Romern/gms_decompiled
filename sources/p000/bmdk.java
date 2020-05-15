package p000;

/* renamed from: bmdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmdk f128817f;

    /* renamed from: g */
    private static volatile bxxk f128818g;

    /* renamed from: a */
    public int f128819a;

    /* renamed from: b */
    public String f128820b = "";

    /* renamed from: c */
    public bxtx f128821c = bxtx.f164797b;

    /* renamed from: d */
    public bmdm f128822d;

    /* renamed from: e */
    public String f128823e = "";

    static {
        bmdk bmdk = new bmdk();
        f128817f = bmdk;
        bxvk.m124024a(bmdk.class, bmdk);
    }

    private bmdk() {
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
            return bxvk.m124022a(f128817f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဈ\u0003\u0003ဈ\u0000\u0004ည\u0001", new Object[]{"a", "d", "e", "b", "c"});
        } else if (i2 == 3) {
            return new bmdk();
        } else {
            if (i2 == 4) {
                return new bxvd(f128817f);
            }
            if (i2 == 5) {
                return f128817f;
            }
            bxxk bxxk = f128818g;
            if (bxxk == null) {
                synchronized (bmdk.class) {
                    bxxk = f128818g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128817f);
                        f128818g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
