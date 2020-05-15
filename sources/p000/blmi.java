package p000;

/* renamed from: blmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blmi extends bxvk implements bxxd {

    /* renamed from: d */
    public static final blmi f126842d;

    /* renamed from: f */
    private static volatile bxxk f126843f;

    /* renamed from: a */
    public int f126844a;

    /* renamed from: b */
    public String f126845b = "";

    /* renamed from: c */
    public String f126846c = "";

    /* renamed from: e */
    private byte f126847e = 2;

    static {
        blmi blmi = new blmi();
        f126842d = blmi;
        bxvk.m124024a(blmi.class, blmi);
    }

    private blmi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126847e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126847e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126842d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blmi();
        } else {
            if (i2 == 4) {
                return new bxvd(f126842d);
            }
            if (i2 == 5) {
                return f126842d;
            }
            bxxk bxxk = f126843f;
            if (bxxk == null) {
                synchronized (blmi.class) {
                    bxxk = f126843f;
                    if (bxxk == null) {
                        bxxk = new bxve(f126842d);
                        f126843f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
