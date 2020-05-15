package p000;

/* renamed from: abqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqo extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bxvu f57974i = new abqf();

    /* renamed from: r */
    public static final abqo f57975r;

    /* renamed from: s */
    private static volatile bxxk f57976s;

    /* renamed from: a */
    public int f57977a;

    /* renamed from: b */
    public String f57978b = "";

    /* renamed from: c */
    public boolean f57979c = true;

    /* renamed from: d */
    public int f57980d;

    /* renamed from: e */
    public int f57981e = 1;

    /* renamed from: f */
    public boolean f57982f;

    /* renamed from: g */
    public String f57983g = "";

    /* renamed from: h */
    public bxvt f57984h = bxvm.f164965b;

    /* renamed from: j */
    public bxwc f57985j = bxxn.f165040b;

    /* renamed from: k */
    public int f57986k;

    /* renamed from: l */
    public int f57987l;

    /* renamed from: m */
    public String f57988m = "";

    /* renamed from: n */
    public int f57989n = -1;

    /* renamed from: o */
    public int f57990o;

    /* renamed from: p */
    public int f57991p;

    /* renamed from: q */
    public boolean f57992q;

    static {
        abqo abqo = new abqo();
        f57975r = abqo;
        bxvk.m124024a(abqo.class, abqo);
    }

    private abqo() {
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
            return bxvk.m124022a(f57975r, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဋ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007\u001e\bင\u0006\tင\u0007\u000bဈ\b\fင\t\rဌ\n\u000fဌ\u000b\u0010\u001a\u0011ဇ\f", new Object[]{"a", "b", "c", "d", abql.m48077b(), "e", "f", "g", "h", abqn.m48081b(), "k", "l", "m", "n", "o", abqg.f57957a, "p", abqi.f57958a, "j", "q"});
        } else if (i2 == 3) {
            return new abqo();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f57975r;
            }
            bxxk bxxk = f57976s;
            if (bxxk == null) {
                synchronized (abqo.class) {
                    bxxk = f57976s;
                    if (bxxk == null) {
                        bxxk = new bxve(f57975r);
                        f57976s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
