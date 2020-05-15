package p000;

/* renamed from: mpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final mpd f34110e;

    /* renamed from: f */
    private static volatile bxxk f34111f;

    /* renamed from: a */
    public int f34112a;

    /* renamed from: b */
    public int f34113b;

    /* renamed from: c */
    public int f34114c;

    /* renamed from: d */
    public boolean f34115d;

    static {
        mpd mpd = new mpd();
        f34110e = mpd;
        bxvk.m124024a(mpd.class, mpd);
    }

    private mpd() {
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
            return bxvk.m124022a(f34110e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new mpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f34110e);
            }
            if (i2 == 5) {
                return f34110e;
            }
            bxxk bxxk = f34111f;
            if (bxxk == null) {
                synchronized (mpd.class) {
                    bxxk = f34111f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34110e);
                        f34111f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
