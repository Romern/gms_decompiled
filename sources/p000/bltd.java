package p000;

/* renamed from: bltd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bltd extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bltd f127670d;

    /* renamed from: f */
    private static volatile bxxk f127671f;

    /* renamed from: a */
    public blth f127672a;

    /* renamed from: b */
    public blth f127673b;

    /* renamed from: c */
    public String f127674c = "";

    /* renamed from: e */
    private int f127675e;

    static {
        bltd bltd = new bltd();
        f127670d = bltd;
        bxvk.m124024a(bltd.class, bltd);
    }

    private bltd() {
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
            return bxvk.m124022a(f127670d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bltd();
        } else {
            if (i2 == 4) {
                return new bxvd(f127670d);
            }
            if (i2 == 5) {
                return f127670d;
            }
            bxxk bxxk = f127671f;
            if (bxxk == null) {
                synchronized (bltd.class) {
                    bxxk = f127671f;
                    if (bxxk == null) {
                        bxxk = new bxve(f127670d);
                        f127671f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
