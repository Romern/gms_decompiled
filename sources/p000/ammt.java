package p000;

/* renamed from: ammt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ammt extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final ammt f75376n;

    /* renamed from: o */
    private static volatile bxxk f75377o;

    /* renamed from: a */
    public int f75378a;

    /* renamed from: b */
    public int f75379b;

    /* renamed from: c */
    public int f75380c;

    /* renamed from: d */
    public int f75381d;

    /* renamed from: e */
    public int f75382e;

    /* renamed from: f */
    public int f75383f;

    /* renamed from: g */
    public int f75384g;

    /* renamed from: h */
    public int f75385h;

    /* renamed from: i */
    public int f75386i;

    /* renamed from: j */
    public int f75387j;

    /* renamed from: k */
    public int f75388k;

    /* renamed from: l */
    public amms f75389l;

    /* renamed from: m */
    public int f75390m;

    static {
        ammt ammt = new ammt();
        f75376n = ammt;
        GeneratedMessageLite.m124024a(ammt.class, ammt);
    }

    private ammt() {
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
            return GeneratedMessageLite.m124022a(f75376n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\nဉ\u000b\fင\b\rင\t\u000eင\r\u000fင\n", new Object[]{"a", "b", amjj.f74998a, "c", "d", "e", "f", "g", "h", "l", "i", "j", "m", "k"});
        } else if (i2 == 3) {
            return new ammt();
        } else {
            if (i2 == 4) {
                return new bxvd(f75376n);
            }
            if (i2 == 5) {
                return f75376n;
            }
            bxxk bxxk = f75377o;
            if (bxxk == null) {
                synchronized (ammt.class) {
                    bxxk = f75377o;
                    if (bxxk == null) {
                        bxxk = new bxve(f75376n);
                        f75377o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
