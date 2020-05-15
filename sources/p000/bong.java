package p000;

/* renamed from: bong */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bong extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final bong f133782r;

    /* renamed from: s */
    private static volatile bxxk f133783s;

    /* renamed from: a */
    public int f133784a;

    /* renamed from: b */
    public int f133785b;

    /* renamed from: c */
    public String f133786c = "";

    /* renamed from: d */
    public bonc f133787d;

    /* renamed from: e */
    public bonh f133788e;

    /* renamed from: f */
    public bone f133789f;

    /* renamed from: g */
    public bomo f133790g;

    /* renamed from: h */
    public bonb f133791h;

    /* renamed from: i */
    public bomz f133792i;

    /* renamed from: j */
    public bomu f133793j;

    /* renamed from: k */
    public bomv f133794k;

    /* renamed from: l */
    public bomy f133795l;

    /* renamed from: m */
    public bomp f133796m;

    /* renamed from: n */
    public bomq f133797n;

    /* renamed from: o */
    public bona f133798o;

    /* renamed from: p */
    public bomr f133799p;

    /* renamed from: q */
    public bomx f133800q;

    static {
        bong bong = new bong();
        f133782r = bong;
        GeneratedMessageLite.m124024a(bong.class, bong);
    }

    private bong() {
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
            return GeneratedMessageLite.m124022a(f133782r, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f", new Object[]{"a", "b", bonf.f133781a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i2 == 3) {
            return new bong();
        } else {
            if (i2 == 4) {
                return new bxvd(f133782r);
            }
            if (i2 == 5) {
                return f133782r;
            }
            bxxk bxxk = f133783s;
            if (bxxk == null) {
                synchronized (bong.class) {
                    bxxk = f133783s;
                    if (bxxk == null) {
                        bxxk = new bxve(f133782r);
                        f133783s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
