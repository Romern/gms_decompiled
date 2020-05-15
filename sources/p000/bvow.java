package p000;

/* renamed from: bvow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvow extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvow f157230c;

    /* renamed from: d */
    private static volatile bxxk f157231d;

    /* renamed from: a */
    public int f157232a;

    /* renamed from: b */
    public String f157233b = "";

    static {
        bvow bvow = new bvow();
        f157230c = bvow;
        bxvk.m124024a(bvow.class, bvow);
    }

    private bvow() {
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
            return bxvk.m124022a(f157230c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvow();
        } else {
            if (i2 == 4) {
                return new bxvd(f157230c);
            }
            if (i2 == 5) {
                return f157230c;
            }
            bxxk bxxk = f157231d;
            if (bxxk == null) {
                synchronized (bvow.class) {
                    bxxk = f157231d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157230c);
                        f157231d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
