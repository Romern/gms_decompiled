package p000;

/* renamed from: bwnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwnw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwnw f160404d;

    /* renamed from: e */
    public static final bxvj f160405e;

    /* renamed from: f */
    private static volatile bxxk f160406f;

    /* renamed from: a */
    public int f160407a;

    /* renamed from: b */
    public int f160408b;

    /* renamed from: c */
    public String f160409c = "";

    static {
        bwnw bwnw = new bwnw();
        f160404d = bwnw;
        bxvk.m124024a(bwnw.class, bwnw);
        bwog bwog = bwog.f160437f;
        bwnw bwnw2 = f160404d;
        f160405e = bxvk.m124006a(bwog, bwnw2, bwnw2, 265162537, bxzf.MESSAGE);
    }

    private bwnw() {
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
            return bxvk.m124022a(f160404d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u0002င\u0000", new Object[]{"a", "c", "b"});
        } else if (i2 == 3) {
            return new bwnw();
        } else {
            if (i2 == 4) {
                return new bxvd(f160404d);
            }
            if (i2 == 5) {
                return f160404d;
            }
            bxxk bxxk = f160406f;
            if (bxxk == null) {
                synchronized (bwnw.class) {
                    bxxk = f160406f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160404d);
                        f160406f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
