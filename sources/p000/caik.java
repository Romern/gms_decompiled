package p000;

/* renamed from: caik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caik extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final caik f174711o;

    /* renamed from: r */
    private static volatile bxxk f174712r;

    /* renamed from: a */
    public int f174713a;

    /* renamed from: b */
    public String f174714b = "";

    /* renamed from: c */
    public int f174715c;

    /* renamed from: d */
    public int f174716d;

    /* renamed from: e */
    public String f174717e = "";

    /* renamed from: f */
    public String f174718f = "";

    /* renamed from: g */
    public boolean f174719g;

    /* renamed from: h */
    public String f174720h = "";

    /* renamed from: i */
    public String f174721i = "";

    /* renamed from: j */
    public boolean f174722j;

    /* renamed from: k */
    public int f174723k;

    /* renamed from: l */
    public cafx f174724l;

    /* renamed from: m */
    public long f174725m;

    /* renamed from: n */
    public int f174726n;

    /* renamed from: p */
    private int f174727p;

    /* renamed from: q */
    private byte f174728q = 2;

    static {
        caik caik = new caik();
        f174711o = caik;
        GeneratedMessageLite.m124024a(caik.class, caik);
    }

    private caik() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m126667a(caik caik) {
        caik.f174713a |= 1;
        caik.f174727p = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f174728q);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f174728q = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f174711o, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဈ\u0007\tဈ\b\nဇ\t\u000bင\n\fᐉ\u000b\rဂ\f\u000eဋ\r", new Object[]{"a", "p", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new caik();
        } else {
            if (i2 == 4) {
                return new bxvd(f174711o);
            }
            if (i2 == 5) {
                return f174711o;
            }
            bxxk bxxk = f174712r;
            if (bxxk == null) {
                synchronized (caik.class) {
                    bxxk = f174712r;
                    if (bxxk == null) {
                        bxxk = new bxve(f174711o);
                        f174712r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
