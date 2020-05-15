package p000;

/* renamed from: bgvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvr extends bxvk implements bxxd {

    /* renamed from: u */
    public static final bgvr f117713u;

    /* renamed from: w */
    private static volatile bxxk f117714w;

    /* renamed from: a */
    public int f117715a;

    /* renamed from: b */
    public bgvu f117716b;

    /* renamed from: c */
    public int f117717c;

    /* renamed from: d */
    public long f117718d;

    /* renamed from: e */
    public float f117719e;

    /* renamed from: f */
    public float f117720f;

    /* renamed from: g */
    public double f117721g;

    /* renamed from: h */
    public float f117722h;

    /* renamed from: i */
    public int f117723i;

    /* renamed from: j */
    public boolean f117724j;

    /* renamed from: k */
    public boolean f117725k;

    /* renamed from: l */
    public String f117726l = "";

    /* renamed from: m */
    public int f117727m;

    /* renamed from: n */
    public bxwc f117728n = bxxn.f165040b;

    /* renamed from: o */
    public bgvj f117729o;

    /* renamed from: p */
    public int f117730p = -1;

    /* renamed from: q */
    public int f117731q = -1;

    /* renamed from: r */
    public long f117732r;

    /* renamed from: s */
    public boolean f117733s;

    /* renamed from: t */
    public float f117734t;

    /* renamed from: v */
    private byte f117735v = 2;

    static {
        bgvr bgvr = new bgvr();
        f117713u = bgvr;
        bxvk.m124024a(bgvr.class, bgvr);
    }

    private bgvr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f117735v);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f117735v = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f117713u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006က\u0005\u0007ခ\u0006\bင\u0007\nဇ\t\u000bဇ\n\fဈ\u000b\rင\f\u000e\u001b\u000fဉ\r\u0010င\u000e\u0011င\u000f\u0012ဂ\u0010\u0013ဇ\u0011\u0014ခ\u0012", new Object[]{"a", "b", "c", bgvq.m100135b(), "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", bgvz.class, "o", "p", "q", "r", "s", "t"});
        } else if (i2 == 3) {
            return new bgvr();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f117713u;
            }
            bxxk bxxk = f117714w;
            if (bxxk == null) {
                synchronized (bgvr.class) {
                    bxxk = f117714w;
                    if (bxxk == null) {
                        bxxk = new bxve(f117713u);
                        f117714w = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
