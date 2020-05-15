package p000;

/* renamed from: bmkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmkm f129858e;

    /* renamed from: f */
    private static volatile bxxk f129859f;

    /* renamed from: a */
    public int f129860a;

    /* renamed from: b */
    public String f129861b = "";

    /* renamed from: c */
    public bxtx f129862c = bxtx.f164797b;

    /* renamed from: d */
    public bwey f129863d;

    static {
        bmkm bmkm = new bmkm();
        f129858e = bmkm;
        bxvk.m124024a(bmkm.class, bmkm);
    }

    private bmkm() {
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
            return bxvk.m124022a(f129858e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmkm();
        } else {
            if (i2 == 4) {
                return new bxvd(f129858e);
            }
            if (i2 == 5) {
                return f129858e;
            }
            bxxk bxxk = f129859f;
            if (bxxk == null) {
                synchronized (bmkm.class) {
                    bxxk = f129859f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129858e);
                        f129859f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
