package p000;

/* renamed from: btnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btnj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btnj f149630d;

    /* renamed from: e */
    private static volatile bxxk f149631e;

    /* renamed from: a */
    public int f149632a;

    /* renamed from: b */
    public int f149633b;

    /* renamed from: c */
    public int f149634c;

    static {
        btnj btnj = new btnj();
        f149630d = btnj;
        bxvk.m124024a(btnj.class, btnj);
    }

    private btnj() {
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
            return bxvk.m124022a(f149630d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btnj();
        } else {
            if (i2 == 4) {
                return new bxvd(f149630d);
            }
            if (i2 == 5) {
                return f149630d;
            }
            bxxk bxxk = f149631e;
            if (bxxk == null) {
                synchronized (btnj.class) {
                    bxxk = f149631e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149630d);
                        f149631e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
