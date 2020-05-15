package p000;

/* renamed from: bmux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmux extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bmux f130989i;

    /* renamed from: j */
    public static final bxvj f130990j;

    /* renamed from: k */
    private static volatile bxxk f130991k;

    /* renamed from: a */
    public int f130992a;

    /* renamed from: b */
    public int f130993b = 0;

    /* renamed from: c */
    public Object f130994c;

    /* renamed from: d */
    public int f130995d;

    /* renamed from: e */
    public bmuq f130996e;

    /* renamed from: f */
    public String f130997f = "";

    /* renamed from: g */
    public bmun f130998g;

    /* renamed from: h */
    public bmuw f130999h;

    static {
        bmux bmux = new bmux();
        f130989i = bmux;
        bxvk.m124024a(bmux.class, bmux);
        bldd bldd = bldd.f126046a;
        bmux bmux2 = f130989i;
        f130990j = bxvk.m124006a(bldd, bmux2, bmux2, 89755494, bxzf.MESSAGE);
    }

    private bmux() {
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
            return bxvk.m124022a(f130989i, "\u0001\u000f\u0001\u0001\u0001\u0019\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ျ\u0000\u0005ျ\u0000\u0007ဈ\u000e\u000bျ\u0000\fြ\u0000\u000fဉ\u0014\u0011ျ\u0000\u0012ြ\u0000\u0013ျ\u0000\u0014ျ\u0000\u0015ဿ\u0000\u0018ဉ\u0018\u0019ဵ\u0000", new Object[]{"c", "b", "a", "d", bmuo.f130965a, "e", "f", bztu.class, "g", bztv.class, btoc.f149733a, "h"});
        } else if (i2 == 3) {
            return new bmux();
        } else {
            if (i2 == 4) {
                return new bxvd(f130989i);
            }
            if (i2 == 5) {
                return f130989i;
            }
            bxxk bxxk = f130991k;
            if (bxxk == null) {
                synchronized (bmux.class) {
                    bxxk = f130991k;
                    if (bxxk == null) {
                        bxxk = new bxve(f130989i);
                        f130991k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
