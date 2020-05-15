package p000;

/* renamed from: bzdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdq extends bxvk implements bxxd {

    /* renamed from: s */
    public static final bzdq f169536s;

    /* renamed from: t */
    private static volatile bxxk f169537t;

    /* renamed from: a */
    public int f169538a;

    /* renamed from: b */
    public long f169539b;

    /* renamed from: c */
    public String f169540c = "";

    /* renamed from: d */
    public String f169541d = "";

    /* renamed from: e */
    public String f169542e = "";

    /* renamed from: f */
    public String f169543f = "";

    /* renamed from: g */
    public int f169544g;

    /* renamed from: h */
    public long f169545h;

    /* renamed from: i */
    public long f169546i;

    /* renamed from: j */
    public bzdr f169547j;

    /* renamed from: k */
    public bxvw f169548k = bxwq.f165002b;

    /* renamed from: l */
    public boolean f169549l;

    /* renamed from: m */
    public boolean f169550m;

    /* renamed from: n */
    public boolean f169551n;

    /* renamed from: o */
    public bzds f169552o;

    /* renamed from: p */
    public String f169553p = "";

    /* renamed from: q */
    public boolean f169554q;

    /* renamed from: r */
    public bxwc f169555r = bxxn.f165040b;

    static {
        bzdq bzdq = new bzdq();
        f169536s = bzdq;
        bxvk.m124024a(bzdq.class, bzdq);
    }

    private bzdq() {
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
            return bxvk.m124022a(f169536s, "\u0001\u0011\u0000\u0001\u0001\u0017\u0011\u0000\u0002\u0000\u0001ဂ\u0000\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\bဈ\u0007\nဌ\t\u000bဃ\n\fဃ\u000b\u000eဉ\r\u000f\u0014\u0010ဇ\u000e\u0011ဇ\u000f\u0012ဇ\u0010\u0013ဉ\u0011\u0014ဈ\u0012\u0015ဇ\u0013\u0017\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", bzdp.f169535a, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", bzcr.class});
        } else if (i2 == 3) {
            return new bzdq();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f169536s;
            }
            bxxk bxxk = f169537t;
            if (bxxk == null) {
                synchronized (bzdq.class) {
                    bxxk = f169537t;
                    if (bxxk == null) {
                        bxxk = new bxve(f169536s);
                        f169537t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
