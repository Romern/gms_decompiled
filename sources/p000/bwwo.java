package p000;

/* renamed from: bwwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwwo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwwo f161269d;

    /* renamed from: e */
    public static final bxvj f161270e;

    /* renamed from: f */
    private static volatile bxxk f161271f;

    /* renamed from: a */
    public int f161272a;

    /* renamed from: b */
    public String f161273b = "";

    /* renamed from: c */
    public bxvt f161274c = bxvm.f164965b;

    static {
        bwwo bwwo = new bwwo();
        f161269d = bwwo;
        bxvk.m124024a(bwwo.class, bwwo);
        bwog bwog = bwog.f160437f;
        bwwo bwwo2 = f161269d;
        f161270e = bxvk.m124006a(bwog, bwwo2, bwwo2, 235650858, bxzf.MESSAGE);
    }

    private bwwo() {
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
            return bxvk.m124022a(f161269d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwwo();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f161269d;
            }
            bxxk bxxk = f161271f;
            if (bxxk == null) {
                synchronized (bwwo.class) {
                    bxxk = f161271f;
                    if (bxxk == null) {
                        bxxk = new bxve(f161269d);
                        f161271f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
