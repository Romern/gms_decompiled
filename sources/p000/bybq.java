package p000;

/* renamed from: bybq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybq extends bxvk implements bxxd {

    /* renamed from: u */
    public static final bybq f165564u;

    /* renamed from: v */
    private static volatile bxxk f165565v;

    /* renamed from: a */
    public int f165566a;

    /* renamed from: b */
    public int f165567b;

    /* renamed from: c */
    public int f165568c;

    /* renamed from: d */
    public int f165569d;

    /* renamed from: e */
    public int f165570e;

    /* renamed from: f */
    public int f165571f;

    /* renamed from: g */
    public int f165572g;

    /* renamed from: h */
    public int f165573h;

    /* renamed from: i */
    public int f165574i;

    /* renamed from: j */
    public int f165575j;

    /* renamed from: k */
    public int f165576k;

    /* renamed from: l */
    public int f165577l;

    /* renamed from: m */
    public int f165578m;

    /* renamed from: n */
    public int f165579n;

    /* renamed from: o */
    public int f165580o;

    /* renamed from: p */
    public double f165581p;

    /* renamed from: q */
    public int f165582q;

    /* renamed from: r */
    public long f165583r;

    /* renamed from: s */
    public long f165584s;

    /* renamed from: t */
    public int f165585t;

    static {
        bybq bybq = new bybq();
        f165564u = bybq;
        bxvk.m124024a(bybq.class, bybq);
    }

    private bybq() {
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
            return bxvk.m124022a(f165564u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eင\r\u000fက\u000e\u0010င\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013င\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
        } else if (i2 == 3) {
            return new bybq();
        } else {
            if (i2 == 4) {
                return new bxvd(f165564u);
            }
            if (i2 == 5) {
                return f165564u;
            }
            bxxk bxxk = f165565v;
            if (bxxk == null) {
                synchronized (bybq.class) {
                    bxxk = f165565v;
                    if (bxxk == null) {
                        bxxk = new bxve(f165564u);
                        f165565v = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
