package p000;

/* renamed from: wzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final wzp f51623c;

    /* renamed from: d */
    private static volatile bxxk f51624d;

    /* renamed from: a */
    public int f51625a;

    /* renamed from: b */
    public bxtx f51626b = bxtx.f164797b;

    static {
        wzp wzp = new wzp();
        f51623c = wzp;
        bxvk.m124024a(wzp.class, wzp);
    }

    private wzp() {
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
            return bxvk.m124022a(f51623c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new wzp();
        } else {
            if (i2 == 4) {
                return new bxvd(f51623c);
            }
            if (i2 == 5) {
                return f51623c;
            }
            bxxk bxxk = f51624d;
            if (bxxk == null) {
                synchronized (wzp.class) {
                    bxxk = f51624d;
                    if (bxxk == null) {
                        bxxk = new bxve(f51623c);
                        f51624d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
