package p000;

/* renamed from: bslp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bslp f144931f;

    /* renamed from: g */
    private static volatile bxxk f144932g;

    /* renamed from: a */
    public int f144933a;

    /* renamed from: b */
    public String f144934b = "me";

    /* renamed from: c */
    public String f144935c = "";

    /* renamed from: d */
    public String f144936d = "";

    /* renamed from: e */
    public int f144937e;

    static {
        bslp bslp = new bslp();
        f144931f = bslp;
        bxvk.m124024a(bslp.class, bslp);
    }

    private bslp() {
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
            return bxvk.m124022a(f144931f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", bsln.f144930a});
        } else if (i2 == 3) {
            return new bslp();
        } else {
            if (i2 == 4) {
                return new bxvd(f144931f);
            }
            if (i2 == 5) {
                return f144931f;
            }
            bxxk bxxk = f144932g;
            if (bxxk == null) {
                synchronized (bslp.class) {
                    bxxk = f144932g;
                    if (bxxk == null) {
                        bxxk = new bxve(f144931f);
                        f144932g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
