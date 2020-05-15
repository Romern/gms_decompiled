package p000;

/* renamed from: cacs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacs extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cacs f172612f;

    /* renamed from: h */
    private static volatile bxxk f172613h;

    /* renamed from: a */
    public int f172614a;

    /* renamed from: b */
    public String f172615b = "";

    /* renamed from: c */
    public long f172616c;

    /* renamed from: d */
    public cacm f172617d;

    /* renamed from: e */
    public cack f172618e;

    /* renamed from: g */
    private byte f172619g = 2;

    static {
        cacs cacs = new cacs();
        f172612f = cacs;
        GeneratedMessageLite.m124024a(cacs.class, cacs);
    }

    private cacs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f172619g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f172619g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f172612f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cacs();
        } else {
            if (i2 == 4) {
                return new bxvd(f172612f);
            }
            if (i2 == 5) {
                return f172612f;
            }
            bxxk bxxk = f172613h;
            if (bxxk == null) {
                synchronized (cacs.class) {
                    bxxk = f172613h;
                    if (bxxk == null) {
                        bxxk = new bxve(f172612f);
                        f172613h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
