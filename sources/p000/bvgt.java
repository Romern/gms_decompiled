package p000;

/* renamed from: bvgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvgt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvgt f156041c;

    /* renamed from: d */
    private static volatile bxxk f156042d;

    /* renamed from: a */
    public int f156043a;

    /* renamed from: b */
    public String f156044b = "";

    static {
        bvgt bvgt = new bvgt();
        f156041c = bvgt;
        bxvk.m124024a(bvgt.class, bvgt);
    }

    private bvgt() {
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
            return bxvk.m124022a(f156041c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvgt();
        } else {
            if (i2 == 4) {
                return new bxvd(f156041c);
            }
            if (i2 == 5) {
                return f156041c;
            }
            bxxk bxxk = f156042d;
            if (bxxk == null) {
                synchronized (bvgt.class) {
                    bxxk = f156042d;
                    if (bxxk == null) {
                        bxxk = new bxve(f156041c);
                        f156042d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
