package p000;

/* renamed from: bavd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavd extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bavd f101869m;

    /* renamed from: n */
    private static volatile bxxk f101870n;

    /* renamed from: a */
    public int f101871a;

    /* renamed from: b */
    public bauz f101872b;

    /* renamed from: c */
    public String f101873c = "";

    /* renamed from: d */
    public String f101874d = "";

    /* renamed from: e */
    public int f101875e;

    /* renamed from: f */
    public int f101876f;

    /* renamed from: g */
    public long f101877g;

    /* renamed from: h */
    public long f101878h;

    /* renamed from: i */
    public bavn f101879i;

    /* renamed from: j */
    public bxwc f101880j = bxxn.f165040b;

    /* renamed from: k */
    public int f101881k;

    /* renamed from: l */
    public bxwc f101882l = bxxn.f165040b;

    static {
        bavd bavd = new bavd();
        f101869m = bavd;
        bxvk.m124024a(bavd.class, bavd);
    }

    private bavd() {
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
            return bxvk.m124022a(f101869m, "\u0001\u000b\u0000\u0001\u0001年皤\u000b\u0000\u0002\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\u0005\u0006ဈ\u0002\nင\u0003\u000bဂ\u0006\fဌ\u0004\rဉ\u0007\u0010င\b\u0011\u001b年皤ဉ\u0000", new Object[]{"a", "c", "j", bauy.class, "g", "d", "e", "h", "f", bava.f101868a, "i", "k", "l", bavo.class, "b"});
        } else if (i2 == 3) {
            return new bavd();
        } else {
            if (i2 == 4) {
                return new bavc();
            }
            if (i2 == 5) {
                return f101869m;
            }
            bxxk bxxk = f101870n;
            if (bxxk == null) {
                synchronized (bavd.class) {
                    bxxk = f101870n;
                    if (bxxk == null) {
                        bxxk = new bxve(f101869m);
                        f101870n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
