package p000;

/* renamed from: bldd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldd extends bxvg implements bxvh {

    /* renamed from: a */
    public static final bldd f126046a;

    /* renamed from: c */
    private static volatile bxxk f126047c;

    /* renamed from: b */
    private byte f126048b = 2;

    static {
        bldd bldd = new bldd();
        f126046a = bldd;
        bxvk.m124024a(bldd.class, bldd);
    }

    private bldd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126048b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f126048b = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126046a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bldd();
            }
            if (i2 == 4) {
                return new bxvf(f126046a);
            }
            if (i2 == 5) {
                return f126046a;
            }
            bxxk bxxk = f126047c;
            if (bxxk == null) {
                synchronized (bldd.class) {
                    bxxk = f126047c;
                    if (bxxk == null) {
                        bxxk = new bxve(f126046a);
                        f126047c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
