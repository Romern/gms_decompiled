package p000;

/* renamed from: bxph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxph extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxph f164267b;

    /* renamed from: c */
    private static volatile bxxk f164268c;

    /* renamed from: a */
    public bxwc f164269a = bxxn.f165040b;

    static {
        bxph bxph = new bxph();
        f164267b = bxph;
        bxvk.m124024a(bxph.class, bxph);
    }

    private bxph() {
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
            return bxvk.m124022a(f164267b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bxph();
        } else {
            if (i2 == 4) {
                return new bxvd(f164267b);
            }
            if (i2 == 5) {
                return f164267b;
            }
            bxxk bxxk = f164268c;
            if (bxxk == null) {
                synchronized (bxph.class) {
                    bxxk = f164268c;
                    if (bxxk == null) {
                        bxxk = new bxve(f164267b);
                        f164268c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
