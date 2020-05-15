package p000;

/* renamed from: bmie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmie extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final bxvu f129545p = new bmib();

    /* renamed from: r */
    public static final bmie f129546r;

    /* renamed from: s */
    private static volatile bxxk f129547s;

    /* renamed from: a */
    public int f129548a;

    /* renamed from: b */
    public bmdn f129549b;

    /* renamed from: c */
    public String f129550c = "";

    /* renamed from: d */
    public String f129551d = "";

    /* renamed from: e */
    public int f129552e;

    /* renamed from: f */
    public bmno f129553f;

    /* renamed from: g */
    public String f129554g = "";

    /* renamed from: h */
    public String f129555h = "";

    /* renamed from: i */
    public int f129556i;

    /* renamed from: j */
    public int f129557j;

    /* renamed from: k */
    public int f129558k;

    /* renamed from: l */
    public int f129559l;

    /* renamed from: m */
    public bmbr f129560m;

    /* renamed from: n */
    public bmif f129561n;

    /* renamed from: o */
    public bxvt f129562o = bxvm.f164965b;

    /* renamed from: q */
    public bmjh f129563q;

    static {
        bmie bmie = new bmie();
        f129546r = bmie;
        GeneratedMessageLite.m124024a(bmie.class, bmie);
    }

    private bmie() {
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
            return GeneratedMessageLite.m124022a(f129546r, "\u0001\u000f\u0000\u0001\u0002\u0011\u000f\u0000\u0001\u0000\u0002ဈ\u0003\u0003င\u0004\u0004င\b\u0005င\t\u0006င\n\u0007င\u000b\bဈ\u0001\n\u001e\u000bဉ\u0005\fဈ\u0006\rဈ\u0007\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u0000", new Object[]{"a", "d", "e", "i", "j", "k", "l", "c", "o", bmid.m108055b(), "f", "g", "h", "m", "n", "q", "b"});
        } else if (i2 == 3) {
            return new bmie();
        } else {
            if (i2 == 4) {
                return new bxvd(f129546r);
            }
            if (i2 == 5) {
                return f129546r;
            }
            bxxk bxxk = f129547s;
            if (bxxk == null) {
                synchronized (bmie.class) {
                    bxxk = f129547s;
                    if (bxxk == null) {
                        bxxk = new bxve(f129546r);
                        f129547s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
