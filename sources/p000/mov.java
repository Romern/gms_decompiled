package p000;

/* renamed from: mov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mov extends bxvk implements bxxd {

    /* renamed from: c */
    public static final mov f34076c;

    /* renamed from: d */
    private static volatile bxxk f34077d;

    /* renamed from: a */
    public int f34078a;

    /* renamed from: b */
    public String f34079b = "";

    static {
        mov mov = new mov();
        f34076c = mov;
        bxvk.m124024a(mov.class, mov);
    }

    private mov() {
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
            return bxvk.m124022a(f34076c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new mov();
        } else {
            if (i2 == 4) {
                return new bxvd(f34076c);
            }
            if (i2 == 5) {
                return f34076c;
            }
            bxxk bxxk = f34077d;
            if (bxxk == null) {
                synchronized (mov.class) {
                    bxxk = f34077d;
                    if (bxxk == null) {
                        bxxk = new bxve(f34076c);
                        f34077d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
