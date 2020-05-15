package p000;

/* renamed from: bzpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpk extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bzpk f170916n;

    /* renamed from: o */
    private static volatile bxxk f170917o;

    /* renamed from: a */
    public int f170918a;

    /* renamed from: b */
    public String f170919b = "";

    /* renamed from: c */
    public String f170920c = "";

    /* renamed from: d */
    public int f170921d;

    /* renamed from: e */
    public bxwc f170922e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f170923f = bxxn.f165040b;

    /* renamed from: g */
    public String f170924g = "";

    /* renamed from: h */
    public String f170925h = "";

    /* renamed from: i */
    public String f170926i = "";

    /* renamed from: j */
    public int f170927j;

    /* renamed from: k */
    public String f170928k = "";

    /* renamed from: l */
    public int f170929l;

    /* renamed from: m */
    public abeo f170930m;

    static {
        bzpk bzpk = new bzpk();
        f170916n = bzpk;
        GeneratedMessageLite.m124024a(bzpk.class, bzpk);
    }

    private bzpk() {
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
            return GeneratedMessageLite.m124022a(f170916n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0005\u001b\u0006\u001b\u0007ဈ\u0004\bဈ\u0005\tဈ\u0006\nင\u0007\u000bဈ\b\rဌ\n\fဉ\u000b", new Object[]{"a", "b", "c", "d", bzph.f170909a, "e", bzpj.class, "f", bzpj.class, "g", "h", "i", "j", "k", "l", bzpi.f170910a, "m"});
        } else if (i2 == 3) {
            return new bzpk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f170916n;
            }
            bxxk bxxk = f170917o;
            if (bxxk == null) {
                synchronized (bzpk.class) {
                    bxxk = f170917o;
                    if (bxxk == null) {
                        bxxk = new bxve(f170916n);
                        f170917o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
