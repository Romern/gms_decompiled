package p000;

/* renamed from: byqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byqn extends bxvk implements bxxd {

    /* renamed from: e */
    public static final byqn f167402e;

    /* renamed from: f */
    private static volatile bxxk f167403f;

    /* renamed from: a */
    public int f167404a;

    /* renamed from: b */
    public byqm f167405b;

    /* renamed from: c */
    public byqq f167406c;

    /* renamed from: d */
    public byqt f167407d;

    static {
        byqn byqn = new byqn();
        f167402e = byqn;
        bxvk.m124024a(byqn.class, byqn);
    }

    private byqn() {
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
            return bxvk.m124022a(f167402e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f167402e);
            }
            if (i2 == 5) {
                return f167402e;
            }
            bxxk bxxk = f167403f;
            if (bxxk == null) {
                synchronized (byqn.class) {
                    bxxk = f167403f;
                    if (bxxk == null) {
                        bxxk = new bxve(f167402e);
                        f167403f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
