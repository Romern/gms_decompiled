package p000;

/* renamed from: bttd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bttd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bttd f150324d;

    /* renamed from: e */
    private static volatile bxxk f150325e;

    /* renamed from: a */
    public int f150326a;

    /* renamed from: b */
    public bzvu f150327b;

    /* renamed from: c */
    public btsz f150328c;

    static {
        bttd bttd = new bttd();
        f150324d = bttd;
        bxvk.m124024a(bttd.class, bttd);
    }

    private bttd() {
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
            return bxvk.m124022a(f150324d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bttd();
        } else {
            if (i2 == 4) {
                return new bxvd(f150324d);
            }
            if (i2 == 5) {
                return f150324d;
            }
            bxxk bxxk = f150325e;
            if (bxxk == null) {
                synchronized (bttd.class) {
                    bxxk = f150325e;
                    if (bxxk == null) {
                        bxxk = new bxve(f150324d);
                        f150325e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
