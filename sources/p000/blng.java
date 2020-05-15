package p000;

/* renamed from: blng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blng extends bxvk implements bxxd {

    /* renamed from: e */
    public static final blng f126963e;

    /* renamed from: i */
    private static volatile bxxk f126964i;

    /* renamed from: a */
    public blmq f126965a;

    /* renamed from: b */
    public bxwc f126966b = bxxn.f165040b;

    /* renamed from: c */
    public int f126967c;

    /* renamed from: d */
    public blmu f126968d;

    /* renamed from: f */
    private int f126969f;

    /* renamed from: g */
    private String f126970g = "";

    /* renamed from: h */
    private byte f126971h = 2;

    static {
        blng blng = new blng();
        f126963e = blng;
        bxvk.m124024a(blng.class, blng);
    }

    private blng() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126971h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126971h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126963e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0003\u0001ᔈ\u0000\u0003ᐉ\u0002\u0004Л\u0006င\u0004\u0007ဉ\u0005", new Object[]{"f", "g", "a", "b", blni.class, "c", "d"});
        } else if (i2 == 3) {
            return new blng();
        } else {
            if (i2 == 4) {
                return new bxvd(f126963e);
            }
            if (i2 == 5) {
                return f126963e;
            }
            bxxk bxxk = f126964i;
            if (bxxk == null) {
                synchronized (blng.class) {
                    bxxk = f126964i;
                    if (bxxk == null) {
                        bxxk = new bxve(f126963e);
                        f126964i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
