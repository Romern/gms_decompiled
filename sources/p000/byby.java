package p000;

/* renamed from: byby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byby extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byby f165608c;

    /* renamed from: d */
    private static volatile bxxk f165609d;

    /* renamed from: a */
    public int f165610a = 0;

    /* renamed from: b */
    public Object f165611b;

    static {
        byby byby = new byby();
        f165608c = byby;
        bxvk.m124024a(byby.class, byby);
    }

    private byby() {
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
            return bxvk.m124022a(f165608c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", bybz.class, bycc.class, bycb.class});
        } else if (i2 == 3) {
            return new byby();
        } else {
            if (i2 == 4) {
                return new bxvd(f165608c);
            }
            if (i2 == 5) {
                return f165608c;
            }
            bxxk bxxk = f165609d;
            if (bxxk == null) {
                synchronized (byby.class) {
                    bxxk = f165609d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165608c);
                        f165609d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
