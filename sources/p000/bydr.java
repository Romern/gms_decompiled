package p000;

/* renamed from: bydr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bydr f165834a;

    /* renamed from: f */
    private static volatile bxxk f165835f;

    /* renamed from: b */
    private int f165836b;

    /* renamed from: c */
    private String f165837c = "";

    /* renamed from: d */
    private long f165838d;

    /* renamed from: e */
    private byte f165839e = 2;

    static {
        bydr bydr = new bydr();
        f165834a = bydr;
        bxvk.m124024a(bydr.class, bydr);
    }

    private bydr() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165839e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165839e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f165834a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔂ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bydr();
        } else {
            if (i2 == 4) {
                return new bxvd(f165834a);
            }
            if (i2 == 5) {
                return f165834a;
            }
            bxxk bxxk = f165835f;
            if (bxxk == null) {
                synchronized (bydr.class) {
                    bxxk = f165835f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165834a);
                        f165835f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
