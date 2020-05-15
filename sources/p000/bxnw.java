package p000;

/* renamed from: bxnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxnw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxnw f164101b;

    /* renamed from: c */
    public static final bxvj f164102c;

    /* renamed from: d */
    private static volatile bxxk f164103d;

    /* renamed from: a */
    public bxwc f164104a = bxxn.f165040b;

    static {
        bxnw bxnw = new bxnw();
        f164101b = bxnw;
        bxvk.m124024a(bxnw.class, bxnw);
        bxcf bxcf = bxcf.f162779a;
        bxnw bxnw2 = f164101b;
        f164102c = bxvk.m124006a(bxcf, bxnw2, bxnw2, 85660099, bxzf.MESSAGE);
    }

    private bxnw() {
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
            return bxvk.m124022a(f164101b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bxnx.class});
        } else if (i2 == 3) {
            return new bxnw();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f164101b;
            }
            bxxk bxxk = f164103d;
            if (bxxk == null) {
                synchronized (bxnw.class) {
                    bxxk = f164103d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164101b);
                        f164103d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
