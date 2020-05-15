package p000;

/* renamed from: byxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byxy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byxy f168842f;

    /* renamed from: k */
    private static volatile bxxk f168843k;

    /* renamed from: a */
    public int f168844a;

    /* renamed from: b */
    public boolean f168845b;

    /* renamed from: c */
    public boolean f168846c;

    /* renamed from: d */
    public boolean f168847d = true;

    /* renamed from: e */
    public boolean f168848e = true;

    /* renamed from: g */
    private boolean f168849g;

    /* renamed from: h */
    private boolean f168850h = true;

    /* renamed from: i */
    private boolean f168851i = true;

    /* renamed from: j */
    private boolean f168852j = true;

    static {
        byxy byxy = new byxy();
        f168842f = byxy;
        bxvk.m124024a(byxy.class, byxy);
    }

    private byxy() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125472a(byxy byxy) {
        byxy.f168844a |= 1;
        byxy.f168849g = false;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125473b(byxy byxy) {
        byxy.f168844a |= 2;
        byxy.f168845b = true;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125474c(byxy byxy) {
        byxy.f168844a |= 4;
        byxy.f168846c = true;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125475d(byxy byxy) {
        byxy.f168844a |= 16;
        byxy.f168848e = true;
    }

    /* renamed from: e */
    public static /* synthetic */ void m125476e(byxy byxy) {
        byxy.f168844a |= 32;
        byxy.f168850h = true;
    }

    /* renamed from: f */
    public static /* synthetic */ void m125477f(byxy byxy) {
        byxy.f168844a |= 64;
        byxy.f168851i = true;
    }

    /* renamed from: g */
    public static /* synthetic */ void m125478g(byxy byxy) {
        byxy.f168844a |= 128;
        byxy.f168852j = true;
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
            return bxvk.m124022a(f168842f, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "g", "b", "c", "d", "e", "h", "i", "j"});
        } else if (i2 == 3) {
            return new byxy();
        } else {
            if (i2 == 4) {
                return new bxvd(f168842f);
            }
            if (i2 == 5) {
                return f168842f;
            }
            bxxk bxxk = f168843k;
            if (bxxk == null) {
                synchronized (byxy.class) {
                    bxxk = f168843k;
                    if (bxxk == null) {
                        bxxk = new bxve(f168842f);
                        f168843k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
