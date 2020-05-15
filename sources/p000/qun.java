package p000;

/* renamed from: qun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qun extends bxvk implements bxxd {

    /* renamed from: n */
    public static final qun f42164n;

    /* renamed from: o */
    private static volatile bxxk f42165o;

    /* renamed from: a */
    public int f42166a;

    /* renamed from: b */
    public String f42167b = "";

    /* renamed from: c */
    public String f42168c = "";

    /* renamed from: d */
    public String f42169d = "";

    /* renamed from: e */
    public String f42170e = "";

    /* renamed from: f */
    public String f42171f = "";

    /* renamed from: g */
    public String f42172g = "";

    /* renamed from: h */
    public boolean f42173h;

    /* renamed from: i */
    public long f42174i;

    /* renamed from: j */
    public boolean f42175j;

    /* renamed from: k */
    public String f42176k = "";

    /* renamed from: l */
    public String f42177l = "";

    /* renamed from: m */
    public String f42178m = "";

    static {
        qun qun = new qun();
        f42164n = qun;
        bxvk.m124024a(qun.class, qun);
    }

    private qun() {
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
            return bxvk.m124022a(f42164n, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\u000bဂ\n\fဇ\u000b\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new qun();
        } else {
            if (i2 == 4) {
                return new bxvd(f42164n);
            }
            if (i2 == 5) {
                return f42164n;
            }
            bxxk bxxk = f42165o;
            if (bxxk == null) {
                synchronized (qun.class) {
                    bxxk = f42165o;
                    if (bxxk == null) {
                        bxxk = new bxve(f42164n);
                        f42165o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
