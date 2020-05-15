package p000;

/* renamed from: bylk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylk extends bxvk implements bxxd {

    /* renamed from: n */
    public static final bylk f166853n;

    /* renamed from: p */
    private static volatile bxxk f166854p;

    /* renamed from: a */
    public int f166855a;

    /* renamed from: b */
    public String f166856b = "";

    /* renamed from: c */
    public String f166857c = "";

    /* renamed from: d */
    public String f166858d = "";

    /* renamed from: e */
    public String f166859e = "";

    /* renamed from: f */
    public String f166860f = "";

    /* renamed from: g */
    public int f166861g;

    /* renamed from: h */
    public String f166862h = "";

    /* renamed from: i */
    public String f166863i = "";

    /* renamed from: j */
    public String f166864j = "";

    /* renamed from: k */
    public String f166865k = "";

    /* renamed from: l */
    public String f166866l = "";

    /* renamed from: m */
    public String f166867m = "";

    /* renamed from: o */
    private byte f166868o = 2;

    static {
        bylk bylk = new bylk();
        f166853n = bylk;
        bxvk.m124024a(bylk.class, bylk);
    }

    private bylk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f166868o);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f166868o = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f166853n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0005\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i2 == 3) {
            return new bylk();
        } else {
            if (i2 == 4) {
                return new bxvd(f166853n);
            }
            if (i2 == 5) {
                return f166853n;
            }
            bxxk bxxk = f166854p;
            if (bxxk == null) {
                synchronized (bylk.class) {
                    bxxk = f166854p;
                    if (bxxk == null) {
                        bxxk = new bxve(f166853n);
                        f166854p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
