package p000;

/* renamed from: btyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btyd f152884d;

    /* renamed from: e */
    private static volatile bxxk f152885e;

    /* renamed from: a */
    public int f152886a;

    /* renamed from: b */
    public float f152887b;

    /* renamed from: c */
    public int f152888c = -1;

    static {
        btyd btyd = new btyd();
        f152884d = btyd;
        bxvk.m124024a(btyd.class, btyd);
    }

    private btyd() {
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
            return bxvk.m124022a(f152884d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btyd();
        } else {
            if (i2 == 4) {
                return new bxvd(f152884d);
            }
            if (i2 == 5) {
                return f152884d;
            }
            bxxk bxxk = f152885e;
            if (bxxk == null) {
                synchronized (btyd.class) {
                    bxxk = f152885e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152884d);
                        f152885e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
