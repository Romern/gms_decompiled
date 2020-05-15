package p000;

/* renamed from: cafg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cafg f172895f;

    /* renamed from: g */
    private static volatile bxxk f172896g;

    /* renamed from: a */
    public int f172897a;

    /* renamed from: b */
    public int f172898b;

    /* renamed from: c */
    public int f172899c;

    /* renamed from: d */
    public int f172900d;

    /* renamed from: e */
    public bxvt f172901e = bxvm.f164965b;

    static {
        cafg cafg = new cafg();
        f172895f = cafg;
        bxvk.m124024a(cafg.class, cafg);
    }

    private cafg() {
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
            return bxvk.m124022a(f172895f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဋ\u0002\u0004+", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cafg();
        } else {
            if (i2 == 4) {
                return new caff();
            }
            if (i2 == 5) {
                return f172895f;
            }
            bxxk bxxk = f172896g;
            if (bxxk == null) {
                synchronized (cafg.class) {
                    bxxk = f172896g;
                    if (bxxk == null) {
                        bxxk = new bxve(f172895f);
                        f172896g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo74638c() {
        if (!this.f172901e.mo73666a()) {
            this.f172901e = bxvk.m124019a(this.f172901e);
        }
    }
}
