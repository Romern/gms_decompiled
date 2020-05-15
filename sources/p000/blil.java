package p000;

/* renamed from: blil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blil extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blil f126625c;

    /* renamed from: d */
    private static volatile bxxk f126626d;

    /* renamed from: a */
    public int f126627a;

    /* renamed from: b */
    public int f126628b;

    static {
        blil blil = new blil();
        f126625c = blil;
        bxvk.m124024a(blil.class, blil);
    }

    private blil() {
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
            return bxvk.m124022a(f126625c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blil();
        } else {
            if (i2 == 4) {
                return new bxvd(f126625c);
            }
            if (i2 == 5) {
                return f126625c;
            }
            bxxk bxxk = f126626d;
            if (bxxk == null) {
                synchronized (blil.class) {
                    bxxk = f126626d;
                    if (bxxk == null) {
                        bxxk = new bxve(f126625c);
                        f126626d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
