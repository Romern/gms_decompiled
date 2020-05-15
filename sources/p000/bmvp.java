package p000;

/* renamed from: bmvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvp extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmvp f131078d;

    /* renamed from: e */
    private static volatile bxxk f131079e;

    /* renamed from: a */
    public int f131080a;

    /* renamed from: b */
    public bmva f131081b;

    /* renamed from: c */
    public bmva f131082c;

    static {
        bmvp bmvp = new bmvp();
        f131078d = bmvp;
        bxvk.m124024a(bmvp.class, bmvp);
    }

    private bmvp() {
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
            return bxvk.m124022a(f131078d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvp();
        } else {
            if (i2 == 4) {
                return new bxvd(f131078d);
            }
            if (i2 == 5) {
                return f131078d;
            }
            bxxk bxxk = f131079e;
            if (bxxk == null) {
                synchronized (bmvp.class) {
                    bxxk = f131079e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131078d);
                        f131079e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
