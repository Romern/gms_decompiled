package p000;

/* renamed from: bpvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvi extends bxvk implements bxxd {

    /* renamed from: s */
    public static final bpvi f139343s;

    /* renamed from: t */
    private static volatile bxxk f139344t;

    /* renamed from: a */
    public int f139345a;

    /* renamed from: b */
    public String f139346b = "";

    /* renamed from: c */
    public int f139347c;

    /* renamed from: d */
    public int f139348d;

    /* renamed from: e */
    public long f139349e;

    /* renamed from: f */
    public long f139350f;

    /* renamed from: g */
    public long f139351g;

    /* renamed from: h */
    public long f139352h;

    /* renamed from: i */
    public long f139353i;

    /* renamed from: j */
    public long f139354j;

    /* renamed from: k */
    public long f139355k;

    /* renamed from: l */
    public long f139356l;

    /* renamed from: m */
    public int f139357m;

    /* renamed from: n */
    public int f139358n = -1;

    /* renamed from: o */
    public long f139359o;

    /* renamed from: p */
    public long f139360p;

    /* renamed from: q */
    public long f139361q;

    /* renamed from: r */
    public long f139362r;

    static {
        bpvi bpvi = new bpvi();
        f139343s = bpvi;
        bxvk.m124024a(bpvi.class, bpvi);
    }

    private bpvi() {
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
            return bxvk.m124022a(f139343s, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fင\u000b\rဌ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", bpvg.f139342a, "o", "p", "q", "r"});
        } else if (i2 == 3) {
            return new bpvi();
        } else {
            if (i2 == 4) {
                return new bxvd(f139343s);
            }
            if (i2 == 5) {
                return f139343s;
            }
            bxxk bxxk = f139344t;
            if (bxxk == null) {
                synchronized (bpvi.class) {
                    bxxk = f139344t;
                    if (bxxk == null) {
                        bxxk = new bxve(f139343s);
                        f139344t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
