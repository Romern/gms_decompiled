package p000;

/* renamed from: bvxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvxr extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvxr f158087f;

    /* renamed from: g */
    private static volatile bxxk f158088g;

    /* renamed from: a */
    public int f158089a;

    /* renamed from: b */
    public long f158090b;

    /* renamed from: c */
    public String f158091c = "";

    /* renamed from: d */
    public String f158092d = "";

    /* renamed from: e */
    public bxtx f158093e = bxtx.f164797b;

    static {
        bvxr bvxr = new bvxr();
        f158087f = bvxr;
        bxvk.m124024a(bvxr.class, bvxr);
    }

    private bvxr() {
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
            return bxvk.m124022a(f158087f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bvxr();
        } else {
            if (i2 == 4) {
                return new bxvd(f158087f);
            }
            if (i2 == 5) {
                return f158087f;
            }
            bxxk bxxk = f158088g;
            if (bxxk == null) {
                synchronized (bvxr.class) {
                    bxxk = f158088g;
                    if (bxxk == null) {
                        bxxk = new bxve(f158087f);
                        f158088g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
