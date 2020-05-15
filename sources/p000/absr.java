package p000;

/* renamed from: absr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class absr extends GeneratedMessageLite implements bxxd {

    /* renamed from: s */
    public static final absr f58134s;

    /* renamed from: t */
    private static volatile bxxk f58135t;

    /* renamed from: a */
    public int f58136a;

    /* renamed from: b */
    public int f58137b;

    /* renamed from: c */
    public String f58138c = "";

    /* renamed from: d */
    public String f58139d = "";

    /* renamed from: e */
    public String f58140e = "";

    /* renamed from: f */
    public String f58141f = "";

    /* renamed from: g */
    public boolean f58142g = true;

    /* renamed from: h */
    public long f58143h;

    /* renamed from: i */
    public long f58144i;

    /* renamed from: j */
    public bxwc f58145j = bxxn.f165040b;

    /* renamed from: k */
    public bxwc f58146k = bxxn.f165040b;

    /* renamed from: l */
    public int f58147l = 1;

    /* renamed from: m */
    public boolean f58148m;

    /* renamed from: n */
    public long f58149n;

    /* renamed from: o */
    public String f58150o = "";

    /* renamed from: p */
    public String f58151p = "";

    /* renamed from: q */
    public String f58152q = "";

    /* renamed from: r */
    public int f58153r;

    static {
        absr absr = new absr();
        f58134s = absr;
        GeneratedMessageLite.m124024a(absr.class, absr);
    }

    private absr() {
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
            return GeneratedMessageLite.m124022a(f58134s, "\u0001\u0011\u0000\u0001\u0001\u0015\u0011\u0000\u0002\u0000\u0001ဈ\u0001\u0002ဈ\u0003\u0004ဈ\u0004\u0006\u001b\u0007\u001b\bင\u0000\tဈ\u0002\nဇ\u0005\u000bဃ\u0006\fင\b\rဇ\t\u000eဂ\n\u000fဃ\u0007\u0010ဈ\u000b\u0011ဈ\f\u0013ဈ\r\u0015ဋ\u000e", new Object[]{"a", "c", "e", "f", "j", abqo.class, "k", abut.class, "b", "d", "g", "h", "l", "m", "n", "i", "o", "p", "q", "r"});
        } else if (i2 == 3) {
            return new absr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f58134s;
            }
            bxxk bxxk = f58135t;
            if (bxxk == null) {
                synchronized (absr.class) {
                    bxxk = f58135t;
                    if (bxxk == null) {
                        bxxk = new bxve(f58134s);
                        f58135t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo32342b() {
        if (!this.f58146k.mo73666a()) {
            this.f58146k = GeneratedMessageLite.m124021a(this.f58146k);
        }
    }

    /* renamed from: a */
    public final void mo32341a() {
        if (!this.f58145j.mo73666a()) {
            this.f58145j = GeneratedMessageLite.m124021a(this.f58145j);
        }
    }
}
