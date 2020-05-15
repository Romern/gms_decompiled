package p000;

/* renamed from: cipd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cipd f191186c;

    /* renamed from: d */
    private static volatile bxxk f191187d;

    /* renamed from: a */
    public long f191188a;

    /* renamed from: b */
    public ciox f191189b;

    static {
        cipd cipd = new cipd();
        f191186c = cipd;
        bxvk.m124024a(cipd.class, cipd);
    }

    private cipd() {
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
            return bxvk.m124022a(f191186c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cipd();
        } else {
            if (i2 == 4) {
                return new bxvd(f191186c);
            }
            if (i2 == 5) {
                return f191186c;
            }
            bxxk bxxk = f191187d;
            if (bxxk == null) {
                synchronized (cipd.class) {
                    bxxk = f191187d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191186c);
                        f191187d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
