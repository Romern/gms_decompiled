package p000;

/* renamed from: brdk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brdk extends bxvk implements bxxd {

    /* renamed from: l */
    public static final brdk f142515l;

    /* renamed from: n */
    private static volatile bxxk f142516n;

    /* renamed from: a */
    public int f142517a;

    /* renamed from: b */
    public String f142518b = "";

    /* renamed from: c */
    public brdm f142519c;

    /* renamed from: d */
    public brci f142520d;

    /* renamed from: e */
    public int f142521e;

    /* renamed from: f */
    public long f142522f;

    /* renamed from: g */
    public String f142523g = "";

    /* renamed from: h */
    public String f142524h = "";

    /* renamed from: i */
    public int f142525i;

    /* renamed from: j */
    public int f142526j;

    /* renamed from: k */
    public String f142527k = "";

    /* renamed from: m */
    private byte f142528m = 2;

    static {
        brdk brdk = new brdk();
        f142515l = brdk;
        bxvk.m124024a(brdk.class, brdk);
    }

    private brdk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142528m);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142528m = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142515l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0007ဈ\u0006\bဈ\u0007\tဌ\b\nဌ\t\u000bဈ\n", new Object[]{"a", "b", "c", "d", "e", brcm.m113876b(), "f", "g", "h", "i", brdi.f142514a, "j", brdh.f142513a, "k"});
        } else if (i2 == 3) {
            return new brdk();
        } else {
            if (i2 == 4) {
                return new bxvd(f142515l);
            }
            if (i2 == 5) {
                return f142515l;
            }
            bxxk bxxk = f142516n;
            if (bxxk == null) {
                synchronized (brdk.class) {
                    bxxk = f142516n;
                    if (bxxk == null) {
                        bxxk = new bxve(f142515l);
                        f142516n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
