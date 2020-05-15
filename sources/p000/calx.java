package p000;

/* renamed from: calx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calx extends GeneratedMessageLite implements bxxd {

    /* renamed from: v */
    public static final calx f175201v;

    /* renamed from: x */
    private static volatile bxxk f175202x;

    /* renamed from: a */
    public int f175203a;

    /* renamed from: b */
    public int f175204b = 0;

    /* renamed from: c */
    public Object f175205c;

    /* renamed from: d */
    public long f175206d;

    /* renamed from: e */
    public long f175207e;

    /* renamed from: f */
    public calt f175208f;

    /* renamed from: g */
    public String f175209g = "";

    /* renamed from: h */
    public bxwc f175210h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f175211i = bxxn.f165040b;

    /* renamed from: j */
    public int f175212j;

    /* renamed from: k */
    public int f175213k;

    /* renamed from: l */
    public bosx f175214l;

    /* renamed from: m */
    public boolean f175215m;

    /* renamed from: n */
    public boolean f175216n;

    /* renamed from: o */
    public boolean f175217o;

    /* renamed from: p */
    public boolean f175218p;

    /* renamed from: q */
    public bxvt f175219q = bxvm.f164965b;

    /* renamed from: r */
    public boolean f175220r;

    /* renamed from: s */
    public bork f175221s;

    /* renamed from: t */
    public ByteString f175222t = ByteString.f164797b;

    /* renamed from: u */
    public boolean f175223u;

    /* renamed from: w */
    private byte f175224w = 2;

    static {
        calx calx = new calx();
        f175201v = calx;
        GeneratedMessageLite.m124024a(calx.class, calx);
    }

    private calx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f175224w);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f175224w = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f175201v, "\u0001\u001b\u0001\u0001\u0001\u001f\u001b\u0000\u0003\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0003\u0006\u001b\u0007\u001b\bင\u0005\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ဉ\u0011\u0011ဇ\u0012\u0012ဉ\u0002\u0013ဇ\u0013\u0014ဇ\u0014\u0015ဇ\u0015\u0016င\u0006\u0017\u0016\u0018ဇ\u0016\u0019ဉ\u0017\u001aည\u0018\u001bြ\u0000\u001eᐼ\u0000\u001fဇ\u001a", new Object[]{"c", "b", "a", "d", "e", "g", "h", calw.class, "i", calv.class, "j", calz.class, calp.class, calq.class, bomk.class, cals.class, caly.class, boku.class, "l", "m", "f", "n", "o", "p", "k", "q", "r", "s", "t", calr.class, bybn.class, "u"});
        } else if (i2 == 3) {
            return new calx();
        } else {
            if (i2 == 4) {
                return new calu();
            }
            if (i2 == 5) {
                return f175201v;
            }
            bxxk bxxk = f175202x;
            if (bxxk == null) {
                synchronized (calx.class) {
                    bxxk = f175202x;
                    if (bxxk == null) {
                        bxxk = new bxve(f175201v);
                        f175202x = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74662c() {
        if (!this.f175211i.mo73666a()) {
            this.f175211i = GeneratedMessageLite.m124021a(this.f175211i);
        }
    }
}
