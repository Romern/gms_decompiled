package p000;

/* renamed from: brdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdf extends bxvk implements bxxd {

    /* renamed from: f */
    public static final brdf f142500f;

    /* renamed from: g */
    private static volatile bxxk f142501g;

    /* renamed from: a */
    public int f142502a;

    /* renamed from: b */
    public brak f142503b;

    /* renamed from: c */
    public int f142504c;

    /* renamed from: d */
    public String f142505d = "";

    /* renamed from: e */
    public String f142506e = "";

    static {
        brdf brdf = new brdf();
        f142500f = brdf;
        bxvk.m124024a(brdf.class, brdf);
    }

    private brdf() {
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
            return bxvk.m124022a(f142500f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", brcj.f142386a, "d", "e"});
        } else if (i2 == 3) {
            return new brdf();
        } else {
            if (i2 == 4) {
                return new bxvd(f142500f);
            }
            if (i2 == 5) {
                return f142500f;
            }
            bxxk bxxk = f142501g;
            if (bxxk == null) {
                synchronized (brdf.class) {
                    bxxk = f142501g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142500f);
                        f142501g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
