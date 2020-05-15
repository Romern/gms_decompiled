package p000;

/* renamed from: botl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botl extends bxvk implements bxxd {

    /* renamed from: k */
    public static final botl f134788k;

    /* renamed from: l */
    private static volatile bxxk f134789l;

    /* renamed from: a */
    public int f134790a;

    /* renamed from: b */
    public boolean f134791b;

    /* renamed from: c */
    public boolean f134792c;

    /* renamed from: d */
    public long f134793d;

    /* renamed from: e */
    public long f134794e;

    /* renamed from: f */
    public int f134795f;

    /* renamed from: g */
    public int f134796g;

    /* renamed from: h */
    public int f134797h;

    /* renamed from: i */
    public int f134798i;

    /* renamed from: j */
    public int f134799j;

    static {
        botl botl = new botl();
        f134788k = botl;
        bxvk.m124024a(botl.class, botl);
    }

    private botl() {
        bxvm bxvm = bxvm.f164965b;
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
            return bxvk.m124022a(f134788k, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\tင\u0007\nင\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new botl();
        } else {
            if (i2 == 4) {
                return new bxvd(f134788k);
            }
            if (i2 == 5) {
                return f134788k;
            }
            bxxk bxxk = f134789l;
            if (bxxk == null) {
                synchronized (botl.class) {
                    bxxk = f134789l;
                    if (bxxk == null) {
                        bxxk = new bxve(f134788k);
                        f134789l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
