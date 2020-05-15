package p000;

/* renamed from: bymn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymn extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bymn f167040f;

    /* renamed from: g */
    private static volatile bxxk f167041g;

    /* renamed from: a */
    public int f167042a;

    /* renamed from: b */
    public long f167043b;

    /* renamed from: c */
    public long f167044c;

    /* renamed from: d */
    public int f167045d;

    /* renamed from: e */
    public bxtx f167046e = bxtx.f164797b;

    static {
        bymn bymn = new bymn();
        f167040f = bymn;
        bxvk.m124024a(bymn.class, bymn);
    }

    private bymn() {
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
            return bxvk.m124022a(f167040f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001\u0003ဋ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bymn();
        } else {
            if (i2 == 4) {
                return new bxvd(f167040f);
            }
            if (i2 == 5) {
                return f167040f;
            }
            bxxk bxxk = f167041g;
            if (bxxk == null) {
                synchronized (bymn.class) {
                    bxxk = f167041g;
                    if (bxxk == null) {
                        bxxk = new bxve(f167040f);
                        f167041g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
