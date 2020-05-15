package p000;

/* renamed from: byfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byfd f166006c;

    /* renamed from: d */
    private static volatile bxxk f166007d;

    /* renamed from: a */
    public int f166008a;

    /* renamed from: b */
    public int f166009b;

    static {
        byfd byfd = new byfd();
        f166006c = byfd;
        bxvk.m124024a(byfd.class, byfd);
    }

    private byfd() {
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
            return bxvk.m124022a(f166006c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဋ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f166006c);
            }
            if (i2 == 5) {
                return f166006c;
            }
            bxxk bxxk = f166007d;
            if (bxxk == null) {
                synchronized (byfd.class) {
                    bxxk = f166007d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166006c);
                        f166007d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
