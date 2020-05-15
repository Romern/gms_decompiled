package p000;

/* renamed from: byoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byoz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byoz f167283d;

    /* renamed from: e */
    private static volatile bxxk f167284e;

    /* renamed from: a */
    public int f167285a;

    /* renamed from: b */
    public bypc f167286b;

    /* renamed from: c */
    public bypd f167287c;

    static {
        byoz byoz = new byoz();
        f167283d = byoz;
        bxvk.m124024a(byoz.class, byoz);
    }

    private byoz() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f167283d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byoz();
        } else {
            if (i2 == 4) {
                return new bxvd(f167283d);
            }
            if (i2 == 5) {
                return f167283d;
            }
            bxxk bxxk = f167284e;
            if (bxxk == null) {
                synchronized (byoz.class) {
                    bxxk = f167284e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167283d);
                        f167284e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
