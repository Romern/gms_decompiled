package p000;

/* renamed from: bmnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmnb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmnb f130075d;

    /* renamed from: e */
    private static volatile bxxk f130076e;

    /* renamed from: a */
    public int f130077a;

    /* renamed from: b */
    public bmmw f130078b;

    /* renamed from: c */
    public boolean f130079c;

    static {
        bmnb bmnb = new bmnb();
        f130075d = bmnb;
        bxvk.m124024a(bmnb.class, bmnb);
    }

    private bmnb() {
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
            return bxvk.m124022a(f130075d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmnb();
        } else {
            if (i2 == 4) {
                return new bxvd(f130075d);
            }
            if (i2 == 5) {
                return f130075d;
            }
            bxxk bxxk = f130076e;
            if (bxxk == null) {
                synchronized (bmnb.class) {
                    bxxk = f130076e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130075d);
                        f130076e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
