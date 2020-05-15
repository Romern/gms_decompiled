package p000;

/* renamed from: cbff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbff extends bxvk implements bxxd {

    /* renamed from: t */
    public static final cbff f176892t;

    /* renamed from: u */
    private static volatile bxxk f176893u;

    /* renamed from: a */
    public int f176894a = 0;

    /* renamed from: b */
    public Object f176895b;

    /* renamed from: c */
    public int f176896c = 0;

    /* renamed from: d */
    public Object f176897d;

    /* renamed from: e */
    public int f176898e = 0;

    /* renamed from: f */
    public Object f176899f;

    /* renamed from: g */
    public String f176900g = "";

    /* renamed from: h */
    public long f176901h;

    /* renamed from: i */
    public cbds f176902i;

    /* renamed from: j */
    public cbdl f176903j;

    /* renamed from: k */
    public String f176904k = "";

    /* renamed from: l */
    public int f176905l;

    /* renamed from: m */
    public bxww f176906m = bxww.f165013b;

    /* renamed from: n */
    public String f176907n = "";

    /* renamed from: o */
    public boolean f176908o;

    /* renamed from: p */
    public cbcx f176909p;

    /* renamed from: q */
    public int f176910q;

    /* renamed from: r */
    public int f176911r;

    /* renamed from: s */
    public cbfg f176912s;

    static {
        cbff cbff = new cbff();
        f176892t = cbff;
        bxvk.m124024a(cbff.class, cbff);
    }

    private cbff() {
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
            return bxvk.m124022a(f176892t, "\u0000\u0016\u0003\u0000\u0001\u0016\u0001\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\t\u0004\t\u0005<\u0000\tȈ\n\f\u000b2\fȈ\r\u0007\u000e\t\u000f\f\u0010\f\u0011\te<\u0001f<\u0001g<\u0001h<\u0001i<\u0001j<\u0001k<\u0001<\u0002", new Object[]{"b", "a", "d", "c", "f", "e", "g", "h", "i", "j", cbds.class, "k", "l", "m", cbfe.f176891a, "n", "o", "p", "q", "r", "s", cbfc.class, cbfk.class, cbfh.class, cbfa.class, cbfd.class, cbgf.class, cbfr.class, cbec.class});
        } else if (i2 == 3) {
            return new cbff();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f176892t;
            }
            bxxk bxxk = f176893u;
            if (bxxk == null) {
                synchronized (cbff.class) {
                    bxxk = f176893u;
                    if (bxxk == null) {
                        bxxk = new bxve(f176892t);
                        f176893u = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
