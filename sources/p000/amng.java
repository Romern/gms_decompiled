package p000;

/* renamed from: amng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amng extends bxvk implements bxxd {

    /* renamed from: p */
    public static final amng f75455p;

    /* renamed from: q */
    private static volatile bxxk f75456q;

    /* renamed from: a */
    public int f75457a;

    /* renamed from: b */
    public int f75458b;

    /* renamed from: c */
    public String f75459c = "";

    /* renamed from: d */
    public int f75460d;

    /* renamed from: e */
    public boolean f75461e;

    /* renamed from: f */
    public String f75462f = "";

    /* renamed from: g */
    public int f75463g;

    /* renamed from: h */
    public String f75464h = "";

    /* renamed from: i */
    public boolean f75465i;

    /* renamed from: j */
    public boolean f75466j;

    /* renamed from: k */
    public boolean f75467k;

    /* renamed from: l */
    public boolean f75468l;

    /* renamed from: m */
    public boolean f75469m;

    /* renamed from: n */
    public String f75470n = "";

    /* renamed from: o */
    public String f75471o = "";

    static {
        amng amng = new amng();
        f75455p = amng;
        bxvk.m124024a(amng.class, amng);
    }

    private amng() {
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
            return bxvk.m124022a(f75455p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000fဈ\u000e\u0010ဈ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new amng();
        } else {
            if (i2 == 4) {
                return new bxvd(f75455p);
            }
            if (i2 == 5) {
                return f75455p;
            }
            bxxk bxxk = f75456q;
            if (bxxk == null) {
                synchronized (amng.class) {
                    bxxk = f75456q;
                    if (bxxk == null) {
                        bxxk = new bxve(f75455p);
                        f75456q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
