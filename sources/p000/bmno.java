package p000;

/* renamed from: bmno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmno extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bmno f130138m;

    /* renamed from: n */
    private static volatile bxxk f130139n;

    /* renamed from: a */
    public int f130140a;

    /* renamed from: b */
    public long f130141b;

    /* renamed from: c */
    public String f130142c = "";

    /* renamed from: d */
    public bxwc f130143d = bxxn.f165040b;

    /* renamed from: e */
    public bmkz f130144e;

    /* renamed from: f */
    public int f130145f;

    /* renamed from: g */
    public int f130146g;

    /* renamed from: h */
    public int f130147h;

    /* renamed from: i */
    public int f130148i;

    /* renamed from: j */
    public String f130149j = "";

    /* renamed from: k */
    public boolean f130150k;

    /* renamed from: l */
    public bmnu f130151l;

    static {
        bmno bmno = new bmno();
        f130138m = bmno;
        GeneratedMessageLite.m124024a(bmno.class, bmno);
    }

    private bmno() {
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
            return GeneratedMessageLite.m124022a(f130138m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0001\u0000\u0001ဈ\u0001\u0003ဈ\b\u0004င\u0006\u0005င\u0007\u0006ဇ\t\u0007ဂ\u0000\t\u001a\u000bင\u0004\fင\u0005\rဉ\n\u000eဉ\u0003", new Object[]{"a", "c", "j", "h", "i", "k", "b", "d", "f", "g", "l", "e"});
        } else if (i2 == 3) {
            return new bmno();
        } else {
            if (i2 == 4) {
                return new bxvd(f130138m);
            }
            if (i2 == 5) {
                return f130138m;
            }
            bxxk bxxk = f130139n;
            if (bxxk == null) {
                synchronized (bmno.class) {
                    bxxk = f130139n;
                    if (bxxk == null) {
                        bxxk = new bxve(f130138m);
                        f130139n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
