package p000;

/* renamed from: bmun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmun extends bxvk implements bxxd {

    /* renamed from: p */
    public static final bmun f130948p;

    /* renamed from: q */
    private static volatile bxxk f130949q;

    /* renamed from: a */
    public int f130950a;

    /* renamed from: b */
    public String f130951b = "";

    /* renamed from: c */
    public String f130952c = "";

    /* renamed from: d */
    public String f130953d = "";

    /* renamed from: e */
    public bmtv f130954e;

    /* renamed from: f */
    public bxwc f130955f = bxxn.f165040b;

    /* renamed from: g */
    public String f130956g = "";

    /* renamed from: h */
    public int f130957h;

    /* renamed from: i */
    public int f130958i;

    /* renamed from: j */
    public int f130959j;

    /* renamed from: k */
    public bmum f130960k;

    /* renamed from: l */
    public boolean f130961l;

    /* renamed from: m */
    public String f130962m = "";

    /* renamed from: n */
    public String f130963n = "";

    /* renamed from: o */
    public String f130964o = "";

    static {
        bmun bmun = new bmun();
        f130948p = bmun;
        bxvk.m124024a(bmun.class, bmun);
    }

    private bmun() {
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
            return bxvk.m124022a(f130948p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004\u001b\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tဉ\b\u000bဇ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u0010ဈ\u0002", new Object[]{"a", "b", "c", "e", "f", bmuc.class, "g", "h", bmuh.f130933a, "i", bmuf.f130932a, "j", bmud.f130931a, "k", "l", "m", "n", "o", "d"});
        } else if (i2 == 3) {
            return new bmun();
        } else {
            if (i2 == 4) {
                return new bxvd(f130948p);
            }
            if (i2 == 5) {
                return f130948p;
            }
            bxxk bxxk = f130949q;
            if (bxxk == null) {
                synchronized (bmun.class) {
                    bxxk = f130949q;
                    if (bxxk == null) {
                        bxxk = new bxve(f130948p);
                        f130949q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
