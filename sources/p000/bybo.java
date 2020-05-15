package p000;

/* renamed from: bybo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybo extends bxvk implements bxxd {

    /* renamed from: q */
    public static final bybo f165527q;

    /* renamed from: s */
    private static volatile bxxk f165528s;

    /* renamed from: a */
    public int f165529a;

    /* renamed from: b */
    public long f165530b;

    /* renamed from: c */
    public String f165531c = "";

    /* renamed from: d */
    public String f165532d = "";

    /* renamed from: e */
    public String f165533e = "";

    /* renamed from: f */
    public byaw f165534f;

    /* renamed from: g */
    public bybi f165535g;

    /* renamed from: h */
    public bybj f165536h;

    /* renamed from: i */
    public bybp f165537i;

    /* renamed from: j */
    public bybq f165538j;

    /* renamed from: k */
    public byaq f165539k;

    /* renamed from: l */
    public bybl f165540l;

    /* renamed from: m */
    public bybr f165541m;

    /* renamed from: n */
    public byau f165542n;

    /* renamed from: o */
    public byar f165543o;

    /* renamed from: p */
    public byat f165544p;

    /* renamed from: r */
    private byte f165545r = 2;

    static {
        bybo bybo = new bybo();
        f165527q = bybo;
        bxvk.m124024a(bybo.class, bybo);
    }

    private bybo() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165545r);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165545r = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f165527q, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဉ\u0004\u0003ᐉ\u0005\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဈ\u0001\bဈ\u0002\tဉ\t\nဉ\n\u000bဉ\u000b\fဉ\f\rဉ\r\u000eဉ\u000e\u000fဈ\u0003", new Object[]{"a", "b", "f", "g", "h", "i", "j", "c", "d", "k", "l", "m", "n", "o", "p", "e"});
        } else if (i2 == 3) {
            return new bybo();
        } else {
            if (i2 == 4) {
                return new bxvd(f165527q);
            }
            if (i2 == 5) {
                return f165527q;
            }
            bxxk bxxk = f165528s;
            if (bxxk == null) {
                synchronized (bybo.class) {
                    bxxk = f165528s;
                    if (bxxk == null) {
                        bxxk = new bxve(f165527q);
                        f165528s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
