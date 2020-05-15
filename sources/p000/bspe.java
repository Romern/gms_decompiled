package p000;

/* renamed from: bspe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bspe f146473c;

    /* renamed from: d */
    private static volatile bxxk f146474d;

    /* renamed from: a */
    public int f146475a;

    /* renamed from: b */
    public int f146476b;

    static {
        bspe bspe = new bspe();
        f146473c = bspe;
        bxvk.m124024a(bspe.class, bspe);
    }

    private bspe() {
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
            return bxvk.m124022a(f146473c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bspe();
        } else {
            if (i2 == 4) {
                return new bxvd(f146473c);
            }
            if (i2 == 5) {
                return f146473c;
            }
            bxxk bxxk = f146474d;
            if (bxxk == null) {
                synchronized (bspe.class) {
                    bxxk = f146474d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146473c);
                        f146474d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
