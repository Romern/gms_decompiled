package p000;

/* renamed from: btpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btpz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btpz f149912c;

    /* renamed from: d */
    private static volatile bxxk f149913d;

    /* renamed from: a */
    public boolean f149914a;

    /* renamed from: b */
    public bxtx f149915b = bxtx.f164797b;

    static {
        btpz btpz = new btpz();
        f149912c = btpz;
        bxvk.m124024a(btpz.class, btpz);
    }

    private btpz() {
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
            return bxvk.m124022a(f149912c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btpz();
        } else {
            if (i2 == 4) {
                return new bxvd(f149912c);
            }
            if (i2 == 5) {
                return f149912c;
            }
            bxxk bxxk = f149913d;
            if (bxxk == null) {
                synchronized (btpz.class) {
                    bxxk = f149913d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149912c);
                        f149913d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
