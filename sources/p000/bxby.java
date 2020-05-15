package p000;

/* renamed from: bxby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxby extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bxby f162752e;

    /* renamed from: f */
    private static volatile bxxk f162753f;

    /* renamed from: a */
    public int f162754a;

    /* renamed from: b */
    public String f162755b = "";

    /* renamed from: c */
    public String f162756c = "";

    /* renamed from: d */
    public bxtx f162757d = bxtx.f164797b;

    static {
        bxby bxby = new bxby();
        f162752e = bxby;
        bxvk.m124024a(bxby.class, bxby);
    }

    private bxby() {
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
            return bxvk.m124022a(f162752e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bxby();
        } else {
            if (i2 == 4) {
                return new bxvd(f162752e);
            }
            if (i2 == 5) {
                return f162752e;
            }
            bxxk bxxk = f162753f;
            if (bxxk == null) {
                synchronized (bxby.class) {
                    bxxk = f162753f;
                    if (bxxk == null) {
                        bxxk = new bxve(f162752e);
                        f162753f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
