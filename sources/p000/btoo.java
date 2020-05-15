package p000;

/* renamed from: btoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btoo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final btoo f149781b;

    /* renamed from: c */
    private static volatile bxxk f149782c;

    /* renamed from: a */
    public bxvt f149783a = bxvm.f164965b;

    static {
        btoo btoo = new btoo();
        f149781b = btoo;
        bxvk.m124024a(btoo.class, btoo);
    }

    private btoo() {
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
            return bxvk.m124022a(f149781b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btoo();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149781b;
            }
            bxxk bxxk = f149782c;
            if (bxxk == null) {
                synchronized (btoo.class) {
                    bxxk = f149782c;
                    if (bxxk == null) {
                        bxxk = new bxve(f149781b);
                        f149782c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
