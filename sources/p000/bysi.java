package p000;

/* renamed from: bysi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bysi f167570c;

    /* renamed from: d */
    private static volatile bxxk f167571d;

    /* renamed from: a */
    public int f167572a;

    /* renamed from: b */
    public bxtx f167573b = bxtx.f164797b;

    static {
        bysi bysi = new bysi();
        f167570c = bysi;
        bxvk.m124024a(bysi.class, bysi);
    }

    private bysi() {
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
            return bxvk.m124022a(f167570c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bysi();
        } else {
            if (i2 == 4) {
                return new bxvd(f167570c);
            }
            if (i2 == 5) {
                return f167570c;
            }
            bxxk bxxk = f167571d;
            if (bxxk == null) {
                synchronized (bysi.class) {
                    bxxk = f167571d;
                    if (bxxk == null) {
                        bxxk = new bxve(f167570c);
                        f167571d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
