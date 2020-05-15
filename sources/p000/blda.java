package p000;

/* renamed from: blda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blda extends bxvk implements bxxd {

    /* renamed from: t */
    public static final blda f126015t;

    /* renamed from: u */
    private static volatile bxxk f126016u;

    /* renamed from: a */
    public int f126017a;

    /* renamed from: b */
    public int f126018b;

    /* renamed from: c */
    public blcn f126019c;

    /* renamed from: d */
    public String f126020d = "";

    /* renamed from: e */
    public String f126021e = "";

    /* renamed from: f */
    public String f126022f = "";

    /* renamed from: g */
    public String f126023g = "";

    /* renamed from: h */
    public String f126024h = "";

    /* renamed from: i */
    public String f126025i = "";

    /* renamed from: j */
    public String f126026j = "";

    /* renamed from: k */
    public boolean f126027k;

    /* renamed from: l */
    public boolean f126028l = true;

    /* renamed from: m */
    public boolean f126029m = true;

    /* renamed from: n */
    public boolean f126030n;

    /* renamed from: o */
    public blcv f126031o;

    /* renamed from: p */
    public boolean f126032p = true;

    /* renamed from: q */
    public String f126033q = "";

    /* renamed from: r */
    public bxwc f126034r = bxxn.f165040b;

    /* renamed from: s */
    public blcl f126035s;

    static {
        blda blda = new blda();
        f126015t = blda;
        bxvk.m124024a(blda.class, blda);
    }

    private blda() {
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
            return bxvk.m124022a(f126015t, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဉ\r\u000fဇ\u000e\u0010ဈ\u000f\u0011\u001b\u0012ဉ\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", blcz.class, "s"});
        } else if (i2 == 3) {
            return new blda();
        } else {
            if (i2 == 4) {
                return new bxvd(f126015t);
            }
            if (i2 == 5) {
                return f126015t;
            }
            bxxk bxxk = f126016u;
            if (bxxk == null) {
                synchronized (blda.class) {
                    bxxk = f126016u;
                    if (bxxk == null) {
                        bxxk = new bxve(f126015t);
                        f126016u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
