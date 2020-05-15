package p000;

/* renamed from: bzlr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzlr extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bzlr f170559j;

    /* renamed from: k */
    private static volatile bxxk f170560k;

    /* renamed from: a */
    public int f170561a;

    /* renamed from: b */
    public String f170562b = "";

    /* renamed from: c */
    public String f170563c = "";

    /* renamed from: d */
    public String f170564d = "";

    /* renamed from: e */
    public String f170565e = "";

    /* renamed from: f */
    public String f170566f = "";

    /* renamed from: g */
    public bzmq f170567g;

    /* renamed from: h */
    public int f170568h;

    /* renamed from: i */
    public long f170569i;

    static {
        bzlr bzlr = new bzlr();
        f170559j = bzlr;
        bxvk.m124024a(bzlr.class, bzlr);
    }

    private bzlr() {
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
            return bxvk.m124022a(f170559j, "\u0001\b\u0000\u0001\u0004\u000b\b\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဂ\u0007\u0006ဌ\u0006\u0007ဈ\u0001\bဈ\u0002\tဈ\u0004\nဉ\u0005\u000bဈ\u0003", new Object[]{"a", "b", "i", "h", bzlq.f170558a, "c", "d", "f", "g", "e"});
        } else if (i2 == 3) {
            return new bzlr();
        } else {
            if (i2 == 4) {
                return new bxvd(f170559j);
            }
            if (i2 == 5) {
                return f170559j;
            }
            bxxk bxxk = f170560k;
            if (bxxk == null) {
                synchronized (bzlr.class) {
                    bxxk = f170560k;
                    if (bxxk == null) {
                        bxxk = new bxve(f170559j);
                        f170560k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
