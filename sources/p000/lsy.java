package p000;

/* renamed from: lsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lsy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final lsy f32864d;

    /* renamed from: f */
    private static volatile bxxk f32865f;

    /* renamed from: a */
    public int f32866a;

    /* renamed from: b */
    public String f32867b = "";

    /* renamed from: c */
    public String f32868c = "";

    /* renamed from: e */
    private byte f32869e = 2;

    static {
        lsy lsy = new lsy();
        f32864d = lsy;
        bxvk.m124024a(lsy.class, lsy);
    }

    private lsy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32869e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32869e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f32864d, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0002\bᔈ\u0000\tᔈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new lsy();
        } else {
            if (i2 == 4) {
                return new bxvd(f32864d);
            }
            if (i2 == 5) {
                return f32864d;
            }
            bxxk bxxk = f32865f;
            if (bxxk == null) {
                synchronized (lsy.class) {
                    bxxk = f32865f;
                    if (bxxk == null) {
                        bxxk = new bxve(f32864d);
                        f32865f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
