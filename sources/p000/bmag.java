package p000;

/* renamed from: bmag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmag extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmag f128442c;

    /* renamed from: d */
    private static volatile bxxk f128443d;

    /* renamed from: a */
    public int f128444a = 0;

    /* renamed from: b */
    public Object f128445b;

    static {
        bmag bmag = new bmag();
        f128442c = bmag;
        bxvk.m124024a(bmag.class, bmag);
    }

    private bmag() {
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
            return bxvk.m124022a(f128442c, "\u0001\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002ွ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bmag();
        } else {
            if (i2 == 4) {
                return new bxvd(f128442c);
            }
            if (i2 == 5) {
                return f128442c;
            }
            bxxk bxxk = f128443d;
            if (bxxk == null) {
                synchronized (bmag.class) {
                    bxxk = f128443d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128442c);
                        f128443d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
