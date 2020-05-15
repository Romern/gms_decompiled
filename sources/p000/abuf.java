package p000;

/* renamed from: abuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abuf extends bxvk implements bxxd {

    /* renamed from: b */
    public static final abuf f58379b;

    /* renamed from: d */
    private static volatile bxxk f58380d;

    /* renamed from: a */
    public bxtx f58381a = bxtx.f164797b;

    /* renamed from: c */
    private int f58382c;

    static {
        abuf abuf = new abuf();
        f58379b = abuf;
        bxvk.m124024a(abuf.class, abuf);
    }

    private abuf() {
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
            return bxvk.m124022a(f58379b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new abuf();
        } else {
            if (i2 == 4) {
                return new bxvd(f58379b);
            }
            if (i2 == 5) {
                return f58379b;
            }
            bxxk bxxk = f58380d;
            if (bxxk == null) {
                synchronized (abuf.class) {
                    bxxk = f58380d;
                    if (bxxk == null) {
                        bxxk = new bxve(f58379b);
                        f58380d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
