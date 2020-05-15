package p000;

/* renamed from: bvye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvye extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bvye f158143b;

    /* renamed from: d */
    private static volatile bxxk f158144d;

    /* renamed from: a */
    public bvxs f158145a;

    /* renamed from: c */
    private int f158146c;

    static {
        bvye bvye = new bvye();
        f158143b = bvye;
        bxvk.m124024a(bvye.class, bvye);
    }

    private bvye() {
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
            return bxvk.m124022a(f158143b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bvye();
        } else {
            if (i2 == 4) {
                return new bxvd(f158143b);
            }
            if (i2 == 5) {
                return f158143b;
            }
            bxxk bxxk = f158144d;
            if (bxxk == null) {
                synchronized (bvye.class) {
                    bxxk = f158144d;
                    if (bxxk == null) {
                        bxxk = new bxve(f158143b);
                        f158144d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
