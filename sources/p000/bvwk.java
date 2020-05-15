package p000;

/* renamed from: bvwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvwk f157947c;

    /* renamed from: d */
    private static volatile bxxk f157948d;

    /* renamed from: a */
    public int f157949a;

    /* renamed from: b */
    public int f157950b;

    static {
        bvwk bvwk = new bvwk();
        f157947c = bvwk;
        bxvk.m124024a(bvwk.class, bvwk);
    }

    private bvwk() {
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
            return bxvk.m124022a(f157947c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bvwk();
        } else {
            if (i2 == 4) {
                return new bxvd(f157947c);
            }
            if (i2 == 5) {
                return f157947c;
            }
            bxxk bxxk = f157948d;
            if (bxxk == null) {
                synchronized (bvwk.class) {
                    bxxk = f157948d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157947c);
                        f157948d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
