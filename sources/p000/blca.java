package p000;

/* renamed from: blca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blca extends bxvg implements bxvh {

    /* renamed from: b */
    public static final blca f125893b;

    /* renamed from: e */
    private static volatile bxxk f125894e;

    /* renamed from: a */
    public int f125895a;

    /* renamed from: c */
    private int f125896c;

    /* renamed from: d */
    private byte f125897d = 2;

    static {
        blca blca = new blca();
        f125893b = blca;
        GeneratedMessageLite.m124024a(blca.class, blca);
    }

    private blca() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f125897d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f125897d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f125893b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new blca();
        } else {
            if (i2 == 4) {
                return new bxvf(f125893b);
            }
            if (i2 == 5) {
                return f125893b;
            }
            bxxk bxxk = f125894e;
            if (bxxk == null) {
                synchronized (blca.class) {
                    bxxk = f125894e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125893b);
                        f125894e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
