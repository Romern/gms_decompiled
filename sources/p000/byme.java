package p000;

/* renamed from: byme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byme extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byme f167009c;

    /* renamed from: e */
    private static volatile bxxk f167010e;

    /* renamed from: a */
    public calo f167011a;

    /* renamed from: b */
    public int f167012b;

    /* renamed from: d */
    private int f167013d;

    static {
        byme byme = new byme();
        f167009c = byme;
        bxvk.m124024a(byme.class, byme);
    }

    private byme() {
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
            return bxvk.m124022a(f167009c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", bymk.m124956b()});
        } else if (i2 == 3) {
            return new byme();
        } else {
            if (i2 == 4) {
                return new bxvd(f167009c);
            }
            if (i2 == 5) {
                return f167009c;
            }
            bxxk bxxk = f167010e;
            if (bxxk == null) {
                synchronized (byme.class) {
                    bxxk = f167010e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167009c);
                        f167010e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
