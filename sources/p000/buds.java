package p000;

/* renamed from: buds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buds extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buds f153510c;

    /* renamed from: e */
    private static volatile bxxk f153511e;

    /* renamed from: a */
    public long f153512a;

    /* renamed from: b */
    public int f153513b;

    /* renamed from: d */
    private int f153514d;

    static {
        buds buds = new buds();
        f153510c = buds;
        bxvk.m124024a(buds.class, buds);
    }

    private buds() {
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
            return bxvk.m124022a(f153510c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဏ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new buds();
        } else {
            if (i2 == 4) {
                return new bxvd(f153510c);
            }
            if (i2 == 5) {
                return f153510c;
            }
            bxxk bxxk = f153511e;
            if (bxxk == null) {
                synchronized (buds.class) {
                    bxxk = f153511e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153510c);
                        f153511e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
