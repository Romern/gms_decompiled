package p000;

/* renamed from: bmls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmls extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmls f129958b;

    /* renamed from: d */
    private static volatile bxxk f129959d;

    /* renamed from: a */
    public int f129960a;

    /* renamed from: c */
    private int f129961c;

    static {
        bmls bmls = new bmls();
        f129958b = bmls;
        bxvk.m124024a(bmls.class, bmls);
    }

    private bmls() {
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
            return bxvk.m124022a(f129958b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bmlq.f129957a});
        } else if (i2 == 3) {
            return new bmls();
        } else {
            if (i2 == 4) {
                return new bxvd(f129958b);
            }
            if (i2 == 5) {
                return f129958b;
            }
            bxxk bxxk = f129959d;
            if (bxxk == null) {
                synchronized (bmls.class) {
                    bxxk = f129959d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129958b);
                        f129959d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
