package p000;

/* renamed from: bmnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnr extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bmnr f130153o;

    /* renamed from: p */
    private static volatile bxxk f130154p;

    /* renamed from: a */
    public int f130155a;

    /* renamed from: b */
    public long f130156b;

    /* renamed from: c */
    public bxwc f130157c = bxxn.f165040b;

    /* renamed from: d */
    public bmnw f130158d;

    /* renamed from: e */
    public String f130159e = "";

    /* renamed from: f */
    public String f130160f = "";

    /* renamed from: g */
    public String f130161g = "";

    /* renamed from: h */
    public int f130162h;

    /* renamed from: i */
    public int f130163i;

    /* renamed from: j */
    public boolean f130164j;

    /* renamed from: k */
    public bmnu f130165k;

    /* renamed from: l */
    public boolean f130166l;

    /* renamed from: m */
    public String f130167m = "";

    /* renamed from: n */
    public int f130168n = 1;

    static {
        bmnr bmnr = new bmnr();
        f130153o = bmnr;
        bxvk.m124024a(bmnr.class, bmnr);
    }

    private bmnr() {
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
            return bxvk.m124022a(f130153o, "\u0001\r\u0000\u0001\u0001\u0014\r\u0000\u0001\u0000\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဂ\u0000\u0005ဌ\u0005\u0006\u001b\bဇ\t\u000bဉ\u0001\fဌ\u0006\u000eဌ\u000b\u000fဇ\u0007\u0011ဈ\n\u0014ဉ\b", new Object[]{"a", "e", "f", "g", "b", "h", bmnp.f130152a, "c", bmno.class, "l", "d", "i", bmnp.f130152a, "n", bmoi.f130235a, "j", "m", "k"});
        } else if (i2 == 3) {
            return new bmnr();
        } else {
            if (i2 == 4) {
                return new bxvd(f130153o);
            }
            if (i2 == 5) {
                return f130153o;
            }
            bxxk bxxk = f130154p;
            if (bxxk == null) {
                synchronized (bmnr.class) {
                    bxxk = f130154p;
                    if (bxxk == null) {
                        bxxk = new bxve(f130153o);
                        f130154p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
