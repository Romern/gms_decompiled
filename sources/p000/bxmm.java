package p000;

/* renamed from: bxmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final bxvu f163945o = new bxmk();

    /* renamed from: s */
    public static final bxmm f163946s;

    /* renamed from: t */
    private static volatile bxxk f163947t;

    /* renamed from: a */
    public int f163948a;

    /* renamed from: b */
    public double f163949b;

    /* renamed from: c */
    public String f163950c = "";

    /* renamed from: d */
    public String f163951d = "";

    /* renamed from: e */
    public String f163952e = "";

    /* renamed from: f */
    public String f163953f = "";

    /* renamed from: g */
    public String f163954g = "";

    /* renamed from: h */
    public float f163955h;

    /* renamed from: i */
    public int f163956i;

    /* renamed from: j */
    public boolean f163957j;

    /* renamed from: k */
    public String f163958k = "";

    /* renamed from: l */
    public int f163959l;

    /* renamed from: m */
    public int f163960m;

    /* renamed from: n */
    public bxvt f163961n = bxvm.f164965b;

    /* renamed from: p */
    public int f163962p;

    /* renamed from: q */
    public double f163963q;

    /* renamed from: r */
    public bxwc f163964r = bxxn.f165040b;

    static {
        bxmm bxmm = new bxmm();
        f163946s = bxmm;
        GeneratedMessageLite.m124024a(bxmm.class, bxmm);
    }

    private bxmm() {
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
            return GeneratedMessageLite.m124022a(f163946s, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\u0000\u0001က\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ခ\u0006\bင\u0007\nဇ\b\u000bဈ\t\fင\n\rင\u000b\u000e\u001e\u000fင\f\u0010က\r\u0011\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", bvoq.m121325b(), "p", "q", "r"});
        } else if (i2 == 3) {
            return new bxmm();
        } else {
            if (i2 == 4) {
                return new bxml();
            }
            if (i2 == 5) {
                return f163946s;
            }
            bxxk bxxk = f163947t;
            if (bxxk == null) {
                synchronized (bxmm.class) {
                    bxxk = f163947t;
                    if (bxxk == null) {
                        bxxk = new bxve(f163946s);
                        f163947t = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
