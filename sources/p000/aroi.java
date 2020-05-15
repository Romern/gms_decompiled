package p000;

/* renamed from: aroi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aroi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aroi f87996d;

    /* renamed from: f */
    private static volatile bxxk f87997f;

    /* renamed from: a */
    public String f87998a = "";

    /* renamed from: b */
    public int f87999b;

    /* renamed from: c */
    public String f88000c;

    /* renamed from: e */
    private int f88001e;

    static {
        aroi aroi = new aroi();
        f87996d = aroi;
        bxvk.m124024a(aroi.class, aroi);
    }

    private aroi() {
        bxtx bxtx = bxtx.f164797b;
        this.f88000c = "";
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
            return bxvk.m124022a(f87996d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004င\u0003\u0005ဈ\u0004", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new aroi();
        } else {
            if (i2 == 4) {
                return new bxvd(f87996d);
            }
            if (i2 == 5) {
                return f87996d;
            }
            bxxk bxxk = f87997f;
            if (bxxk == null) {
                synchronized (aroi.class) {
                    bxxk = f87997f;
                    if (bxxk == null) {
                        bxxk = new bxve(f87996d);
                        f87997f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
