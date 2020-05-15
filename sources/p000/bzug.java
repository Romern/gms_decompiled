package p000;

/* renamed from: bzug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzug extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzug f171418c;

    /* renamed from: d */
    private static volatile bxxk f171419d;

    /* renamed from: a */
    public bxvt f171420a = bxvm.f164965b;

    /* renamed from: b */
    public bzuf f171421b;

    static {
        bzug bzug = new bzug();
        f171418c = bzug;
        bxvk.m124024a(bzug.class, bzug);
    }

    private bzug() {
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
            return bxvk.m124022a(f171418c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001,\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzug();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f171418c;
            }
            bxxk bxxk = f171419d;
            if (bxxk == null) {
                synchronized (bzug.class) {
                    bxxk = f171419d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171418c);
                        f171419d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
