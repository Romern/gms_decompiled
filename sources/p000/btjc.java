package p000;

/* renamed from: btjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjc extends bxvk implements bxxd {

    /* renamed from: s */
    public static final btjc f149080s;

    /* renamed from: t */
    private static volatile bxxk f149081t;

    /* renamed from: a */
    public String f149082a = "";

    /* renamed from: b */
    public String f149083b = "";

    /* renamed from: c */
    public String f149084c = "";

    /* renamed from: d */
    public String f149085d = "";

    /* renamed from: e */
    public String f149086e = "";

    /* renamed from: f */
    public String f149087f = "";

    /* renamed from: g */
    public String f149088g = "";

    /* renamed from: h */
    public String f149089h = "";

    /* renamed from: i */
    public btix f149090i;

    /* renamed from: j */
    public String f149091j = "";

    /* renamed from: k */
    public String f149092k = "";

    /* renamed from: l */
    public long f149093l;

    /* renamed from: m */
    public btix f149094m;

    /* renamed from: n */
    public String f149095n = "";

    /* renamed from: o */
    public String f149096o = "";

    /* renamed from: p */
    public String f149097p = "";

    /* renamed from: q */
    public String f149098q = "";

    /* renamed from: r */
    public int f149099r;

    static {
        btjc btjc = new btjc();
        f149080s = btjc;
        bxvk.m124024a(btjc.class, btjc);
    }

    private btjc() {
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
            return bxvk.m124022a(f149080s, "\u0000\u0012\u0000\u0000\u0002\u0014\u0012\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\n\t\u000bȈ\fȈ\r\u0002\u000e\t\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
        } else if (i2 == 3) {
            return new btjc();
        } else {
            if (i2 == 4) {
                return new bxvd(f149080s);
            }
            if (i2 == 5) {
                return f149080s;
            }
            bxxk bxxk = f149081t;
            if (bxxk == null) {
                synchronized (btjc.class) {
                    bxxk = f149081t;
                    if (bxxk == null) {
                        bxxk = new bxve(f149080s);
                        f149081t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
