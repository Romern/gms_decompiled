package p000;

/* renamed from: bymr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bymr extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bymr f167059e;

    /* renamed from: f */
    private static volatile bxxk f167060f;

    /* renamed from: a */
    public int f167061a;

    /* renamed from: b */
    public long f167062b;

    /* renamed from: c */
    public int f167063c;

    /* renamed from: d */
    public bxtx f167064d = bxtx.f164797b;

    static {
        bymr bymr = new bymr();
        f167059e = bymr;
        bxvk.m124024a(bymr.class, bymr);
    }

    private bymr() {
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
            return bxvk.m124022a(f167059e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bymr();
        } else {
            if (i2 == 4) {
                return new bxvd(f167059e);
            }
            if (i2 == 5) {
                return f167059e;
            }
            bxxk bxxk = f167060f;
            if (bxxk == null) {
                synchronized (bymr.class) {
                    bxxk = f167060f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167059e);
                        f167060f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
