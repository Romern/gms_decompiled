package p000;

/* renamed from: bmmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmx extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmmx f130065d;

    /* renamed from: e */
    private static volatile bxxk f130066e;

    /* renamed from: a */
    public int f130067a;

    /* renamed from: b */
    public bmmw f130068b;

    /* renamed from: c */
    public boolean f130069c;

    static {
        bmmx bmmx = new bmmx();
        f130065d = bmmx;
        bxvk.m124024a(bmmx.class, bmmx);
    }

    private bmmx() {
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
            return bxvk.m124022a(f130065d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmmx();
        } else {
            if (i2 == 4) {
                return new bxvd(f130065d);
            }
            if (i2 == 5) {
                return f130065d;
            }
            bxxk bxxk = f130066e;
            if (bxxk == null) {
                synchronized (bmmx.class) {
                    bxxk = f130066e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130065d);
                        f130066e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
