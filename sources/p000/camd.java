package p000;

/* renamed from: camd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camd extends bxvk implements bxxd {

    /* renamed from: n */
    public static final camd f175245n;

    /* renamed from: o */
    private static volatile bxxk f175246o;

    /* renamed from: a */
    public int f175247a;

    /* renamed from: b */
    public String f175248b = "";

    /* renamed from: c */
    public String f175249c = "";

    /* renamed from: d */
    public String f175250d = "";

    /* renamed from: e */
    public long f175251e;

    /* renamed from: f */
    public String f175252f = "";

    /* renamed from: g */
    public int f175253g;

    /* renamed from: h */
    public String f175254h = "";

    /* renamed from: i */
    public String f175255i = "";

    /* renamed from: j */
    public String f175256j = "";

    /* renamed from: k */
    public String f175257k = "";

    /* renamed from: l */
    public bxwc f175258l = bxxn.f165040b;

    /* renamed from: m */
    public String f175259m = "";

    static {
        camd camd = new camd();
        f175245n = camd;
        bxvk.m124024a(camd.class, camd);
    }

    private camd() {
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
            return bxvk.m124022a(f175245n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0006ဈ\u0007\u0007ဈ\b\bဈ\t\tဈ\n\n\u001b\u000bင\u0006\fဈ\u0005\rဈ\u000b", new Object[]{"a", "b", "c", "d", "e", "h", "i", "j", "k", "l", camc.class, "g", "f", "m"});
        } else if (i2 == 3) {
            return new camd();
        } else {
            if (i2 == 4) {
                return new bxvd(f175245n);
            }
            if (i2 == 5) {
                return f175245n;
            }
            bxxk bxxk = f175246o;
            if (bxxk == null) {
                synchronized (camd.class) {
                    bxxk = f175246o;
                    if (bxxk == null) {
                        bxxk = new bxve(f175245n);
                        f175246o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
