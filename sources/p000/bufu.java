package p000;

/* renamed from: bufu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bufu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bufu f153741b;

    /* renamed from: d */
    private static volatile bxxk f153742d;

    /* renamed from: a */
    public boolean f153743a;

    /* renamed from: c */
    private int f153744c;

    static {
        bufu bufu = new bufu();
        f153741b = bufu;
        GeneratedMessageLite.m124024a(bufu.class, bufu);
    }

    private bufu() {
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
            return GeneratedMessageLite.m124022a(f153741b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bufu();
        } else {
            if (i2 == 4) {
                return new bxvd(f153741b);
            }
            if (i2 == 5) {
                return f153741b;
            }
            bxxk bxxk = f153742d;
            if (bxxk == null) {
                synchronized (bufu.class) {
                    bxxk = f153742d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153741b);
                        f153742d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
